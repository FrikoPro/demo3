package com.example.demo3.api;

import com.example.demo3.model.Person;
import com.example.demo3.repo.PersonRepo;
import com.example.demo3.request.PersonRequest;
import com.example.demo3.response.PersonResponse;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;


@RequestMapping("api/v1/person")
@RestController
public class PersonController {

    private PersonRepo personRepo;


    public PersonController(PersonRepo personRepo) {
        this.personRepo = personRepo;
    }

    @PostMapping
    public PersonResponse addPerson(@RequestBody PersonRequest request) {
        Person person = personRepo.insertPerson(request.getName());
        return new PersonResponse(person.getId(), person.getName());
    }

    @GetMapping("/{personId}")
    public PersonResponse getPerson(@PathVariable("personId") UUID personId) {
        Person person = personRepo.findById(personId);
        return new PersonResponse(person.getId(), person.getName());
    }
}
