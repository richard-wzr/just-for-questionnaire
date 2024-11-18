package com.wzr.software.practice.jfq;

import org.springframework.stereotype.Service;

import java.util.TimeZone;

@Service
public class MyGreeter {
    public String greeting() {
        return greeting(System.currentTimeMillis());
    }

    public String greeting(long timestamp) {
        long tag = timestamp % (24 * 3600000) + TimeZone.getDefault().getRawOffset();//时间戳对24小时取余后加上当前时区偏移量
        if (tag >= 6 * 3600000 && tag < 12 * 3600000) {//6-12点
            return "Good morning";
        }
        if (tag >= 12 * 3600000 && tag < 18 * 3600000) {//12-18点
            return "Good afternoon";
        }
        return "Good evening";//其他
    }
}
