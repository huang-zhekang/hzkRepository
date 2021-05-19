package com.ck.service.impl;

import com.ck.dao.bookInfoDao;
import com.ck.entity.bookinfo;
import com.ck.service.bookInfoService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * Decription:
 *
 * @author hzk
 * @Date 2021/5/14 11:20
 */
@Service
public class bookInfoServiceImpl implements bookInfoService {

    @Autowired
    private bookInfoDao bookInfoDao;


    //查询所有,分页查询
    public Page<bookinfo>  queryAll(Map map,int pageNum) {
        Page<bookinfo> page = PageHelper.startPage(pageNum, 5);
        bookInfoDao.queryAll(map);

        return page;
    }

    //添加
    @Transactional
    public void add(bookinfo bookinfo) {
        bookInfoDao.add(bookinfo);
    }

    //批量删除
    @Transactional
    public void deleteBookByIds(int[] ids) {
        bookInfoDao.deleteBookByIds(ids);
    }

    //修改审核状态
    @Transactional
    public void updateBookStateById(int id) {
        bookInfoDao.updateBookStateById(id);
    }
}
