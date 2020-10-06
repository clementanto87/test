package com.javainuse.controllers;

import com.javainuse.SpringBootHelloWorldApplication;
import com.javainuse.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.testng.Assert;
import org.testng.annotations.Test;

@SpringBootTest(classes = SpringBootHelloWorldApplication.class)
public class AppController1 extends org.springframework.test.context.testng.AbstractTestNGSpringContextTests {

    @Autowired
    private AppService appService;

    @Test
    public void testEmployee() throws Exception {
        System.out.println("works "+ appService.getValue());
        Assert.assertEquals(1, appService.getValue());
    }

    @Test
    public void testEmployee1() throws Exception {
        System.out.println("works "+ appService.getValue());
        Assert.assertEquals(1, appService.getValue());
    }
}
