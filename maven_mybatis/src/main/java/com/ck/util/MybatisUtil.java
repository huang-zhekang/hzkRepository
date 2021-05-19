package com.ck.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/***
 * mybatis的工具类
 * @author hzk
 */
public class MybatisUtil {
    private static SqlSessionFactory factory = null;

    static {
            try {
                InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
                factory  = new SqlSessionFactoryBuilder().build(in);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    /***
     * 获取sqlsession对象
     */
    public static SqlSession openSession(boolean transaction){
        return factory.openSession(transaction);
    }
}
