package com.example.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class SampleApplication {

	public static void main(String[] args) {

		SpringApplication.run(SampleApplication.class, args);

		Person person = new Person("Mr.", "John", "Smith","1990-10-30");
		System.out.println(person.toString());

		Doctor doctor = new Doctor("Jason", "King", "1980-02-10");
		System.out.println(doctor.toString());

		Accountant accountant = new Accountant("Ahmed", "Sorour", "1970-07-28");
		System.out.println(accountant.toString());
	}

}
