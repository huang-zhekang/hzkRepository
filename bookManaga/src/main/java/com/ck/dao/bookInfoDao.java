package com.ck.dao;

import com.ck.entity.bookinfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;

import java.util.List;
import java.util.Map;

/**
 * Decription:
 *
 * @author hzk
 * @Date 2021/5/14 11:07
 */
public interface bookInfoDao {

    public List<bookinfo> queryAll(Map map);

    @Insert("insert into bookinfo values(seq_bookinfo.nextval,#{bname},#{price},#{booktype.btid},#{dtime},#{imgurl},#{state})")
    public void add(bookinfo bookinfo);

    public void deleteBookByIds(int[] ids);

    @Update("update bookinfo set state=1 where bid=#{id}")
    public void updateBookStateById(int id);
}
