package com.example.demo3.repo;

import com.example.demo3.model.Person;
import org.jdbi.v3.sqlobject.config.RegisterBeanMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.statement.GetGeneratedKeys;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

import java.util.UUID;

@RegisterBeanMapper(Person.class)
public interface PersonJdbiRepo {

    @GetGeneratedKeys
    @SqlUpdate("insert into demo_table (name) values (:name)")
    Person insertPerson(@Bind("name") String name);

    @SqlQuery("select * from demo_table where id = :id")
    Person findById(@Bind("id") UUID personId);
}
