package com.abid.crescent.databaseconnection;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
/*
    name is coming from application.properties
    havingValue is the value of name coming from application.properties
    matchIfMissing when set to false will not create a bean and will create a bean if set to true.
 */
@ConditionalOnProperty(name = "nosql.enabled",havingValue = "true", matchIfMissing = false)
public class NoSQLConnection implements DataBaseConnection{
    NoSQLConnection(){
        System.out.println("NoSQLConnection from conditional on property");
    }
}
