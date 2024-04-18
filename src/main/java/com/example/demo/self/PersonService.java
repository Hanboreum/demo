package com.example.demo.self;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    private PersonRepository personRepository;
    @Autowired
    PersonService(PersonRepository personRepository){
        this.personRepository = personRepository;
    }
    public Person findOnePerson ( int id){
        return personRepository.findOnePerson(id);
    }

    public void save(Person person){
        personRepository.save(person);
    }
}
