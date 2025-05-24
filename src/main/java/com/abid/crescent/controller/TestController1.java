package com.abid.crescent.controller;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
    This along with TestController1 and User demonstrate
    the single scope beans.

    Singleton bean:

    1. Default scope
    2. Only 1 instance per IOC
    3. Eager initialization

 */
@RestController
@RequestMapping("/api")
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class TestController1 {

    @Autowired
    User user;

    TestController1(){
        System.out.println("TestController1");
    }

    @PostConstruct
    public void beforeUsingBean(){
        System.out.println("TestController1 postConstruct" + this.hashCode() + this.user.hashCode());
    }

}
