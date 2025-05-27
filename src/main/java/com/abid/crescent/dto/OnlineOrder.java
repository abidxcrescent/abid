package com.abid.crescent.dto;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

//@Component
public class OnlineOrder implements Order {
    public void createOrder() {
        System.out.println("Created Online Order");
    }
}
