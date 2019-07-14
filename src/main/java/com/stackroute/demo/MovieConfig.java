package com.stackroute.demo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MovieConfig {
    //Bean for the lifecycle
    @Bean
    public BeanLifecycleDemo getLifecycle()
    {
        return new BeanLifecycleDemo();
    }
}
