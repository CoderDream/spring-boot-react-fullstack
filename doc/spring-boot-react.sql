/*
 Navicat Premium Data Transfer

 Source Server         : Windows11-docker
 Source Server Type    : MySQL
 Source Server Version : 80038
 Source Host           : localhost:3306
 Source Schema         : spring-boot-react

 Target Server Type    : MySQL
 Target Server Version : 80038
 File Encoding         : 65001

 Date: 26/10/2024 10:54:49
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for client
-- ----------------------------
DROP TABLE IF EXISTS `client`;
CREATE TABLE `client`  (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL,
  `email` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of client
-- ----------------------------
INSERT INTO `client` VALUES (1, 'abc', 'abc@gmail.com');
INSERT INTO `client` VALUES (2, 'abc', 'abc@gmail.com');
INSERT INTO `client` VALUES (3, 'abc', 'abc@gmail.com');
INSERT INTO `client` VALUES (4, 'abc', 'abc@gmail.com');
INSERT INTO `client` VALUES (5, 'abc', 'abc@gmail.com');
INSERT INTO `client` VALUES (6, 'abc', 'abc@gmail.com');
INSERT INTO `client` VALUES (7, 'abc', 'abc@gmail.com');
INSERT INTO `client` VALUES (8, 'abc', 'abc@gmail.com');
INSERT INTO `client` VALUES (9, 'abc', 'abc@gmail.com');
INSERT INTO `client` VALUES (10, 'abc', 'abc@gmail.com');
INSERT INTO `client` VALUES (11, 'abc', 'abc@gmail.com');
INSERT INTO `client` VALUES (12, 'abc', 'abc@gmail.com');
INSERT INTO `client` VALUES (13, 'abc', 'abc@gmail.com');
INSERT INTO `client` VALUES (14, 'abc', 'abc@gmail.com');
INSERT INTO `client` VALUES (15, 'abc', 'abc@gmail.com');
INSERT INTO `client` VALUES (16, 'abc', 'abc@gmail.com');
INSERT INTO `client` VALUES (17, 'abc', 'abc@gmail.com');
INSERT INTO `client` VALUES (18, 'abc', 'abc@gmail.com');
INSERT INTO `client` VALUES (19, 'abc', 'abc@gmail.com');
INSERT INTO `client` VALUES (20, 'abc', 'abc@gmail.com');
INSERT INTO `client` VALUES (21, 'abc', 'abc@gmail.com');
INSERT INTO `client` VALUES (22, 'abc', 'abc@gmail.com');
INSERT INTO `client` VALUES (23, 'abc', 'abc@gmail.com');
INSERT INTO `client` VALUES (24, 'abc', 'abc@gmail.com');

SET FOREIGN_KEY_CHECKS = 1;
