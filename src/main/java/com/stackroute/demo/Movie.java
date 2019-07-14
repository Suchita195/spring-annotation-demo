package com.stackroute.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class Movie
{
    //Actor objects
    private Actor actor1;
    private Actor actor2;
    private Actor actor3;

    //setters
    @Autowired
    public void setActor1(Actor actor1) {
        this.actor1 = actor1;
    }
    @Autowired
    public void setActor2(Actor actor2) {
        this.actor2 = actor2;
    }
    @Autowired
    public void setActor3(Actor actor3) {
        this.actor3 = actor3;
    }

    //method to display the details of the actor
    public void display()
    {
        System.out.println("Actor Details are:");
          actor1.print();
          actor2.print();
          actor3.print();
    }}
