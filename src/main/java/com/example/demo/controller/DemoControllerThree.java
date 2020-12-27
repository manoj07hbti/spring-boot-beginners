package com.example.demo.controller;

import com.example.demo.model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DemoControllerThree {

    /*todo @RequestBody  : This annotation will take json input from UI  and pass it to your method
           ConcurrentModificationException : When you are traversing any collection and you want to remove object then this exception occures
     */

    List<Employee> employeeList=new ArrayList<>();

    @RequestMapping (value="/get_all_employee",method = RequestMethod.GET)
    public List<Employee>  getEmployeeList(){

      return employeeList;

    }

    @RequestMapping (value = "/add_employee_object",method = RequestMethod.POST)
    public Employee add_emp(@RequestBody Employee employee){

        employeeList.add(employee);

        return employee;
    }

    @RequestMapping( value="/delete_emp_object",method = RequestMethod.DELETE)
    public void delete_employee( @RequestParam Long id){

        //TODO write a method which will delete an element from list by passing ID
        int index=1;
        int actual_id=0;
        for (int i=0;i<employeeList.size();i++){


            if (employeeList.get(i).getId()==id){

                 actual_id =i;
            }

        }

        employeeList.remove(actual_id);


    }



}
