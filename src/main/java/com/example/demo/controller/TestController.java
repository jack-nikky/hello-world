package com.example.demo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import org.apache.log4j.Logger;

@RestController
@RequestMapping("/hello")
public class TestController {

    private final Logger logger = Logger.getLogger(TestController.class);
    @RequestMapping("/HelloWorld")
    public String  helloword() {
        logger.info("test---测试");
        return "Hello 给v的还是通过";
    }
}
