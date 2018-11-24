-- 导出 mybatis 的数据库结构
CREATE DATABASE IF NOT EXISTS `mybatis` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `mybatis`;

-- 导出  表 mybatis.user 结构
CREATE TABLE IF NOT EXISTS `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `age` int(11) NOT NULL,
  `sex` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- 正在导出表  mybatis.user 的数据：3 rows
DELETE FROM `user`;

INSERT INTO `user` (`id`, `name`, `age`, `sex`) VALUES
	(1, '张三', 42, 0),
	(2, '李四', 15, 0),
	(3, '王五', 45, 0),
	(4, '赵六', 47, 0),
	(5, '孙艳', 26, 1);

