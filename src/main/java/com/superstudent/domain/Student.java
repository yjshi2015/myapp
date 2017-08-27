package com.superstudent.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by Administrator on 2017/8/24.
 * 学生基本信息实体
 */
@Data
@Component
public class Student {

    /**
     * 主键
     */
    private int id;

    /**
     * 学生id
     */
    private String studentId;

    /**
     * 学生姓名
     */
    private String studentName;

    /**
     * 学生年龄
     */
    private int studentAge;

    /**
     * 学生性别
     */
    private int studentSex;

    /**
     * 学生电话
     */
    private String studentPhone;

    /**
     * 学生住址
     */
    private String studentAddress;

    /**
     * 创建人
     */
    private String creator;

    /**
     * 创建时间
     */
    private Date created;

    /**
     * 修改人
     */
    private String modifier;

    /**
     * 修改时间
     */
    private Date modified;

    /**
     * 备注
     */
    private String comment;

    /**
     * 状态
     */
    private short status;
}
