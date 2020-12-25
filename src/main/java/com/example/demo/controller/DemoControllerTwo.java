package com.example.demo.controller;

import com.example.demo.model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/*todo REST APT methods : GET,POST,PUT,DELETE and PATCH ?
       http response code
       task : calculator : /add?var_a=
 */
@RestController
public class DemoControllerTwo {

    List<Employee> employeeList=new ArrayList<>();

    //PATH VARIABLE
    @RequestMapping("/greeting/{message}")
    public String greeting(@PathVariable String message ){

        String greeting="Path variable accepted in method----> "+message;

        return greeting;
    }
    @RequestMapping("/greeting_int/{int_var}")
    public String demo_int(@PathVariable int int_var ){

        String greeting="Path variable accepted in method----> "+int_var;

        return greeting;
    }

    //REQUEST PARAM
    @RequestMapping("/message")
    public String demo_request_param(@RequestParam String var_message){

        return var_message+" This value was entered from UI";
    }
    @RequestMapping("/message_int")
    public String demo_request_param_int(@RequestParam int value){

        return value +" This value was entered from UI";
    }

    @RequestMapping("/calculator")
    public String add(@RequestParam int value_a,@RequestParam int value_b,@RequestParam int value_c){

        return "Sum of a and b "+(value_a+value_b+value_c);
    }





}
