package com.example.fastlms.main.controller;

import com.example.fastlms.components.MailComponents;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@RequiredArgsConstructor
@Controller  // Controller은 Restcontroller에 비해 templete이 위치반환
public class MainController {

    private  final MailComponents mailComponents;
    @RequestMapping("/")
    public String index(){

//        S
        return "index";

    }

    @RequestMapping("/error/denied")
    public String errorDenied(){

//
        return "/error/denied";

    }

    @RequestMapping("/hello")
    public void hello(HttpServletResponse request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html;charset=UTF-8");

        PrintWriter printWriter = response.getWriter();

        String msg = "<html>" +
                "<head>" +
                "<meta charset = 'UTF-8'>" +
                "</head>" +
                "<body>" +
                "<p>hello!</p> <p>fastlms webstie!!!</p>" +
                "<p> 안녕하세요!! </p>" +
                "</body>" +
                "</html>";

        printWriter.write(msg);
        printWriter.close();
    }

}

