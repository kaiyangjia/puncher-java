package com.jiakaiyang.java.puncher.core;

import java.util.LinkedHashMap;

/**
 * 管理被用户添加的时间点
 */
public class TimeManager {
    //记录所有的时间点
    private static LinkedHashMap<String, TimePoint> timePoints = new LinkedHashMap<String, TimePoint>();

    private static TimeManager instance = new TimeManager();


    private TimeManager(){

    }


    public static TimeManager getInstance(){
        if(instance == null){
            instance = new TimeManager();
        }
        return instance;
    }


    public void addTimePoint(String name, Long time, String desc){
        TimePoint timePoint = new TimePoint(name, desc, time);
        addTimePoint(timePoint);
    }

    public void addTimePoint(String name){
        addTimePoint(name, System.currentTimeMillis(), "");
    }

    public void addTimePoint(String name, String desc){
        addTimePoint(name, System.currentTimeMillis(), desc);
    }

    /**
     * 添加一个timePoint
     * @param timePoint
     */
    public void addTimePoint(TimePoint timePoint){
        if(timePoints == null){
            timePoints = new LinkedHashMap<String, TimePoint>();
        }

        timePoints.put(timePoint.getName(), timePoint);
    }


    /**
     * 根据name获取timepoint对象,如果不存在则返回null
     * @param name
     * @return
     */
    public TimePoint getTimePoint(String name){
        if(timePoints.containsKey(name)){
            return timePoints.get(name);
        }

        return null;
    }


    /**
     * 根据time获取time point对象,不存在则反会null,存在多个的话就返回第一个添加的
     * @param time
     * @return
     */
    public TimePoint getTimePoint(long time){
        for (TimePoint timePoint : timePoints.values()) {
            if (timePoint.getTime() == time)
                return timePoint;
        }

        return null;
    }
}
