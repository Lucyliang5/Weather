package com.liangxiao.weatherdemo.db;

import org.litepal.crud.DataSupport;

public class County extends DataSupport {
    private int id;
    private int cityId;
    private String weaterId;
    private String countyName;

    public String getWeaterId() {
        return weaterId;
    }

    public void setWeaterId(String weaterId) {
        this.weaterId = weaterId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }
}
