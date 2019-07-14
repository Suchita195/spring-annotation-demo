package com.stackroute.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class MainDemo
{

    public static void main(String[] args) {
        //Application Context
        ApplicationContext context= new AnnotationConfigApplicationContext(MovieConfig.class);
        Movie movie1=context.getBean("getMovie",Movie.class);
        movie1.display();
    }
}

