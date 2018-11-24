package com.cl.mybatis.learn.intercaptor;

import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.session.ResultHandler;

import java.sql.Statement;
import java.util.Properties;

/**
 * @Author: chengli
 * @Date: 2018/11/24 17:37
 */
@Intercepts({
        @Signature(type = StatementHandler.class, method = "query", args = {Statement.class, ResultHandler.class})
})
public class SqlLogPlugin implements Interceptor {
    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        long begin = System.currentTimeMillis();
        try {
            return invocation.proceed();
        } finally {
            long time = System.currentTimeMillis() - begin;
            System.out.println("sql 运行了 ：" + time + " ms");
        }
    }

    @Override
    public Object plugin(Object target) {
        return Plugin.wrap(target, this);
    }

    @Override
    public void setProperties(Properties properties) {

    }
}
