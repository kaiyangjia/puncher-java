package com.jiakaiyang.java.puncher.core;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 一个时间点的实体类
 */
public class TimePoint {
    //name是唯一的
    private String name;

    //可以添加一些描述信息
    private String desc;

    private long time;

    public TimePoint(String name, String desc, long time) {
        this.name = name;
        this.desc = desc;
        this.time = time;
    }


    public String format(){
        return format(getName(), String.valueOf(getTime()), getDesc());
    }

    public String format(String name, String time, String desc){
        return "[timepoint: " + name + "] [time: " + time
                + "] [desc: " + desc + "]";
    }

    public String format(String format){
        Date date = new Date(getTime());
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        String timeStr = sdf.format(date);
        return format(getName(), timeStr, getDesc());
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }
}
