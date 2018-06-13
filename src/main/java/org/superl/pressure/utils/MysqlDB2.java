package org.superl.pressure.utils;

import lombok.extern.log4j.Log4j;
import org.superl.pressure.data.TestData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
    PressureTest
    Created by superl[N.S.T] on 2018/6/13.
                                                                      00000
                                                                      00000
                                                                      00000
      00000000    00000  00000  00000000000     00000000    000000000 00000
     00000000000  00000  00000  000000000000   00000000000  000000000 00000
     00000  000   00000  00000  000000 00000  000000 00000  00000000  00000
     000000000    00000  00000  00000   0000  0000000000000 000000    00000
      0000000000  00000  00000  00000   00000 0000000000000 00000     00000
         0000000  00000  00000  00000   00000 00000         00000     00000
     00000  0000  000000000000  000000000000  000000000000  00000     00000
     00000000000  000000000000  000000000000   00000000000  00000     00000
      000000000   0000000000    00000000000     00000000    00000     00000
                                00000
                                00000                   Blog:www.superl.org
                                00000
*/

@Log4j
public class MysqlDB2 {

    private final String MYSQL_URL = "jdbc:mysql://127.0.0.1:3306/hedata?serverTimezone=UTC&characterEncoding=utf8&useSSL=false&autoReconnect=true";
    private final String MYSQL_NAME = "superl";
    private final String MYSQL_PASSWORD = "password";
    private Connection conn = null;

    public void getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //log.debug("Start Connect Mysql Database...");
            conn = DriverManager.getConnection(MYSQL_URL,MYSQL_NAME, MYSQL_PASSWORD);
        } catch (ClassNotFoundException e) {
            log.debug("Connect Mysql Database Error..."+e.getMessage());
            e.printStackTrace();
        } catch (SQLException e) {
            log.debug("Connect Mysql Database Error..."+e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * 添加数据库记录
     *
     * @param insertData 某数据库表相关字段对应的类实例
     */
    public void insertTest(TestData insertData)  {
        String symbol = insertData.getSymbol();
        String insert_sql = "insert into TICKER_"+symbol+"(`open`,`close`,`high`,`low`,`trades`,`volume`,`timestamp`)values(?,?,?,?,?,?,?)";
        try{
            if(conn==null){
                this.getConnection();
            }

            PreparedStatement pstmt = conn.prepareStatement(insert_sql);
            pstmt.setDouble(1, insertData.getOpen());
            pstmt.setDouble(2, insertData.getClose());
            pstmt.setDouble(3, insertData.getHigh());
            pstmt.setDouble(4, insertData.getLow());
            pstmt.setInt(5, insertData.getTrades());
            pstmt.setDouble(6, insertData.getVolume());
            pstmt.setString(7, insertData.getTimestamp());
            pstmt.execute();
            //conn.commit();
        }catch (Exception e1){
            log.error(e1.getMessage());
            try {
                conn.close();
            } catch (SQLException e2) {
                log.error(e2.getMessage());
            }
        }
    }

}
