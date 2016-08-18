package com.jiakaiyang.java.puncher.core;

/**
 * 时间段的实体类
 */
public class Interval {
    private TimePoint startTimePoint;

    private TimePoint endTimePoint;

    /**
     * 格式化成可输出的字符串,时间单位是毫秒
     * @return
     */
    public String format(){
        long time = endTimePoint.getTime() - startTimePoint.getTime();
        return "time between " + startTimePoint.getName() + " and " +
                endTimePoint.getName() + " is " + String.valueOf(time) + " ms";
    }

    public TimePoint getStartTimePoint() {
        return startTimePoint;
    }

    public void setStartTimePoint(TimePoint startTimePoint) {
        this.startTimePoint = startTimePoint;
    }

    public TimePoint getEndTimePoint() {
        return endTimePoint;
    }

    public void setEndTimePoint(TimePoint endTimePoint) {
        this.endTimePoint = endTimePoint;
    }

    public Interval(TimePoint startTimePoint, TimePoint endTimePoint) {

        this.startTimePoint = startTimePoint;
        this.endTimePoint = endTimePoint;
    }
}
