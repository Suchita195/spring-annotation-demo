package com.stackroute.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainDemo {

    public static void main(String[] args) {
        //Application Context
        ApplicationContext context= new AnnotationConfigApplicationContext(MovieConfig.class);
        Movie movie1=context.getBean("getMovie",Movie.class);
        movie1.display();
        Movie movie2=context.getBean("getMovie",Movie.class);
        movie2.display();
        System.out.println(movie1==movie2);
    }
}
