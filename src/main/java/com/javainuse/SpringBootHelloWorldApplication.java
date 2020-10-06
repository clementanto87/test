package com.javainuse;

import com.javainuse.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.testng.TestListenerAdapter;
import org.testng.TestNG;

@SpringBootApplication
public class SpringBootHelloWorldApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(SpringBootHelloWorldApplication.class, args);
		/*AppService appService = (AppService) context.getBean("appService");

		System.out.println(appService.getValue()+ " works works works");

		TestListenerAdapter tla = new TestListenerAdapter();
		TestNG testng = new TestNG();
		if(true) {

		}
		testng.setTestClasses(new Class[]{com.javainuse.controllers.AppController.class});
		//testng.setTestClasses(new Class[]{com.javainuse.controllers.AppController1.class});
		testng.addListener(tla);
		testng.run();*/
	}
}
