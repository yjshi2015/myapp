package com.superstudent.web.login;

import com.superstudent.domain.User;
import com.superstudent.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by Administrator on 2017/9/10.
 * 用户登录
 */
@Controller
@RequestMapping("/user")
public class LoginController{

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String userLogin(User user) {
        if (user == null) {
            System.out.println("登录信息为空！");
            return "";
        }

        if (userService.userExists(user.getUserName(),user.getPassword())) {
            System.out.println("登录拦截");
            return "index";
        } else {
            System.out.println("用户名或密码不正确！");
            return "../../login";
        }
    }
}
