package com.abid.crescent.config;

import com.abid.crescent.dto.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {


    /*
        Dynamically initialized bean
        (Unsatisfied dependency problem)

        Suppose there is an interface Order which has 2 implementations
        OnlineOrder and OfflineOrder

        Suppose we are creating a bean User and injecting Order in it.

        This creates an unsatisfied dependency problem.
        {Meaning Spring boot not does not know which order to pick OnlineOrder or OfflineOrder}

        To solve this we have 3 ways:
        1. @Primary on top of any order OnlineOrder or OfflineOrder
        2. @Qualifier("name") on top of Bean and on top of @Autowired.

        Using any of these two breaks the Dependency Inversion Principle.

        A better way to do the same thing would be to inject dependency dynamically
        using @Value when creating dependency.

     */

    /*
       required a bean of type 'java.lang.String' that could not be found
       Consider defining a bean of type 'java.lang.String' in your configuration.
     */
//    @Bean
//    public User createUserBean(){
//        return new User("defaultFirstName", "defaultLastName");
//    }



}
