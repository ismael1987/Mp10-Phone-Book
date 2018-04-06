package com.Mp10PhoneBook.Mp10PhoneBook.persistence.repository;

import com.Mp10PhoneBook.Mp10PhoneBook.persistence.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
