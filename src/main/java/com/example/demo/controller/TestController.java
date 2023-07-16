package com.example.demo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class TestController {
    @RequestMapping("/HelloWorld")
    public String  helloword() {
        return "Hello 给v的还是通过";
    }
}
