package com.example.greetingappdevelopment.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    public String getMessage() {
        return "hello ";
    }
}
