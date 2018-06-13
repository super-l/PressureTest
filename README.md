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

