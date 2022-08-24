package dev.kotylu.dockerapi.dao.impl;

import dev.kotylu.dockerapi.dao.api.PersonDao;
import dev.kotylu.dockerapi.model.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("test")
public class FakePersonDaoImpl implements PersonDao {
    private List<Person> db;

    public FakePersonDaoImpl() {
        this.db = new ArrayList<>();
    }

    @Override
    public PersonDao addPerson(Person person) {
        this.db.add(new Person(person.getID(), person.getName(), person.getAge()));
        return this;
    }

    @Override
    public Person getPerson(int id) {
        return this.db.get(id);
    }

    @Override
    public List<Person> getAllPeople() {
        return this.db;
    }

    public int generateID() {
        return this.db.size();
    }
}
