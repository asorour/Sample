package com.example.sample.mapper;

import com.example.sample.Accountant;
import com.example.sample.Doctor;
import com.example.sample.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonMapper {

    public List<Person> getPersons(){
        List<Person> personList = new ArrayList<>();

        Person person = new Person("Mr.", "John", "Smith","1990-10-30");
        personList.add(person);

        Doctor doctor = new Doctor("Jason", "King", "1980-02-10");
        personList.add(doctor);

        Accountant accountant = new Accountant("Ahmed", "Sorour", "1970-07-28");
        personList.add(accountant);

        return personList;
    }
}
