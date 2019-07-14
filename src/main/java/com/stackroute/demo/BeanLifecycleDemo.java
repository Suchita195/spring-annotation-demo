package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BeanLifecycleDemo implements InitializingBean, DisposableBean {

    //destroy method
    @Override
    public void destroy() throws Exception {
        System.out.println("This is destroy method");
    }

    //PropertiesSet method
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Properties Set Method");
    }

    //Custom methods..
    @PostConstruct
    public void customInit() {
        System.out.println("init method called");
    }

    @PreDestroy
    public void customDestroy() {
        System.out.println("destroy method called");
    }
}
