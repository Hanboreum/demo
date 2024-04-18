package com.example.demo.self;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@ResponseBody
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping(value ="/person/{id}", method = RequestMethod.GET)
    public Person findOnePerson(@PathVariable("id") int id){
        return personService.findOnePerson(id);
    }

    @RequestMapping(value ="person", method = RequestMethod.POST)
    public void registerdPerson (@RequestBody Person person){
         personService.save(person);
    }
}
