package com.example.demo.controller;


import com.example.demo.model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloController {
    List<Employee> emp_list=new ArrayList<>();
    @RequestMapping(value = "/employee",method = RequestMethod.POST) // End point
    public String AddEmployee ()
    {

         emp_list.add(new Employee("Test",1,"CS"));
        emp_list.add(new Employee("Java ",2,"CS"));
        emp_list.add(new Employee("Java ",3,"CS"));
        return "Hello Spring Boot.....";
    }

    @RequestMapping(value="/employee",method = RequestMethod.GET) // End point
    public List<Employee> getALlEmployee ()
    {

        return emp_list;
    }
    @RequestMapping(value="/employee/{emp_id}",method = RequestMethod.GET) // End point
    public Employee getEmployee(@PathVariable int emp_id)
    {
    Employee employee =emp_list.get(emp_id);
        return employee;
    }

    @PostMapping(value = "/add_employee") // End point
    public void AddEmployeefromJSON ( @RequestBody  Employee employee)
    {
        Employee emp_obj=employee;
        emp_list.add(emp_obj);


    }


}
