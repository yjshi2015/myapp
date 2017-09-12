package com.superstudent.web.login;

import com.superstudent.common.MD5Util;
import com.superstudent.domain.User;
import com.superstudent.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;


/**
 * Created by Administrator on 2017/9/10.
 * 用户登录
 */
@Controller
@RequestMapping("/user")
public class LoginController{

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserService userService;
    @Autowired
    private HttpServletRequest request;

    @RequestMapping("/login")
    public String userLogin(User user) {
        if (user == null) {
            log.debug("登录信息为空！");
            return "../../login";
        }

        try {
            user.setPassword(MD5Util.EncoderPwdByMd5(user.getPassword()));
        } catch (Exception e) {
            log.error("password:" + user.getPassword() +"加密失败", e);
        }

        if (userService.userExists(user)) {
            return "index";
        } else {
            log.debug("用户名或密码不正确！");
            request.setAttribute("error","用户名或密码不正确！");
            return "../../login";
        }
    }
}
