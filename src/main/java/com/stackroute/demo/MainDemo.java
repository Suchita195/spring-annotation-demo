package com.stackroute.demo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainDemo
{

    public static void main(String[] args)
    {
        //Application Context
        ApplicationContext context= new AnnotationConfigApplicationContext(MovieConfig.class);
        BeanLifecycleDemo beandemo= context.getBean("getLifecycle",BeanLifecycleDemo.class);
        BeanPostProcessorDemoBean beandemo1= context.getBean("beanPostProcessorDemoBean",BeanPostProcessorDemoBean.class);
        ((ConfigurableApplicationContext)context).close();
    }
}
