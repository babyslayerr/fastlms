package com.example.fastlms;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainPage {

    @RequestMapping("/")
    public String index(){

        return "INDEX PAGE";

    }
    @RequestMapping("/hello")
    public String hello(){
        String msg = "<html>" +
                "<head>" +
                "</head>" +
                "<body>" +
                "<p>hello!</p> <p>fastlms webstie!!!</p>" +
                "</body>" +
                "</html>";
        return msg;
    }
}

