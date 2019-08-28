insert  into `tb_permission`(`id`,`parent_id`,`name`,`enname`,`url`,`description`,`created`,`updated`) values
(37,0,'系统管理','System','/',NULL,'2019-04-04 23:22:54','2019-04-04 23:22:56'),
(38,37,'用户管理','SystemUser','/users/',NULL,'2019-04-04 23:25:31','2019-04-04 23:25:33'),
(39,38,'查看用户','SystemUserView','/users/view/**',NULL,'2019-04-04 15:30:30','2019-04-04 15:30:43'),
(40,38,'新增用户','SystemUserInsert','/users/insert/**',NULL,'2019-04-04 15:30:31','2019-04-04 15:30:44'),
(41,38,'编辑用户','SystemUserUpdate','/users/update/**',NULL,'2019-04-04 15:30:32','2019-04-04 15:30:45'),
(42,38,'删除用户','SystemUserDelete','/users/delete/**',NULL,'2019-04-04 15:30:48','2019-04-04 15:30:45'),
(44,37,'内容管理','SystemContent','/contents/',NULL,'2019-04-06 18:23:58','2019-04-06 18:24:00'),
(45,44,'查看内容','SystemContentView','/contents/view/**',NULL,'2019-04-06 23:49:39','2019-04-06 23:49:41'),
(46,44,'新增内容','SystemContentInsert','/contents/insert/**',NULL,'2019-04-06 23:51:00','2019-04-06 23:51:02'),
(47,44,'编辑内容','SystemContentUpdate','/contents/update/**',NULL,'2019-04-06 23:51:04','2019-04-06 23:51:06'),
(48,44,'删除内容','SystemContentDelete','/contents/delete/**',NULL,'2019-04-06 23:51:08','2019-04-06 23:51:10');

insert  into `tb_role`(`id`,`parent_id`,`name`,`enname`,`description`,`created`,`updated`) values
(37,0,'超级管理员','admin',NULL,'2019-04-04 23:22:03','2019-04-04 23:22:05');


insert  into `tb_role_permission`(`id`,`role_id`,`permission_id`) values
(37,37,37),
(38,37,38),
(39,37,39),
(40,37,40),
(41,37,41),
(42,37,42),
(43,37,44),
(44,37,45),
(45,37,46),
(46,37,47),
(47,37,48);

insert  into `tb_user`(`id`,`username`,`password`,`phone`,`email`,`created`,`updated`) values
(37,'admin','$2a$10$9ZhDOBp.sRKat4l14ygu/.LscxrMUcDAfeVOEPiYwbcRkoB09gCmi','15888888888','lee.lusifer@gmail.com','2019-04-04 23:21:27','2019-04-04 23:21:29');

insert  into `tb_user_role`(`id`,`user_id`,`role_id`) values
(37,37,37);

insert into `tb_content`(`id`, `category_id`, `title`, `sub_title`, `title_desc`, `url`, `pic`, `pic2`, `content`,
                         `created`, `updated`)
values
(28, 89, '标题', '子标题', '标题说明', 'http://www.jd.com', NULL, NULL, NULL, '2019-04-07 00:56:09', '2019-04-07 00:56:11'),
(29, 89, 'ad2', 'ad2', 'ad2', 'http://www.baidu.com', NULL, NULL, NULL, '2019-04-07 00:56:13', '2019-04-07 00:56:15'),
(30, 89, 'ad3', 'ad3', 'ad3', 'http://www.sina.com.cn', NULL, NULL, NULL, '2019-04-07 00:56:17', '2019-04-07 00:56:19'),
(31, 89, 'ad4', 'ad4', 'ad4', 'http://www.funtl.com', NULL, NULL, NULL, '2019-04-07 00:56:22', '2019-04-07 00:56:25');


insert into `tb_content_category`(`id`, `parent_id`, `name`, `status`, `sort_order`, `is_parent`, `created`, `updated`)
values
(30, 0, 'LeeShop', 1, 1, 1, '2015-04-03 16:51:38', '2015-04-03 16:51:40'),
(86, 30, '首页', 1, 1, 1, '2015-06-07 15:36:07', '2015-06-07 15:36:07'),
(87, 30, '列表页面', 1, 1, 1, '2015-06-07 15:36:16', '2015-06-07 15:36:16'),
(88, 30, '详细页面', 1, 1, 1, '2015-06-07 15:36:27', '2015-06-07 15:36:27'),
(89, 86, '大广告', 1, 1, 0, '2015-06-07 15:36:38', '2015-06-07 15:36:38'),
(90, 86, '小广告', 1, 1, 0, '2015-06-07 15:36:45', '2015-06-07 15:36:45'),
(91, 86, '商城快报', 1, 1, 0, '2015-06-07 15:36:55', '2015-06-07 15:36:55'),
(92, 87, '边栏广告', 1, 1, 0, '2015-06-07 15:37:07', '2015-06-07 15:37:07'),
(93, 87, '页头广告', 1, 1, 0, '2015-06-07 15:37:17', '2015-06-07 15:37:17'),
(94, 87, '页脚广告', 1, 1, 0, '2015-06-07 15:37:31', '2015-06-07 15:37:31'),
(95, 88, '边栏广告', 1, 1, 0, '2015-06-07 15:37:56', '2015-06-07 15:37:56'),
(96, 86, '中广告', 1, 1, 1, '2015-07-25 18:58:52', '2015-07-25 18:58:52'),
(97, 96, '中广告1', 1, 1, 0, '2015-07-25 18:59:43', '2015-07-25 18:59:43');