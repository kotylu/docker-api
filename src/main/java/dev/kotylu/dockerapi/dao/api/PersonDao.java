package dev.kotylu.dockerapi.dao.api;

import dev.kotylu.dockerapi.model.Person;

import java.util.List;

public interface PersonDao {

    PersonDao addPerson(Person person);
    Person getPerson(int id);
    List<Person> getAllPeople();

    int generateID();
}
