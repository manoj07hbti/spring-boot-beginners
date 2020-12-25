package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator {


    @RequestMapping("/addition")
    public String add(){
        int a=6;
        int b =7;

        int sum =a+b;

        //System.out.println("Addition of two number is --->"+sum);

        return "Addition of two number is --->"+sum;

    }
}
