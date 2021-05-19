package com.ck.entity;

import java.util.List;

/**
 * Decription:
 * 图书类型实体类
 * @author hzk
 * @Date 2021/5/14 11:05
 */
public class booktype {
    private int btid;
    private String btname;

    private List<bookinfo> bookinfoList;

    public List<bookinfo> getBookinfoList() {
        return bookinfoList;
    }

    public void setBookinfoList(List<bookinfo> bookinfoList) {
        this.bookinfoList = bookinfoList;
    }

    public int getBtid() {
        return btid;
    }

    public void setBtid(int btid) {
        this.btid = btid;
    }

    public String getBtname() {
        return btname;
    }

    public void setBtname(String btname) {
        this.btname = btname;
    }
}
