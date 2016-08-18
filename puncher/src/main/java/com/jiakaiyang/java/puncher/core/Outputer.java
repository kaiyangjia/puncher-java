package com.jiakaiyang.java.puncher.core;

import com.jiakaiyang.java.puncher.utils.OutputUtils;

/**
 * 负责把时间以某种指定的方式输出给用户
 */
public class Outputer {
    private TimeManager timeManager = TimeManager.getInstance();


    public Outputer(){

    }

    /**
     * 输出指定的时间点到控制台,输出格式是毫秒的格式
     * @param name
     */
    public void pointToCLI(String name){
        TimePoint timePoint = timeManager.getTimePoint(name);
        OutputUtils.outputToCLI(timePoint);
    }


    /**
     * 输出指定的时间点到控制台,输出的是表示时间的字符串,格式由第二个参数指定
     * @param name 打孔时间的name
     * @param format 时间格式
     */
    public void pointToCLI(String name, String format){
        TimePoint timePoint = timeManager.getTimePoint(name);
        OutputUtils.outputToCLI(timePoint, format);
    }


    /**
     * 输出一个时间段到控制台,输出的是毫秒格式
     * @param nameStart 起始的时间点
     * @param nameEnd 结束的时间点
     */
    public void intervalToCLI(String nameStart, String nameEnd){
        TimePoint startTimePoint = timeManager.getTimePoint(nameStart);
        TimePoint endTimePoint = timeManager.getTimePoint(nameEnd);
        OutputUtils.outputToCLI(startTimePoint, endTimePoint);
    }
}
