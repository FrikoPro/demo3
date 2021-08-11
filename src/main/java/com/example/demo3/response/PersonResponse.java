package com.example.demo3.response;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PersonResponse {

    private UUID id;
    private String name;


    public PersonResponse(UUID id, String name) {
        this.id = id;
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
