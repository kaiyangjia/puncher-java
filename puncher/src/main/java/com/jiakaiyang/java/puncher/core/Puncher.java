package com.jiakaiyang.java.puncher.core;

/**
 * 用户直接接触的类
 */
public class Puncher {
    private static Puncher instance = new Puncher();

    private TimeManager timeManager;

    //起始点
    public static final String NAME_START = "start";

    //结束点
    public static final String NAME_END = "end";

    private Puncher(){
        timeManager = TimeManager.getInstance();
    }

    public static Puncher getInstance(){
        if(instance == null){
            instance = new Puncher();
        }

        return instance;
    }

    public void punch(String name){
        timeManager.addTimePoint(name);
    }

    public void punch(String name, String desc){
        timeManager.addTimePoint(name, desc);
    }

    public void punch(String name, String desc, long time){
        timeManager.addTimePoint(name, time, desc);
    }
}
