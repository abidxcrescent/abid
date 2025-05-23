package com.abid.crescent.controller;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
@Scope("singleton")
public class TestController2 {

    @Autowired
    User user;


    TestController2(){
        System.out.println("TestController2 constructor");
    }

    @PostConstruct
    public void init(){
        System.out.println("TestController2 postConstruct" + this.hashCode() + this.user.hashCode());
    }
}
