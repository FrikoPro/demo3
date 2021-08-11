package com.example.demo3.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Data
@AllArgsConstructor
public class PersonResponse {

    private UUID id;
    private String name;

}
