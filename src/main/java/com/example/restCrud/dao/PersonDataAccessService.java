package com.example.restCrud.dao;

import com.example.restCrud.model.Person;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository("Postgres")
public class PersonDataAccessService implements PersonDao {

    @Override
    public int insertPerson(UUID id, Person person) {
        return 0;
    }

    @Override
    public List<Person> selectAllPeople() {
        return new ArrayList<>(Arrays.asList(new Person(UUID.randomUUID(), "From Postgres DB")));
    }

    @Override
    public Optional<Person> selectPersonById(UUID id) {
        return Optional.empty();
    }

    @Override
    public int deletePersonById(UUID id) {
        return 0;
    }

    @Override
    public int updatePersonById(UUID id, Person person) {
        return 0;
    }
}
