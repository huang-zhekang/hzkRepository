package com.ck.dao.impl;

import com.ck.dao.SusheDao;
import com.ck.entity.Sushe;
import com.ck.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Decription:
 *
 * @author hzk
 * @Date 2021/5/13 10:09
 */
public class SusheDaoImpl implements SusheDao {
//111
    public List<Sushe> queryAll() {
        SqlSession sqlSession = MybatisUtil.openSession(false);
        SusheDao susheDao = sqlSession.getMapper(SusheDao.class);
        return susheDao.queryAll();
    }
}
