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
        return new Movie();
    }

    //bean in which the details of actor1 is given
    @Bean
    public Actor actor1()
    {
        Actor actor=new Actor();
        actor.setName("Ranveer");
        actor.setGender("male");
        actor.setAge(23);
    return actor;
    }

    //bean in which the details of actor2 is given
    @Bean
    public Actor actor2()
    {
        Actor actor=new Actor();
        actor.setName("Deepika");
        actor.setGender("female");
        actor.setAge(32);
        return actor;
    }

    //bean in which the details of actor3 is given
    @Bean
    public Actor actor3()
    {
        Actor actor=new Actor();
        actor.setName("Ranbir");
        actor.setGender("male");
        actor.setAge(35);
        return actor;
    }


}
