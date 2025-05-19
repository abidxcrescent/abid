package com.abid.crescent.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/*
    Using annotation @Controller qualifies this class
    to take https requests.
 */
@Controller
public class SampleController {


    /*
        @ResponseBody will make sure the return string is treated as
        http response and not look for jsp page to render it.

        @RequestMapping maps the incoming request with path defined
        and the method will define the type of REST API it is.
     */
    @RequestMapping(path = "hello",method = RequestMethod.GET)
    @ResponseBody
    public String sayHello() {
        return "Hello World";
    }

}
