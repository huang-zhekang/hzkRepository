package com.ck.service;

import com.ck.entity.booktype;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Decription:
 *
 * @author hzk
 * @Date 2021/5/14 11:21
 */
public interface bookTypeService {

    public List<booktype> queryAll();

    public booktype queryById(int id);
}
