package com.jiakaiyang.java.puncher.utils;

import com.jiakaiyang.java.puncher.core.TimePoint;
import org.junit.Test;

/**
 * OutputUtils单元测试
 */
public class OutputUtilsUnitTest {

    @Test
    public void outputCLITest(){
        TimePoint timePoint = new TimePoint("start", "a test desc", System.currentTimeMillis());
        OutputUtils.outputToCLI(timePoint);
        OutputUtils.outputToCLI(timePoint, "yyyy-MM-dd hh:mm:ss");

        timePoint.setTime(123456L);
        OutputUtils.outputToCLI(timePoint);
        OutputUtils.outputToCLI(timePoint, "yyyy-MM-dd hh:mm:ss");

        timePoint.setTime(-123456L);
        OutputUtils.outputToCLI(timePoint);
        OutputUtils.outputToCLI(timePoint, "yyyy-MM-dd hh:mm:ss");

        timePoint.setTime(0);
        OutputUtils.outputToCLI(timePoint);
        OutputUtils.outputToCLI(timePoint, "yyyy-MM-dd hh:mm:ss");

        timePoint = null;
        OutputUtils.outputToCLI(timePoint);
        OutputUtils.outputToCLI(timePoint, "yyyy-MM-dd hh:mm:ss");


        timePoint = new TimePoint("start", "a test start desc", System.currentTimeMillis());
        try {
            //模拟计时的过程
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        TimePoint timePointEnd = new TimePoint("end", "a test end desc", System.currentTimeMillis());
        OutputUtils.outputToCLI(timePoint, timePointEnd);
    }
}
