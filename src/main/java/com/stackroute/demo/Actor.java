package com.stackroute.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class Actor {

    //properties
    private String name;
    private String gender;
    private int age;

    //setter for name
    public void setName(String name) {
        this.name = name;
    }

    //setter for gender
    public void setGender(String gender) {
        this.gender = gender;
    }

    //setter for age
    public void setAge(int age) {
        this.age = age;
    }
    //method that prints the details of the actors
    public void print()
    {
        System.out.println("Name is "+ name +"\n"+ "Gender is " + gender + "\n"+ "Age is " +age);
    }
}
