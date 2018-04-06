package com.Mp10PhoneBook.Mp10PhoneBook.persistence.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Address {

    @Id
    @GeneratedValue
    private Long id;
    private String placename;

    public Address() {
    }

    public Address(String placename) {
        this.placename = placename;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlacename() {
        return placename;
    }

    public void setPlacename(String placename) {
        this.placename = placename;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", placename='" + placename + '\'' +
                '}';
    }
}
