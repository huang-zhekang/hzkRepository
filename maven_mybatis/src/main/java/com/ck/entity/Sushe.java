package com.ck.entity;

/**
 * Decription:
 *
 * @author hzk
 * @Date 2021/5/13 10:06
 */
public class Sushe {
    private int  id;
    private String name;
    private String address;
    private int peoples;

    @Override
    public String toString() {
        return "Sushe{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", peoples=" + peoples +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPeoples() {
        return peoples;
    }

    public void setPeoples(int peoples) {
        this.peoples = peoples;
    }
}
