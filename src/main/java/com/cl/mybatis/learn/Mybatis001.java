package com.cl.mybatis.learn;

import com.cl.mybatis.learn.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.awt.*;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: chengli
 * @Date: 2018/11/24 12:00
 */
public class Mybatis001 {
    public static void main(String[] args) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession session = sqlSessionFactory.openSession();
        try {
            UserMapper mapper = session.getMapper(UserMapper.class);
            System.out.println(mapper.selectById(1));
        } finally {
            session.close();
        }
    }
}
