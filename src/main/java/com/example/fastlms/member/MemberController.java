package com.example.fastlms.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class MemberController {

    @GetMapping("member/register")
    public String register(){

        return "/member/register";
    }

    @PostMapping("member/register")
    public String registerSubmit(HttpServletRequest request, HttpServletResponse response, MemberInput parameter){

        System.out.println(parameter.toString());

        return "member/register";
    }
}
