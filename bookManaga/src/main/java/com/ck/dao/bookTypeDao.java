package com.ck.dao;

import com.ck.entity.booktype;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Decription:
 *
 * @author hzk
 * @Date 2021/5/14 11:08
 */
public interface bookTypeDao {

    @Select("select * from booktype")
    public List<booktype> queryAll();

    @Select("select * from booktype where btid=${id}")
    public booktype queryById(int id);
}
