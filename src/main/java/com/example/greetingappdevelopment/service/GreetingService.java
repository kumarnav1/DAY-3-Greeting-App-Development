package com.example.greetingappdevelopment.service;

import com.example.greetingappdevelopment.model.GreetingData;
import com.example.greetingappdevelopment.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GreetingService {

    @Autowired
    GreetingRepository greetingRepository;

    public String getMessage() {
        return "hello ";
    }

    public String sayHelloByName(String firstName, String lastName) {
        return "Hello " + firstName + " " + lastName;
    }

    public GreetingData postData(GreetingData greetingData) {
        greetingRepository.save(greetingData);
        return greetingData;
    }

    public Optional<GreetingData> getMsgById(int id) {
        return greetingRepository.findById(id);
    }

    public List<GreetingData> getAllMsg() {
        return greetingRepository.findAll();
    }
}