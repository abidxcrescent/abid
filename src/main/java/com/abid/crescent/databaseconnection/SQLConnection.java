package com.abid.crescent.databaseconnection;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "sql.connection",havingValue = "true", matchIfMissing = false)
public class SQLConnection implements DataBaseConnection{
    SQLConnection(){
        System.out.println("SQLConnection from conditional on property");
    }
}
