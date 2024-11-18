package com.wzr.software.practice.jfq;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class MyGreeterTest {
    @Autowired
    private MyGreeter myGreeter;
    @Test
    public void greeting(){
        Assert.isTrue("Good morning".equals(myGreeter.greeting(0)),"1970-01-01 08:00:00");
        Assert.isTrue("Good evening".equals(myGreeter.greeting(1731932625574L)),"2024-11-18 20:23:45");
        Assert.isTrue("Good afternoon".equals(myGreeter.greeting(1731914625000L)),"2024-11-18 15:23:45");
    }
}