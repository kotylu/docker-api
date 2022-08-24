package dev.kotylu.dockerapi.service;

import dev.kotylu.dockerapi.dao.api.PersonDao;
import dev.kotylu.dockerapi.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private final PersonDao personDao;

    public PersonService(@Qualifier("test") PersonDao dao) {
        this.personDao = dao;
    }

    public void addPerson(Person person) {
        person.setID(this.personDao.generateID());
        this.personDao.addPerson(person);
    }

    public Person getPerson(int id) {
        return this.personDao.getPerson(id);
    }

    public List<Person> getAllPeople() {
        return this.personDao.getAllPeople();
    }
}
