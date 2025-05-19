package com.abid.crescent.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {


    @GetMapping(value = "/users")
    public String getUser(){
        return "user";
    }

    @GetMapping(value = "/fetchUsers")
    public String fetchUser(@RequestParam(name = "firstName") String firstName,
                            @RequestParam(name = "lastName", required = false) String lastName,
                            @RequestParam(name = "age") int age) {
        return firstName + " " + lastName + " " + age;
    }

}
