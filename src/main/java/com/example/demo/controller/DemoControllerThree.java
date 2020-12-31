package com.example.demo.controller;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeJpaRepository;
import com.example.demo.service.ServiceStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DemoControllerThree {

    @Autowired
    EmployeeJpaRepository employeeJpaRepository;
    @Autowired
    ServiceStudent serviceStudent;

    /*todo @RequestBody  : This annotation will take json input from UI  and pass it to your method
           ConcurrentModificationException : When you are traversing any collection and you want to remove object then this exception occures
     */

    @RequestMapping (value="/get_all_employee",method = RequestMethod.GET)
    public List<Employee>  getEmployeeList(){

       return serviceStudent.getEmployeeList();


    }

    @RequestMapping (value = "/add_employee_object",method = RequestMethod.POST)
    public String add_emp(@RequestBody Employee employee){

        return serviceStudent.add_emp(employee);
    }

    @RequestMapping( value="/delete_emp_object",method = RequestMethod.DELETE)
    public void delete_employee( @RequestParam Long id){

        serviceStudent.delete_employee(id);

    }



}
