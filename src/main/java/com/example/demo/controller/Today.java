package com.example.demo.controller;

import com.example.demo.model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Today {

    List<Employee> employeeList=new ArrayList<>();
    //PATH VARIABLE
    @RequestMapping("/passvarirable/{message}")
    public String m1(@PathVariable String message ){

        return message;
    }
    //REQUEST PARAM
    @RequestMapping("/requestparam")
    public int demo(@RequestParam int id){

        return id;
    }

    @RequestMapping(value = "/addemployee",method = RequestMethod.POST)
    public void add (@RequestBody Employee employee){

        employeeList.add(employee);
    }
    @RequestMapping(value = "/employeelist",method = RequestMethod.GET)
    public List<Employee> display (){
        return employeeList;

    }

}
