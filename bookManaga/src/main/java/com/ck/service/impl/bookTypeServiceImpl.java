package com.ck.service.impl;

import com.ck.dao.bookTypeDao;
import com.ck.entity.booktype;
import com.ck.service.bookTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Decription:
 *
 * @author hzk
 * @Date 2021/5/14 11:21
 */
@Service
public class bookTypeServiceImpl implements bookTypeService {

    @Autowired
    private bookTypeDao bookTypeDao;


    //查询所有
    public List<booktype> queryAll() {
        return bookTypeDao.queryAll();
    }

    //根据id查询
    public booktype queryById(int id) {
        return null;
    }
}
