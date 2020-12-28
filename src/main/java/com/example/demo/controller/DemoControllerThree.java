package com.example.demo.controller;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DemoControllerThree {

    @Autowired
    EmployeeJpaRepository employeeJpaRepository;

    /*todo @RequestBody  : This annotation will take json input from UI  and pass it to your method
           ConcurrentModificationException : When you are traversing any collection and you want to remove object then this exception occures
     */

    //List<Employee> employeeList=new ArrayList<>();

    @RequestMapping (value="/get_all_employee",method = RequestMethod.GET)
    public List<Employee>  getEmployeeList(){

      return employeeJpaRepository.findAll();

    }

    @RequestMapping (value = "/add_employee_object",method = RequestMethod.POST)
    public Employee add_emp(@RequestBody Employee employee){


        employeeJpaRepository.save(employee);
        return employee;
    }

    @RequestMapping( value="/delete_emp_object",method = RequestMethod.DELETE)
    public void delete_employee( @RequestParam Long id){

        employeeJpaRepository.deleteById(id);

    }



}
