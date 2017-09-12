package com.superstudent.dao;

import com.superstudent.domain.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2017/9/10.
 */
@Repository
public interface UserDAO {

    /**
     * 获取用户信息
     */
    User getUser(User user);
}
