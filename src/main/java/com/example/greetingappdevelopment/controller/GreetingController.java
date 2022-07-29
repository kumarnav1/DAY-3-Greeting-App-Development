package com.example.greetingappdevelopment.controller;

import com.example.greetingappdevelopment.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @Autowired
    GreetingService greetingService;

    @GetMapping("/getMap")
    public String getmessage() {
        return "Hello World";
    }

    @GetMapping("/getbyparam")
    public String getByParam(@RequestParam String name) {
        return " Hello " + name;
    }

    @GetMapping("/getpath/{name}")
    public String getpath(@PathVariable String name) {
        return " Hello " + name;
    }

    @GetMapping("/getbyservice")
    public String getByService() {
        return greetingService.getMessage();
    }
}