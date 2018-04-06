package com.Mp10PhoneBook.Mp10PhoneBook.initialise;

import com.Mp10PhoneBook.Mp10PhoneBook.persistence.model.Address;
import com.Mp10PhoneBook.Mp10PhoneBook.persistence.model.Person;
import com.Mp10PhoneBook.Mp10PhoneBook.persistence.repository.PersonRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class PersonInitialise {

    @Bean
    ApplicationRunner initialiseperson(PersonRepository personRepository){

        return args -> {
           personRepository.deleteAll();
            List<Person> persons = creatPerson();
            personRepository.saveAll(persons);
            System.out.println("Display the names");
            personRepository.findAll()
                    .forEach(System.out::println);
        };
    }

    private List<Person> creatPerson() {
        Person ali = new Person();
        ali.setName("ali");
         ali.setAddress(new Address("wien"));

        Person mohamed = new Person();
        mohamed.setName("mohamed");
        mohamed.setAddress(new Address("syria"));

        return Arrays.asList(ali, mohamed);

    }

}
