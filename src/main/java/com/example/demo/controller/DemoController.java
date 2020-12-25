package com.example.demo.controller;

import com.example.demo.model.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DemoController {
    List<String> list=new ArrayList<>();// created a list objet of string type
    List<Employee> list_emp=new ArrayList<Employee>() ;// create global variable

    @RequestMapping("/demo")
    public List<String> demo(){

        list.add("Java Developer");

        return list;

    }
    @RequestMapping("/demo_emp")
    public Employee demoEmployee(){


        Employee employee=new Employee("Raj",1,"CS");

        System.out.println("Employee object Name --"+employee.getName()  +" ID is --"+employee.getEmp_id() +" Dept is --"+employee.getDept());

        return employee;

    }
    @RequestMapping("/demo_emp_list")
    public List<Employee> demoEmployeeList(){


        Employee employee=new Employee("Raj",3,"CS");

        list_emp.add(employee);
        Employee employee1=new Employee("Rahul",4,"IT");
        list_emp.add(employee1);

        return list_emp;

    }



}
