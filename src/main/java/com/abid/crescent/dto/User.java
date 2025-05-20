package com.abid.crescent.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {

    @JsonProperty("first_name")
    private String firstName;

    private String lastName;

    private int age;

}
