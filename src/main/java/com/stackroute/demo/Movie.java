package com.stackroute.demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements ApplicationContextAware, BeanNameAware, BeanFactoryAware
{
    //Actor objects
    private Actor actor1;
    private Actor actor2;
    private Actor actor3;
    private ApplicationContext context;
    private BeanFactory bean;

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
    }
    //BeanFactoryAware method
    @Override
    public void setBeanFactory(BeanFactory bean) throws BeansException {
        this.bean=bean;
        System.out.println("BeanFactory method is called");

    }

    //BeanNameAware method
    @Override
    public void setBeanName(String beanName) {
        System.out.println("Name of the bean is " + beanName);

    }

    //ApplicationContextAware method
    @Override
    public void setApplicationContext(ApplicationContext context) throws BeansException {
        this.context=context;
        System.out.println("ApplicationContext method is called");

    }
}
