package com.ck.service;

import com.ck.entity.bookinfo;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Update;

import java.util.List;
import java.util.Map;

/**
 * Decription:
 *
 * @author hzk
 * @Date 2021/5/14 11:20
 */
public interface bookInfoService {

    public Page<bookinfo> queryAll(Map map, int pageNum);

    public void add(bookinfo bookinfo);

    public void deleteBookByIds(int[] ids);

    public void updateBookStateById(int id);
}
