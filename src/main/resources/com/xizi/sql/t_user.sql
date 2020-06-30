/*
Navicat MySQL Data Transfer

Source Server         : root
Source Server Version : 50720
Source Host           : localhost:3306
Source Database       : element-user

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2020-06-27 21:54:32
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `bir` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `sex` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
