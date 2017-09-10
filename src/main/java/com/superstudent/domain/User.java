package com.superstudent.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by Administrator on 2017/9/10.
 * 用户信息
 */
@Data
@Component
public class User {

    /**
     * 数据库主键
     */
    private int id;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 密码
     */
    private String password;

    /**
     * 用户状态
     */
    private String userStatus;

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
     * 删除标志
     */
    private short status;
}
