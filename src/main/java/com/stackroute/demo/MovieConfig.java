package com.stackroute.demo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class MovieConfig {
    //Bean for the lifecycle
    @Bean
    public BeanLifecycleDemo getLifecycle()
    {
        return new BeanLifecycleDemo();
    }

    //Bean for the PostProcessor
    @Bean
    public BeanPostProcessorDemoBean beanPostProcessorDemoBean()
    {
        return new BeanPostProcessorDemoBean();
    }
}
