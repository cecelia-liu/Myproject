package com.example.myproject.db;

import org.litepal.crud.DataSupport;

import java.sql.Date;

/**
 * Created by cmcc on 2018/1/3.
 */
public class Duanzhan extends DataSupport {


    private int id;
    private String zhanName;
    private int zhanNum;
    private String distinct;
    private Date happenDate;
    private boolean isOlt;
    private boolean isGt;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getZhanName() {
        return zhanName;
    }
    public void setZhanName(String zhanName) {
        this.zhanName = zhanName;
    }

    public int getZhanNum() {
        return zhanNum;
    }
    public void setZhanNum(int zhanNum) {
        this.zhanNum = zhanNum;
    }

    public String getDistinct(){
        return distinct;
    }
    public void setDistinct(String distinct) {
        this.distinct = distinct;
    }

    public Date getHappenDate() {
        return happenDate;
    }
    public void setHappenDate(Date happenDate) {
        this.happenDate = happenDate;
    }

    public boolean getIsOlt() {
        return isOlt;
    }
    public void setIsOlt(boolean isOlt) {
        this.isOlt = isOlt;
    }

    public boolean getIsGt() {
        return isGt;
    }
    public void setIsGt(boolean isGt) {
        this.isGt = isGt;
    }
}
