package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
    @Bean
    @Qualifier("bean1")
    public  MyFirstComponent myFirstBean() {
        return new MyFirstComponent("how are you?");
    }
    @Bean
    @Qualifier("bean2")
    public  MyFirstComponent mySecondBean() {
        return new MyFirstComponent("second bean?");
    }
}
