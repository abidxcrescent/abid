package com.abid.crescent.connections;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(prefix = "noSqlConnection", value = "enabled", havingValue = "true", matchIfMissing = false)
public class NoSqlConnection {

    NoSqlConnection(){
        System.out.println("NoSqlConnection");
    }

}
