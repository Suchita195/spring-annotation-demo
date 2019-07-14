package com.stackroute.demo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MovieConfig {
//movie bean in which the actor object beans are passed
    @Bean
    @Scope("prototype")
    public Movie getMovie()
    {
    return new Movie(actor1(),actor2(),actor3());
    }

    @Bean
    public Actor actor1()
    {
    return new Actor("Ranveer","Male",34);
    }

    @Bean
    public Actor actor2()
    {
        return new Actor("Deepika","Female",32);
    }

    @Bean
    public Actor actor3()
    {
        return new Actor("Ranbir","Male",35);
    }


}
