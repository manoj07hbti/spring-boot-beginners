package com.example.demo.service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class ServiceStudent {

    @Autowired
    EmployeeJpaRepository employeeJpaRepository;

    public List<Employee> getEmployeeList(){

        return employeeJpaRepository.findAll();

    }

    public String add_emp( Employee employee){

        String msg="";
        if(employee.getDept().equals("CS")) {
            employeeJpaRepository.save(employee);
            msg="Successfully added to Database";
        }
        else
        {
            msg="Employee does not belong to CS Dept";
        }

        return msg;
    }

    public void delete_employee( Long id){

        employeeJpaRepository.deleteById(id);

    }

}
