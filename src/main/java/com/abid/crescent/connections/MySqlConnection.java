package com.abid.crescent.connections;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(prefix = "mySqlConnection",value = "enabled", havingValue = "true", matchIfMissing = false)
public class MySqlConnection {

    MySqlConnection(){
        System.out.println("MySqlConnection");
    }

}
