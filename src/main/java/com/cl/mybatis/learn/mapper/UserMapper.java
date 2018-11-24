package com.cl.mybatis.learn.mapper;

import com.cl.mybatis.learn.user.User;

/**
 * @Author: chengli
 * @Date: 2018/11/24 12:08
 */
public interface UserMapper {

    User selectById(int id);
}
