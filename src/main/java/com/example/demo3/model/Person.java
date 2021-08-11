package com.example.demo3.model;

import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class Person {

    private UUID id;

    private String name;

    public void setId(UUID id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
