package com.example.demo.controller;

import com.example.demo.model.Employee;
import com.example.demo.model.EmployeeModel;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CrudController {

 /* C- create : adding resource
    R- read   : get resource
    U- update : update resource
    D- delete : remove resource*/
    List<EmployeeModel> employeeList=new ArrayList<>();

    //create
    @RequestMapping("/add_emp")
    public String add(@RequestBody EmployeeModel employee){

        employeeList.add(employee);

        return employee.getName() + " Added Successfully ...";
    }

    //get
    @RequestMapping("/get_all_emp")
    public List <EmployeeModel> getEmployeeList(){

        return employeeList;
    }
   // update

    @RequestMapping("/update_emp")
    public String update(){

        employeeList.get(0).setName("JAVA");

        return "Name Updated Successfully to Java....";
    }

    // delete

    @RequestMapping("/delete_emp")
    public String remove(){

        employeeList.remove(0);
        return "Employee deleted successfully ......";
    }


}
