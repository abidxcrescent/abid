package com.abid.crescent.controller;

import com.abid.crescent.filters.FirstNamePropertyEditor;
import org.springframework.validation.DataBinder;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserController {


    @GetMapping(value = "/users")
    public String getUser(){
        return "user";
    }

    // 1. RequestParam

    @InitBinder
    public void initBinder(DataBinder binder){
        binder.registerCustomEditor(String.class,"firstName",new FirstNamePropertyEditor());
    }

    /*
        http://localhost:8080/api?firstName=ABID?lastName?ALI?age=26
        In this URL if we want to handle firstName, lastName, age
        then we can use @RequestParam

        Since the url is String type conversion happens implicitly.
        ******* we can write custom type conversion logic ************

        Suppose we want to change our firstName to lower case for every single
        http request before it reaches the controller then we can use
        **************** PropertyEditorSupport ************************

     */
    @GetMapping(value = "/fetchUsers")
    public String fetchUser(@RequestParam(name = "firstName") String firstName,
                            @RequestParam(name = "lastName", required = false) String lastName,
                            @RequestParam(name = "age") int age) {
        return firstName + " " + lastName + " " + age;
    }


    // 2. PathVariable

    /*
        When we want to Bind the part of the path to the variable we
        use @PathVariable instead of a query it is literally path
        of the url.
     */

    @GetMapping(value = "/users/{firstName}/{lastName}/{age}")
    public String getUsers(@PathVariable (name = "firstName") String firstName,
                           @PathVariable (name = "lastName") String lastName,
                           @PathVariable (name = "age") int age) {
        return "True";
    }


}
