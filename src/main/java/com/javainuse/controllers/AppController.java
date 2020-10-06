package com.javainuse.controllers;

import com.javainuse.SpringBootHelloWorldApplication;
import com.javainuse.service.AppService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.testng.Assert;
import org.testng.annotations.Test;

@SpringBootTest
@RunWith(SpringRunner.class)
public class AppController extends org.springframework.test.context.testng.AbstractTestNGSpringContextTests {

    @Autowired
    private AppService appService;

    @Test
    public void testEmployee() throws Exception {
        /*System.out.println("works "+ appService.getValue());
        Assert.assertEquals(1, appService.getValue());*/
    }

    @Test
    public void testEmployee1() throws Exception {
        /*System.out.println("works "+ appService.getValue());
        Assert.assertEquals(1, appService.getValue());*/
    }
}
