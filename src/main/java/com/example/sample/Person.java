package com.example.sample;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person {
    String title;
    String firstName;
    String lastName;
    LocalDate dob;

    public Person (String title, String firstName, String lastName, String dob){
        this. title = title;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = LocalDate.parse(dob);
    }

    @Override
    public String toString(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd LLLL yyyy");
        String formattedDateString = dob.format(formatter);
        return title + " " + firstName + " " + lastName + ", DOB: " + formattedDateString;
    }
}
