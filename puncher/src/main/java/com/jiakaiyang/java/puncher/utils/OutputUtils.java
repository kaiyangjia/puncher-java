package com.jiakaiyang.java.puncher.utils;

import com.jiakaiyang.java.puncher.core.Interval;
import com.jiakaiyang.java.puncher.core.TimePoint;

/**
 * 输出的工具类
 */
public class OutputUtils {

    public static void outputToCLI(TimePoint timePoint){
        if(timePoint != null){
            System.out.println(timePoint.format());
        }else {
            System.out.println("time point is null");
        }
    }


    public static void outputToCLI(TimePoint timePoint, String format){
        if(timePoint != null){
            System.out.println(timePoint.format(format));
        }else {
            System.out.println("time point is null");
        }
    }

    /**
     * 输出两个timePoint的时间差,单位是毫秒
     * @param startTimePoint
     * @param endTimePoint
     */
    public static void outputToCLI(TimePoint startTimePoint, TimePoint endTimePoint){
        if(startTimePoint == null){
            System.out.println("the start timepoint is null");
            return;
        }

        if(endTimePoint == null){
            System.out.println("the end timepoint is null");
            return;
        }

        Interval interval = new Interval(startTimePoint, endTimePoint);
        System.out.println(interval.format());
    }
}
