/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50096
Source Host           : localhost:3306
Source Database       : task

Target Server Type    : MYSQL
Target Server Version : 50096
File Encoding         : 65001

Date: 2017-07-21 18:21:30
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `province`
-- ----------------------------
DROP TABLE IF EXISTS `province`;
CREATE TABLE `province` (
  `id` varchar(40) NOT NULL,
  `pname` varchar(50) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of province
-- ----------------------------
INSERT INTO `province` VALUES ('1', '河北省');
INSERT INTO `province` VALUES ('10', '江西省');
INSERT INTO `province` VALUES ('11', '山东省');
INSERT INTO `province` VALUES ('12', '河南省');
INSERT INTO `province` VALUES ('13', '湖北省');
INSERT INTO `province` VALUES ('14', '湖南省');
INSERT INTO `province` VALUES ('15', '广东省');
INSERT INTO `province` VALUES ('16', '海南省');
INSERT INTO `province` VALUES ('17', '四川省');
INSERT INTO `province` VALUES ('18', '贵州省');
INSERT INTO `province` VALUES ('19', '云南省');
INSERT INTO `province` VALUES ('2', '山西省');
INSERT INTO `province` VALUES ('20', '陕西省');
INSERT INTO `province` VALUES ('21', '甘肃省');
INSERT INTO `province` VALUES ('22', '青海省');
INSERT INTO `province` VALUES ('23', '台湾省');
INSERT INTO `province` VALUES ('3', '辽宁省');
INSERT INTO `province` VALUES ('4', '吉林省');
INSERT INTO `province` VALUES ('5', '黑龙江省');
INSERT INTO `province` VALUES ('6', '江苏省');
INSERT INTO `province` VALUES ('7', '浙江省');
INSERT INTO `province` VALUES ('8', '安徽省');
INSERT INTO `province` VALUES ('9', '福建省');

-- ----------------------------
-- Table structure for `rs00_rsbase`
-- ----------------------------
DROP TABLE IF EXISTS `rs00_rsbase`;
CREATE TABLE `rs00_rsbase` (
  `id` varchar(40) NOT NULL COMMENT 'ID',
  `reNamee` varchar(40) default NULL COMMENT '水库名称',
  `reNameCode` varchar(40) default NULL COMMENT '水库名称代码',
  `rsType` varchar(50) default NULL COMMENT '水库类型\r\n1、大型\r\n2、中型\r\n3、小型',
  `total_strg_cpct` int(15) default NULL COMMENT '总库容',
  `localProvince` varchar(50) default NULL COMMENT '水库坝址所在地_省',
  `localCity` varchar(50) default NULL COMMENT '水库坝址所在地_市',
  `localCounty` varchar(50) default NULL COMMENT '水库坝址所在地_县',
  `localTown` varchar(50) default NULL COMMENT '水库坝址所在地_乡',
  `localVillage` varchar(50) default NULL COMMENT '水库坝址所在地_村',
  `localCode` varchar(40) default NULL COMMENT '坝址所在地行政区划代码',
  `idProvince` varchar(40) default NULL COMMENT '水库所属省份id',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of rs00_rsbase
-- ----------------------------
INSERT INTO `rs00_rsbase` VALUES ('075a2f0a-20fe-44ed-92f7-f156aff4856d', '湖南水库1', 'b002', '2', '123', '湖南省', '长沙市', '某区', '某乡', '某村', '232', '14');
INSERT INTO `rs00_rsbase` VALUES ('16546b42-edae-4ef1-beb7-b447c17bc82c', '山东水库1', 'c002', '3', '222', '山东省', '济南市', '某区', '某乡', '某村', '222', '11');
INSERT INTO `rs00_rsbase` VALUES ('24b78ca7-a877-4daa-9974-f3fce7798c6a', '福建省水库1', 'd034', '2', '33', '福建省', '福建某市', '某区', '某乡', '某村', '2.2222222E7', '9');
INSERT INTO `rs00_rsbase` VALUES ('6ec3a367-9c79-4a0f-86b7-59296a8f960a', '云南水库2', 'd007', '3', '40', '云南省', '大理市', '某区', '某乡', '某村', '4444', '19');
INSERT INTO `rs00_rsbase` VALUES ('9327c0c9-b8db-400b-bc87-437cb894520d', '山东水库2', 'c005', '1', '444', '山东省', '济南市', '某区', '某乡', '某村', '111', '11');
INSERT INTO `rs00_rsbase` VALUES ('ae9c8b2f-c567-459a-adf0-ac86fc52e405', '广东水库1', 'd004', '1', '20', '广东省', '深圳市', '某区', '某乡', '某村', '2322', '15');
INSERT INTO `rs00_rsbase` VALUES ('b7666eb8-70cc-40ad-8d2d-38cbeb39c316', '福建省水库1', 'd034', '1', '44', '福建省', '福建某市', '某区', '某乡', '某村', '333', '9');
INSERT INTO `rs00_rsbase` VALUES ('bd2ab3b3-a200-48d5-b127-155c248c1236', '塔子湖水库', 'a001', '1', '200', '湖北省', '武汉市', '洪山区', '某乡', '某村', '4678', '13');
INSERT INTO `rs00_rsbase` VALUES ('e0a0ddab-21ac-40de-b3d9-a4f3231a1da8', '三峡水库', 'a023', '2', '500', '湖北省', '武汉市', '洪山区', '某乡', '某村', '3455', '13');
