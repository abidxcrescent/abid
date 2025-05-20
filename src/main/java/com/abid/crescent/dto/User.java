package com.abid.crescent.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

/*
    Bean in Spring Boot is a java object managed by Spring Container (IOC Container)
    It can be created using @Component and @Bean

    @Component only works when there is no user defined constructor
    Or else a @Configuration class has to be created and a @Bean
    has to be defined explicitly.

 */
public class User {

    @JsonProperty("first_name")
    private String firstName;

    private String lastName;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


}
