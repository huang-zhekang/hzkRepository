package com.ck.entity;

import java.util.Date;

/**
 * Decription:
 * 图书实体类
 * @author hzk
 * @Date 2021/5/14 11:06
 */
public class bookinfo {
    private int bid;
    private String bname;
    private double price;
    private Date dtime;
    private String imgurl;
    private int state;

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getDtime() {
        return dtime;
    }

    public void setDtime(Date dtime) {
        this.dtime = dtime;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public com.ck.entity.booktype getBooktype() {
        return booktype;
    }

    public void setBooktype(com.ck.entity.booktype booktype) {
        this.booktype = booktype;
    }

    private booktype booktype;
}
