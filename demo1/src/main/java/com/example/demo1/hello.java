package com.example.demo1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class hello {
    @ResponseBody
    @RequestMapping("/hello")
    public  String demo1(){
        return "hello";
    }
}
