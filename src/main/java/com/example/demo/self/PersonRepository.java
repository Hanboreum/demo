package com.example.demo.self;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class PersonRepository {
    private Map< Integer, Person> db = new HashMap<>();
    private int id = 1;
    public Person findOnePerson ( int idx){
        return db.get(idx);
    }
    public void save( Person person){
        db.put(id++, person);
    }
}
