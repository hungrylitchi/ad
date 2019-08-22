DROP TABLE IF EXISTS `ad_user`;
CREATE TABLE `ad_user` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(64) NOT NULL DEFAULT '' COMMENT '用户名',
  `token` varchar(64) NOT NULL DEFAULT '' COMMENT 'token',
  `create_time` int(11) unsigned DEFAULT '0',
  `update_time` int(11) unsigned DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `username` (`username`)
) ENGINE=InnoDB COMMENT='用户表';

DROP TABLE IF EXISTS `ad_plan`;
CREATE TABLE `ad_plan` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` bigint(20) unsigned NOT NULL COMMENT '用户id',
  `plan_name` varchar(255) NOT NULL DEFAULT '' COMMENT '计划名称',
  `plan_status` tinyint(4) DEFAULT NULL COMMENT '计划状态',
  `start_date` int(10) unsigned NOT NULL DEFAULT '0' COMMENT '开始时间',
  `end_date` int(10) unsigned NOT NULL DEFAULT '0' COMMENT '结束时间',
  `create_time` int(10) unsigned NOT NULL DEFAULT '0',
  `update_time` int(10) unsigned NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `user_id` (`user_id`),
  KEY `start_date` (`start_date`,`end_date`,`plan_status`) USING BTREE
) ENGINE=InnoDB COMMENT='广告计划表';

DROP TABLE IF EXISTS `ad_unit`;
CREATE TABLE `ad_unit` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `plan_id` bigint(20) NOT NULL COMMENT '计划id',
  `unit_name` varchar(128) NOT NULL DEFAULT '' COMMENT '单元名称',
  `unit_status` tinyint(4) NOT NULL DEFAULT '1' COMMENT '单元状态',
  `position_type` tinyint(4) NOT NULL COMMENT '位置类型',
  `budget` bigint(20) unsigned NOT NULL DEFAULT '0' COMMENT '预算',
  `creat_time` int(10) unsigned NOT NULL DEFAULT '0',
  `update_time` int(10) unsigned NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `plan_id` (`plan_id`)
) ENGINE=InnoDB COMMENT='广告单元表';

DROP TABLE IF EXISTS `ad_unit_it`;
CREATE TABLE `ad_unit_it` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `unit_id` bigint(20) NOT NULL COMMENT '单元id',
  `it_tag` varchar(128) NOT NULL DEFAULT '' COMMENT '关键字',
  `creat_time` int(11) unsigned NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB COMMENT='广告单元兴趣限制表';

DROP TABLE IF EXISTS `ad_unit_keyword`;
CREATE TABLE `ad_unit_keyword` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `unit_id` bigint(20) NOT NULL COMMENT '单元id',
  `keyword` varchar(128) NOT NULL DEFAULT '' COMMENT '关键字',
  `creat_time` int(11) unsigned NOT NULL DEFAULT '0',
  `update_time` int(11) unsigned NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB COMMENT='广告单元限制表';

DROP TABLE IF EXISTS ad_creative;
CREATE TABLE `ad_creative` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(128) NOT NULL DEFAULT '' COMMENT '创意名称',
  `type` tinyint(4) NOT NULL COMMENT '创意类型',
  `materia_type` tinyint(4) NOT NULL DEFAULT '1' COMMENT '物料类型',
  `height` int(11) unsigned NOT NULL DEFAULT '0' COMMENT '物料尺寸高',
  `width` int(11) unsigned NOT NULL DEFAULT '0' COMMENT '物料尺寸宽',
  `size` bigint(20) unsigned NOT NULL DEFAULT '0' COMMENT '物料大小',
  `duration` bigint(20) unsigned NOT NULL DEFAULT '0' COMMENT '物料持续时间',
  `url` varchar(128) NOT NULL DEFAULT '' COMMENT '物料所在地址',
  `audit_status` tinyint(4) NOT NULL DEFAULT '0' COMMENT '审核状态',
  `user_id` bigint(20) unsigned NOT NULL COMMENT '上传用户ID',
  `creat_time` int(11) unsigned NOT NULL DEFAULT '0',
  `update_time` int(11) unsigned NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) COMMENT='广告创意表';