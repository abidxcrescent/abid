package com.abid.crescent.controller;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class User {

    User(){
        System.out.println("User created");
    }

    @PostConstruct
    public void beforeUsingBean(){
        System.out.println("TestController1 beforeUsingBean" + this.hashCode());
    }

}
