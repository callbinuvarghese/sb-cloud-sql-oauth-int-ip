package com.example.accessingdatarest.controller;

import com.example.accessingdatarest.entity.Greeting;
import com.example.accessingdatarest.service.SQLTestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/")
public class GreetingController {
    private final Logger log = LoggerFactory.getLogger(GreetingController.class);
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @Autowired
    private SQLTestService sqlTestService;

    @GetMapping("/greeting")
    public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        log.info("Greeting controller started");
        name = name +  "; Time now:" + sqlTestService.getNow();
        log.info("Greeting controller greeting:{}", name);
        name = String.valueOf(counter.incrementAndGet()) + ";" + String.format(template, name);
        //return new Greeting(counter.incrementAndGet(), String.format(template, name));
        name = name + "; from Current User:" + sqlTestService.getCurrentUser();
        name = name + "; from Session User:" + sqlTestService.getSessionUser();
        return name;
    }

    @GetMapping("/hello")
    public String HelloWorld(){
        return "Hello World";
    }
}
