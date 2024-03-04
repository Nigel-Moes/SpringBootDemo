package com.nigel.springboot.demo.SpringBootDemo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

    // expose "/" that returns "Hello World!"

    @GetMapping("/")
    public String getHello() {
        return "Hello World!";
    }
}
