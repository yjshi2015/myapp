package com.superstudent.service;

/**
 * Created by Administrator on 2017/9/10.
 */
public interface UserService {

    /**
     * 验证用户是否存在
     */
    boolean userExists(String userName,String password);
}
