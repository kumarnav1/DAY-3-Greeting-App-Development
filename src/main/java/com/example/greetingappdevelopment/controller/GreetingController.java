package com.example.greetingappdevelopment.controller;

import com.example.greetingappdevelopment.model.GreetingData;
import com.example.greetingappdevelopment.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/hello")
    public String sayPosting(@RequestParam(required = false) String firstName, @RequestParam(required = false) String lastName) {
        if (!(firstName == null || lastName == null)) {
            return greetingService.sayHelloByName(firstName, lastName);
        }

        if (firstName == null && lastName == null) {
            return "Hello world!";
        } else if (firstName == null) {
            firstName = "";
            return greetingService.sayHelloByName(firstName, lastName);
        } else {
            lastName = "";
            return greetingService.sayHelloByName(firstName, lastName);
        }
    }

    @PostMapping("/getdata")
    public GreetingData getdata(@RequestBody GreetingData greetingData){
        GreetingData greetingData1 = greetingService.postData(greetingData);
        return greetingData1;
    }
}