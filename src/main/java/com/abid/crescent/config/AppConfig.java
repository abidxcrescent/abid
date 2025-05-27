package com.abid.crescent.config;

import com.abid.crescent.dto.OfflineOrder;
import com.abid.crescent.dto.OnlineOrder;
import com.abid.crescent.dto.Order;
import com.abid.crescent.dto.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {


    /*
       required a bean of type 'java.lang.String' that could not be found
       Consider defining a bean of type 'java.lang.String' in your configuration.
     */
//    @Bean
//    public User createUserBean(){
//        return new User("defaultFirstName", "defaultLastName");
//    }

    @Bean
    public Order createOrder(@Value("${isOfflineOrder}") boolean isOfflineOrder) {
        if(isOfflineOrder) {
            return new OfflineOrder();
        }
        return new OnlineOrder();
    }

}
