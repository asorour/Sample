package com.example.sample.service;

import com.example.sample.Person;
import com.example.sample.mapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PersonService {

    PersonMapper personMapper;

    @Autowired
    public PersonService(PersonMapper mapper){
        this.personMapper = mapper;
    }

    public List<Person> getPersons(){
        List<Person> persons = personMapper.getPersons();
        return persons;
    }
}
