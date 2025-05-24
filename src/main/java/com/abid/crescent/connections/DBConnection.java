package com.abid.crescent.connections;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Objects;

@Component
public class DBConnection {

    @Autowired(required = false)
    MySqlConnection mySqlConnection;

    @Autowired(required = false)
    NoSqlConnection noSqlConnection;

    DBConnection(){
        System.out.println("DB Connection");
    }

    @PostConstruct
    public void init(){
        System.out.println("DB Connection init");
        System.out.println("MySqlConnection " + Objects.isNull(mySqlConnection));
        System.out.println("NoSqlConnection " + Objects.isNull(noSqlConnection));
    }


}
