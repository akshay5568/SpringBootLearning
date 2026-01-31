package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String getHello(){
        return "Hello world@@@";
    }

    @GetMapping("/hello/inside")
    public String insideHello(){
        return "Inside Hello";
    }
}
