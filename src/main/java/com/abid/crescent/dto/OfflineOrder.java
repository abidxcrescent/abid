package com.abid.crescent.dto;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component
//@Primary
//@Qualifier("OfflineOrder")
public class OfflineOrder implements Order {
    public void createOrder() {
        System.out.println("Creating offline order");
    }
}
