package com.example.fastlms;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller  // Controller은 Restcontroller에 비해 templete이 위치반환
public class MainController {

    @RequestMapping("/")
    public String index(){

        return "index";

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

