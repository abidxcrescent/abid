package com.abid.crescent.controller;

import com.abid.crescent.databaseconnection.DataBaseConnection;
import com.abid.crescent.dto.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class Customer {

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
    //@Qualifier("OfflineOrder")
    @Autowired
    Order order;

    /*
        There is an interface DataBaseConnection which has 2 implementations:
        a. SQLConnection
        b. NoSQLConnection
        both of them are beans, we are controlling the creation of both beans
        using @ConditionalOnProperty annotation which takes value from
        application.properties.
     */
    @Autowired(required=false)
    DataBaseConnection dataBaseConnection;




}
