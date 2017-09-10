package com.superstudent.service.impl;

import com.superstudent.dao.UserDAO;
import com.superstudent.domain.User;
import com.superstudent.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/9/10.
 */
@Service("userService")
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDAO userDAO;

    /**
     * 验证用户是否存在
     */
    @Override
    public boolean userExists(String userName, String password) {
        User user = userDAO.getUser(userName,password);
        if (user != null) {//存在该用户
            return true;
        }else {
            return false;
        }
    }
}
