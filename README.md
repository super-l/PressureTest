<<<<<<< HEAD
### 简单说明

JAVA写的性能与压力测试工具。目前支持MYSQL的不同连接方式的并发测试！

### 数据库
```sql
CREATE TABLE `TICKER_XBTUSD` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `open` double unsigned NOT NULL,
  `close` double unsigned NOT NULL,
  `high` double unsigned NOT NULL,
  `low` double unsigned NOT NULL,
  `trades` int(11) unsigned NOT NULL,
  `volume` int(11) unsigned NOT NULL,
  `timestamp` datetime(3) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `timestamp` (`timestamp`)
) ENGINE=MyISAM AUTO_INCREMENT=14261 DEFAULT CHARSET=utf8;
```

### 不同的MYSQL数据库操作代码测试

##### 本地环境：
    程序：自己写的java压力测试工具 PressureTest
    操作系统: MacBook Pro  Core i7  16 GB
    网络：普通家用宽带

##### 服务器环境：
    vutre法国服务器 
    操作系统：Centos 7 x64  8核  32G
    与本地网络延迟:200-350ms

##### 数据库信息：
    数据库版本：MYSQL 5.7
    数据表类型：myisam

##### 1：单线程插入性能测试
##### 2：多线程共用同一个数据库连接并发插入性能测试
##### 3：多线程，每个线程一个数据库连接 并发插入性能测试

##### 详细的测试结果，等待博客改版完成后放出来。
=======
### 简单说明

JAVA写的性能与压力测试工具。目前支持MYSQL的不同连接方式的并发测试！

### 数据库
```sql
CREATE TABLE `TICKER_XBTUSD` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `open` double unsigned NOT NULL,
  `close` double unsigned NOT NULL,
  `high` double unsigned NOT NULL,
  `low` double unsigned NOT NULL,
  `trades` int(11) unsigned NOT NULL,
  `volume` int(11) unsigned NOT NULL,
  `timestamp` datetime(3) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `timestamp` (`timestamp`)
) ENGINE=MyISAM AUTO_INCREMENT=14261 DEFAULT CHARSET=utf8;
```

### 11111

>>>>>>> origin/master
