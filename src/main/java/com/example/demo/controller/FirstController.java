package com.example.demo.controller;


import com.example.demo.OrderDTO;
import com.example.demo.OrderRecord;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class FirstController {

    @GetMapping("/hello")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String hello() {
        return "Hello World";
    }

    @PostMapping("/post")
    @ResponseStatus(HttpStatus.CREATED)
    public String post(
           @RequestBody String message
    ) {
        return "passed request" + message;
    }
    @PostMapping("/post_order")
    @ResponseStatus(HttpStatus.CREATED)
    public String post(
            @RequestBody OrderDTO order
    ) {
        return "passed request" + order.toString();
    }
    @PostMapping("/post_order_record")
    @ResponseStatus(HttpStatus.CREATED)
    public String post(
            @RequestBody OrderRecord order
    ) {
        return "passed request" + order.toString();
    }

}
