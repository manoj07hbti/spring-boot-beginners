package com.example.demo.controller;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@RestController
public class DatabaseController {

    @Autowired
//Class_Name  var_name;
    EmployeeJpaRepository employeeJpaRepository;



    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Employee> getAllEmployee() {
        return employeeJpaRepository.findAll();
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Employee getAllEmployee(@RequestBody Employee employee) {
        return employeeJpaRepository.save(employee);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public void removeEmployee(@RequestParam Long id) {
        employeeJpaRepository.deleteById(id);

    }

    @RequestMapping(value = "/find_by_name/{name}", method = RequestMethod.GET)
    public Employee findEmployeeByName(@PathVariable String name) {
        System.out.println("Name is --->" + name);
        return employeeJpaRepository.findByName(name);
    }

    @RequestMapping(value = "/findbyid", method = RequestMethod.GET)
    public Optional<Employee> findEmployee(@RequestParam Long id) {
        return employeeJpaRepository.findById(id);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public Employee findEmployee(@RequestBody Employee employee) {
        return employeeJpaRepository.save(employee);
    }


    @RequestMapping(value = "/findbyname", method = RequestMethod.GET)
    public Employee findEmployee(@RequestParam String name) {
        System.out.println("Name is --->" + name);
        String var_name = name;
        return employeeJpaRepository.findByName(var_name);
    }


    List<Employee> employeeList = new ArrayList<>();

    //PATH VARIABLE
    @RequestMapping("/passvarirable/{message}")
    public String m1(@PathVariable String message) {

        return message;
    }

    //REQUEST PARAM
    @RequestMapping("/requestparam")
    public int demo(@RequestParam int id) {

        return id;
    }

    @RequestMapping(value = "/addemployee", method = RequestMethod.POST)
    public void add(@RequestBody Employee employee) {

        employeeList.add(employee);
    }

    @RequestMapping(value = "/employeelist", method = RequestMethod.GET)
    public List<Employee> display() {
        return employeeList;

    }


    public void test() {

        employeeJpaRepository.findByName("name");
       /* EmployeeJpaRepository employeeJpaRepository=new EmployeeJpaRepository();
        employeeJpaRepository.findByName("name");*/
    }

}
