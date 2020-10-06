package com.javainuse.service;

import com.javainuse.model.Employee;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Service
@Configuration
public class AppService {

    @Value("${spring.data}")
    private int data;

    public int getValue() {
        return data;
    }

    @Bean
    public Employee getEmp() {
        return new Employee();
    }

}


