package com.liangxiao.weatherdemo.gson;

import com.google.gson.annotations.SerializedName;

public class Aqi {
    @SerializedName("city")
    public AqiCity aqiCity;

    public class AqiCity {
        public String aqi;
        public String pm25;
    }
}
