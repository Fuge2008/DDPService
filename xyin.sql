/*
Navicat MySQL Data Transfer

Source Server         : haoji
Source Server Version : 50096
Source Host           : localhost:3306
Source Database       : haoji

Target Server Type    : MYSQL
Target Server Version : 50096
File Encoding         : 65001

Date: 2017-11-14 17:18:41
*/
create database haoji DEFAULT CHARSET utf8 COLLATE utf8_general_ci;
use haoji;
SET FOREIGN_KEY_CHECKS=0;


-- ----------------------------
-- Table structure for `comment`
-- ----------------------------
DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment` (
  `id` int(20) NOT NULL auto_increment,
  `energyid` varchar(32) default NULL,
  `place` varchar(50) default NULL,
  `praisenum` int(6) default NULL,
  `praiseuser` varchar(32) default NULL,
  `content` varchar(500) default NULL,
  `updatetime` timestamp NULL default NULL,
  `userid` varchar(32) default NULL,
  `type` int(11) default NULL,
  `isread` varchar(10) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3389 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of comment
-- ----------------------------

INSERT INTO `comment` VALUES ('107', '741', null, null, null, '不得不说吧', '2017-02-27 20:00:18', 'admin', '1', '1');
INSERT INTO `comment` VALUES ('3388', '1792', '', null, null, '说得好', '2017-10-18 08:39:28', '2017090617361913672780753', '1', '1');

-- ----------------------------
-- Table structure for `concern`
-- ----------------------------
DROP TABLE IF EXISTS `concern`;
CREATE TABLE `concern` (
  `id` int(20) NOT NULL auto_increment,
  `userid` varchar(32) default NULL,
  `friendid` varchar(32) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=93 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of concern
-- ----------------------------
INSERT INTO `concern` VALUES ('92', '2017022820140117680729566', '2017030914332813760432324');

-- ----------------------------
-- Table structure for `defaultmsg`
-- ----------------------------
DROP TABLE IF EXISTS `defaultmsg`;
CREATE TABLE `defaultmsg` (
  `userid` varchar(32) NOT NULL,
  `updatetime` date default NULL,
  PRIMARY KEY  (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of defaultmsg
-- ----------------------------

INSERT INTO `defaultmsg` VALUES ('2017111211142215274835399', '2017-11-12');
INSERT INTO `defaultmsg` VALUES ('2017111417082713669457578', '2017-11-14');

-- ----------------------------
-- Table structure for `diary`
-- ----------------------------
DROP TABLE IF EXISTS `diary`;
CREATE TABLE `diary` (
  `id` int(20) NOT NULL auto_increment,
  `title` varchar(50) default NULL,
  `name` varchar(100) default NULL,
  `content` varchar(21000) default NULL,
  `pics` varchar(500) default NULL,
  `userid` varchar(32) default NULL,
  `updatetime` timestamp NULL default NULL,
  `browernum` int(10) default NULL,
  `province` varchar(32) default NULL,
  `city` varchar(32) default NULL,
  `universityid` varchar(32) default NULL,
  `praisenum` int(10) default NULL,
  `favoritenum` int(10) default NULL,
  `score` int(10) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of diary
-- ----------------------------


-- ----------------------------
-- Table structure for `energy`
-- ----------------------------
DROP TABLE IF EXISTS `energy`;
CREATE TABLE `energy` (
  `id` int(20) NOT NULL auto_increment,
  `updatetime` timestamp NULL default NULL,
  `title` varchar(50) default NULL,
  `content` varchar(4000) default NULL,
  `userid` varchar(32) default NULL,
  `praisenum` int(10) default '0',
  `score` int(10) default '0',
  `browsenum` int(10) default '0',
  `pic1` varchar(500) default NULL,
  `pic2` varchar(500) default NULL,
  `pic3` varchar(500) default NULL,
  `place` varchar(100) default NULL COMMENT '发言地点',
  `favoritenum` int(10) default NULL,
  `pic4` varchar(500) default NULL,
  `pic5` varchar(500) default NULL,
  `pic6` varchar(500) default NULL,
  `pic7` varchar(500) default NULL,
  `pic8` varchar(500) default NULL,
  `pic9` varchar(500) default NULL,
  `issee` int(1) default '1',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1819 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of energy
-- ----------------------------

INSERT INTO `energy` VALUES ('746', '2017-03-26 07:28:38', '泰戈尔名言', '生如夏花之绚烂，死如秋叶之静美。', '2017021509351413705514326', '1', '3', '27', null, null, null, null, '0', null, null, null, null, null, null, '1');
INSERT INTO `energy` VALUES ('747', '2017-03-26 07:29:59', '雨果名言警句', '谁虚度年华，青春就要褪色，生命就会抛弃他们。', '2017021509351413705514326', '2', '2', '33', null, null, null, null, '0', null, null, null, null, null, null, '1');
INSERT INTO `energy` VALUES ('748', '2017-03-26 07:35:53', '法国蒙田名言', '生命的价值不在于活了多少天，而在于我们如何使用这些日子。', '2017021509351413705514326', '1', '4', '27', null, null, null, null, '1', null, null, null, null, null, null, '1');
INSERT INTO `energy` VALUES ('756', '2017-03-26 08:07:05', '行难事，必有得', '行难事，必有得', '2017021509351413705514326', '1', '1', '53', '2017030508070439127.jpg', null, null, null, '0', null, null, null, null, null, null, '1');
INSERT INTO `energy` VALUES ('761', '2017-03-26 12:40:23', '热爱生活', '世上只有一种英雄主义，就是在认清生活真相之后依然热爱生活。', '2017021509351413705514326', '1', '4', '11', null, null, null, null, '1', null, null, null, null, null, null, '1');
INSERT INTO `energy` VALUES ('762', '2017-03-26 12:55:06', '要想赢', '要想赢，就一定不能怕输。不怕输，结果未必能赢。但是怕输，结果则一定是输。', '2017021509351413705514326', '3', '4', '17', null, null, null, null, '1', null, null, null, null, null, null, '1');
INSERT INTO `energy` VALUES ('763', '2017-03-26 12:56:31', '励志语录', '每颗珍珠原本都是一粒沙子，但并不是每一粒沙子都能成为一颗珍珠。想要卓尔不群，就要有鹤立鸡群的资本。忍受不了打击和挫折，承受不住忽视和平淡，就很难达到辉煌。年轻人要想让自己得到重用，取得成功，就必须把自己从一粒沙子变成一颗价值连城的珍珠。', '2017021509351413705514326', '2', '8', '30', null, null, null, null, '2', null, null, null, null, null, null, '1');

-- ----------------------------
-- Table structure for `favorite`
-- ----------------------------
DROP TABLE IF EXISTS `favorite`;
CREATE TABLE `favorite` (
  `id` int(20) NOT NULL auto_increment,
  `userid` varchar(32) default NULL,
  `engfavid` varchar(32) default NULL,
  `updatetime` timestamp NULL default NULL on update CURRENT_TIMESTAMP,
  `type` int(11) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2851 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of favorite
-- ----------------------------

INSERT INTO `favorite` VALUES ('300', '2017021509351413705514326', '891', '2017-05-22 19:44:48', '1');
INSERT INTO `favorite` VALUES ('301', '2017021509351413705514326', '1272', '2017-05-22 19:45:41', '1');
INSERT INTO `favorite` VALUES ('305', '2017041209560913672780687', '1274', '2017-05-23 13:34:23', '1');


-- ----------------------------
-- Table structure for `feedback`
-- ----------------------------
DROP TABLE IF EXISTS `feedback`;
CREATE TABLE `feedback` (
  `id` int(20) NOT NULL auto_increment,
  `info` varchar(200) default NULL,
  `pic1` varchar(100) default NULL,
  `pic2` varchar(100) default NULL,
  `pic3` varchar(100) default NULL,
  `pic4` varchar(100) default NULL,
  `opiniontype` varchar(50) default NULL,
  `userid` varchar(32) default NULL,
  `updatetime` timestamp NULL default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=53 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of feedback

INSERT INTO `feedback` VALUES ('30', '吼吼吼吼', '2017072616505872536.jpg', '2017072616505844407.jpg', '2017072616505864208.jpg', '2017072616505812488.jpg', '1,3,4,5,7,8', '2017041209560913672780687', '2017-07-26 16:51:07');
INSERT INTO `feedback` VALUES ('34', null, null, null, null, null, '1,2,3,4,5,6,7,8', '2017041209560913672780687', '2017-08-17 11:52:22');

-- ----------------------------
-- Table structure for `friend`
-- ----------------------------
DROP TABLE IF EXISTS `friend`;
CREATE TABLE `friend` (
  `id` int(20) NOT NULL auto_increment,
  `userid` varchar(32) default NULL,
  `friendid` varchar(32) default NULL,
  `friendclass` int(2) default NULL,
  `tag` varchar(50) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2914 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of friend
-- ----------------------------
INSERT INTO `friend` VALUES ('33', '2017022820140117680729566', '2017021509351413705514326', '0', '我的好友');
INSERT INTO `friend` VALUES ('34', '2017021509351413705514326', '2017022820140117680729566', '0', '我的好友');


-- ----------------------------
-- Table structure for `log`
-- ----------------------------
DROP TABLE IF EXISTS `log`;
CREATE TABLE `log` (
  `id` int(20) NOT NULL auto_increment,
  `userid` varchar(32) default NULL,
  `updatetime` timestamp NULL default NULL on update CURRENT_TIMESTAMP,
  `content` varchar(100) default NULL,
  `type` int(2) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3420 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of log
-- ----------------------------
INSERT INTO `log` VALUES ('1', '2017021509351413705514326', '2017-09-22 21:59:55', null, '1');


-- Table structure for `praise`
-- ----------------------------
DROP TABLE IF EXISTS `praise`;
CREATE TABLE `praise` (
  `id` int(20) NOT NULL auto_increment,
  `energyid` varchar(32) default NULL,
  `praiseuser` varchar(32) default NULL,
  `updatetime` timestamp NULL default NULL on update CURRENT_TIMESTAMP,
  `type` int(11) default NULL,
  `isread` varchar(10) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3251 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of praise
-- ----------------------------
INSERT INTO `praise` VALUES ('51', '588', 'admin', '2017-05-22 16:05:52', '1', '1');
INSERT INTO `praise` VALUES ('72', '745', '2017022820140117680729566', '2017-05-22 16:05:52', '1', '1');


-- Table structure for `sysinfo`
-- ----------------------------
DROP TABLE IF EXISTS `sysinfo`;
CREATE TABLE `sysinfo` (
  `id` int(20) NOT NULL auto_increment,
  `ouserid` varchar(60) default NULL COMMENT '发起人id',
  `duserid` varchar(60) default NULL COMMENT '接收人id',
  `content` varchar(200) default NULL COMMENT '信息内容',
  `relevantresults` varchar(10) default NULL COMMENT '关联信息处理结果：0、同意1、不同意',
  `updatetime` timestamp NULL default NULL,
  `infotype` varchar(10) default NULL COMMENT '信息种类：1、好友验证2、群组验证',
  `oisread` varchar(10) default NULL,
  `disread` varchar(10) default NULL,
  `remark` varchar(200) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=118 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sysinfo
-- ----------------------------
INSERT INTO `sysinfo` VALUES ('12', 'admin', 'admin', 'admin加admin为好友', '0', '2017-02-08 16:22:38', '1', '0', '1', null);


-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `userid` varchar(32) NOT NULL,
  `username` varchar(100) default NULL,
  `sex` int(1) default NULL COMMENT '1、男2、女',
  `nickname` varchar(100) default NULL,
  `password` varchar(32) default NULL,
  `realname` varchar(20) default NULL,
  `birthday` date default NULL,
  `phone` varchar(15) default NULL,
  `college` varchar(32) default NULL COMMENT '学院',
  `major` varchar(32) default NULL COMMENT '专业',
  `province` varchar(30) default NULL,
  `city` varchar(30) default NULL,
  `zone` varchar(30) default NULL,
  `pic` varchar(50) default NULL,
  `token` varchar(200) default NULL,
  `lastlogintime` timestamp NULL default NULL,
  `updatetime` timestamp NULL default NULL,
  `registertime` timestamp NULL default NULL,
  `lastloginip` varchar(30) default NULL,
  `identity` int(1) default NULL COMMENT '用户类型1、管理用户2、运营用户3、普通用户',
  `class` varchar(50) default NULL COMMENT '班级',
  `studentid` varchar(50) default NULL COMMENT '学号',
  `university` varchar(32) default NULL,
  `motto` varchar(500) default NULL,
  `thirduserid` varchar(100) default NULL,
  `introducer` varchar(15) default NULL,
  PRIMARY KEY  (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('2017021509351413705514326', '13705514326', '1', '增值课', '840803', '叶杨', '1984-07-07', '13705514326', '40', '538', '山东省', '济南市', '济南市', '2017022720032155909.jpg', '5bwdOtFzL5P2jODUDICe1/TUHLHIUDq/91ko47h63Wo3W85sPYqvw3fZp30PTamvoGS8iMnhwMhcFdc3OoB1+ztW35YyXhCdV+aw2GtoY0UhQ6/sM+t6n1Mkg2OO/nWf', '2017-10-28 14:33:29', '2017-09-10 21:03:16', '2017-02-15 09:35:14', null, '3', null, null, '1305', '国际处-联络办公厅-好记增值事务课', null, '');

-- ----------------------------
-- Table structure for `video`
-- ----------------------------
DROP TABLE IF EXISTS `video`;
CREATE TABLE `video` (
  `id` int(20) NOT NULL auto_increment,
  `videotitle` varchar(50) default NULL,
  `videoname` varchar(100) default NULL,
  `videocontent` varchar(200) default NULL,
  `videourl` varchar(300) default NULL,
  `userid` varchar(32) default NULL,
  `updatetime` timestamp NULL default NULL,
  `browernum` int(10) default NULL,
  `province` varchar(32) default NULL,
  `city` varchar(32) default NULL,
  `universityid` varchar(32) default NULL,
  `videopic` varchar(100) default NULL,
  `praisenum` int(10) default NULL,
  `favoritenum` int(10) default NULL,
  `score` int(10) default NULL,
  `videoclass` int(2) default '0',
  `videoduration` varchar(10) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=154 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of video
-- ----------------------------
INSERT INTO `video` VALUES ('54', '上海超过纽约 美国急需一场改革', '国际政治-金融经济', '网络点击已经上亿的视频，我还有什么话好说。张维为教授以他行走100余个国家的经历得出结论：中国不害怕国际竞争，尤其不害怕制度竞争。像我们这种大国，看问题一定要有一个整体观，一定要有超前意识，这样看问题才看的远，看得准。', 'http://hao-ji.cn/d7745eaa6f2f4ce99539da6ada3787c7/d5c9a078a0084f01997ba5026252eff3-5287d2089db37e62345123a1be272f8b.mp4', 'admin', '2017-08-30 10:45:02', '78', '山东省', '济南市', null, 'haojiftp/20170830/2017083020455367983.jpg', '3', null, '3', '1', '40:19');
