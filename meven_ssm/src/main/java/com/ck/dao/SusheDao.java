package com.ck.dao;

import com.ck.entity.Sushe;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Decription:
 *
 * @author hzk
 * @Date 2021/5/13 10:08
 */
public interface SusheDao {

    @Select("select * from goods")
    @ResultMap("susheMapper")
    public List<Sushe> queryAll();
}
