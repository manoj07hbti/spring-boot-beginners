package com.example.demo.controller;

import com.example.demo.model.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DemoControllerOne {
    List<Employee> employeeList=new ArrayList<>();

   // CRUD operation : C- Create , R-Read, U-Update , D- delete
    // Need to add employee

    @RequestMapping("/add_employee")
    public String addEmployee(){
        Employee employee=new Employee("Rahul",10,"Computer Science");
        employeeList.add(employee);

        return "Successfully Added Employee......"+employee.getName();
    }

    // Display all employee
    @RequestMapping("/employee_list")
    public List<Employee> displayEmployeeList(){

        return employeeList;
    }
   //remove employee
    @RequestMapping("/remove_employee")
    public String removeEmployee(){
      try {
          employeeList.remove(0);
          return "Successfully removed employe ----" + employeeList.get(0).getName();
      }
      catch (Exception ex) {
          return "Exception occured";

      }


    }

    // update employee record
    @RequestMapping("/update_employee")
    public String updateEmployee(){
       Employee employee= employeeList.get(0);
       employee.setName("Mahesh");
        employeeList.add(employee);

        return "Successfully updated employee record for ....."+employee.getName();
    }

}
