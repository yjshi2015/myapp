
CREATE TABLE `super_student` (
   `id` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '自增主键',
   `student_id` VARCHAR(20) NOT NULL COMMENT '学生id',
   `student_name` VARCHAR(50) NOT NULL COMMENT '学生姓名',
   `student_age` INT(11) NOT NULL COMMENT '学生年龄',
   `student_sex` INT(11) NOT NULL COMMENT '学生性别',
   `student_phone` VARCHAR(20) NOT NULL COMMENT '学生电话',
   `student_address` VARCHAR(200) NOT NULL COMMENT '学生地址',
   `creator` VARCHAR(50) NOT NULL COMMENT '创建人',
   `created` DATE NOT NULL COMMENT '创建时间',
   `modifier` VARCHAR(50) NOT NULL COMMENT '修改人',
   `modified` DATE NOT NULL COMMENT '修改时间',
   `comment` VARCHAR(800) NOT NULL COMMENT '备注',
   `status` INT(11) NOT NULL COMMENT '状态:1有效,-1删除',
   PRIMARY KEY (`student_id`),
   UNIQUE KEY `id` (`id`),
   KEY `studen_name` (`student_name`,`status`)
 ) ENGINE=INNODB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='学生基础信息表'