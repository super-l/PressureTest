###数据库CREATE TABLE `TICKER_XBTUSD` (  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,  `open` double unsigned NOT NULL,  `close` double unsigned NOT NULL,  `high` double unsigned NOT NULL,  `low` double unsigned NOT NULL,  `trades` int(11) unsigned NOT NULL,  `volume` int(11) unsigned NOT NULL,  `timestamp` datetime(3) NOT NULL,  PRIMARY KEY (`id`),  KEY `timestamp` (`timestamp`)) ENGINE=MyISAM AUTO_INCREMENT=14261 DEFAULT CHARSET=utf8;