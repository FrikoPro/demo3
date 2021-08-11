package com.example.demo3.repo;

import com.example.demo3.model.Person;
import org.jdbi.v3.core.Jdbi;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PersonRepo {

    private PersonJdbiRepo personJdbiRepo;

    public PersonRepo(Jdbi jdpi) {
        this.personJdbiRepo = jdpi.onDemand(PersonJdbiRepo.class);
    }

    public Person insertPerson(String name) {
        return personJdbiRepo.insertPerson(name);
    }

    public Person findById(UUID personId) {
        return personJdbiRepo.findById(personId);
    }

}
