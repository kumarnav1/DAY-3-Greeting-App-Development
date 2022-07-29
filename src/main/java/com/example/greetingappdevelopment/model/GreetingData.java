package com.example.greetingappdevelopment.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class GreetingData {

    String firstName;
    String lastName;
    @Id
    @GeneratedValue
    private int id;

    public GreetingData(GreetingData greetingData) {
        this.firstName = greetingData.firstName;
        this.lastName = greetingData.lastName;

    }

    public GreetingData() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}