package com.kaku.weac.bean;

import java.util.List;

/**
 * 天气信息
 *
 * @author 咖枯
 * @version 1.0 2015/09/18
 */
public class WeatherInfo {
    /**
     * 城市
     */
    private String mCity;

    /**
     * 更新时间
     */
    private String mUpdateTime;

    /**
     * 温度
     */
    private String mTemperature;

    /***
     * 湿度
     */
    private String mHumidity;

    /**
     * 风力
     */
    private String mWindPower;

    /**
     * 风向
     */
    private String mWindDirection;

    /**
     * 日出
     */
    private String mSunrise;

    /**
     * 日落
     */
    private String mSunset;

    /**
     * 空气指数
     */
    private String mAQI;

    /**
     * 空气质量
     */
    private String mQuality;

    /**
     * 警报类型
     */
    private String mAlarmType;

    /**
     * 警报内容
     */
    private String mAlarmDetail;

    /**
     * 多天预报信息
     */
    private List<WeatherDaysForecast> mWeatherDaysForecast;

    /**
     * 生活指数
     */
    private List<WeatherLifeIndex> mWeatherLifeIndex;

    public String getAlarmDetail() {
        return mAlarmDetail;
    }

    public void setAlarmDetail(String alarmDetail) {
        mAlarmDetail = alarmDetail;
    }

    public String getAlarmType() {
        return mAlarmType;
    }

    public void setAlarmType(String alarmType) {
        mAlarmType = alarmType;
    }

    public String getAQI() {
        return mAQI;
    }

    public void setAQI(String AQI) {
        mAQI = AQI;
    }

    public String getCity() {
        return mCity;
    }

    public void setCity(String city) {
        mCity = city;
    }

    public String getHumidity() {
        return mHumidity;
    }

    public void setHumidity(String humidity) {
        mHumidity = humidity;
    }

    public String getQuality() {
        return mQuality;
    }

    public void setQuality(String quality) {
        mQuality = quality;
    }

    public String getSunrise() {
        return mSunrise;
    }

    public void setSunrise(String sunrise) {
        mSunrise = sunrise;
    }

    public String getSunset() {
        return mSunset;
    }

    public void setSunset(String sunset) {
        mSunset = sunset;
    }

    public String getTemperature() {
        return mTemperature;
    }

    public void setTemperature(String temperature) {
        mTemperature = temperature;
    }

    public String getUpdateTime() {
        return mUpdateTime;
    }

    public void setUpdateTime(String updateTime) {
        mUpdateTime = updateTime;
    }

    public List<WeatherDaysForecast> getWeatherDaysForecast() {
        return mWeatherDaysForecast;
    }

    public void setWeatherDaysForecast(List<WeatherDaysForecast> weatherDaysForecast) {
        mWeatherDaysForecast = weatherDaysForecast;
    }

    public List<WeatherLifeIndex> getWeatherLifeIndex() {
        return mWeatherLifeIndex;
    }

    public void setWeatherLifeIndex(List<WeatherLifeIndex> weatherLifeIndex) {
        mWeatherLifeIndex = weatherLifeIndex;
    }

    public String getWindDirection() {
        return mWindDirection;
    }

    public void setWindDirection(String windDirection) {
        mWindDirection = windDirection;
    }

    public String getWindPower() {
        return mWindPower;
    }

    public void setWindPower(String windPower) {
        mWindPower = windPower;
    }
}