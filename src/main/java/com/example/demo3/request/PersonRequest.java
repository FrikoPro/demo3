package com.example.demo3.request;

import org.springframework.stereotype.Service;

@Service
public class PersonRequest {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
