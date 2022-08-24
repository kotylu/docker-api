package dev.kotylu.dockerapi.rest;

import dev.kotylu.dockerapi.model.Person;
import dev.kotylu.dockerapi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/person")
public class PersonController {

    @Autowired
    private final PersonService personService;

    public PersonController(PersonService service) {
        this.personService = service;
    }

    @PostMapping
    public void postPerson(@RequestBody Person person) {
        this.personService.addPerson(person);
    }

    @GetMapping(path = "{id}")
    public Person getPerson(@PathVariable("id") int id) {
        return this.personService.getPerson(id);
    }

    @GetMapping
    public List<Person> getAllPeople() {
        return this.personService.getAllPeople();
    }
}
