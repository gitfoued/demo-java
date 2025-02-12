package com.example.demo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

public class MyFirstComponent {

    private String myVar;
    public MyFirstComponent(String myVar) {
        this.myVar = myVar;
    }
    public String sayHello(){
        return "Hello World!"+myVar;
    }
}
