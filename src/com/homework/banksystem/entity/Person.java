package com.homework.banksystem.entity;

/* ${@Author} created on 06.05.2021 inside the package - com.homework.banksystem */
public class Person{
    private String name;
    private String lastName;
    private String PhoneNumber;

    public Person(String name, String lastName, String phoneNumber) {
        this.name = name;
        this.lastName = lastName;
        PhoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }
}
