package com.example.demo.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity // This will create employee table in database
public class Employee {
    public Employee() {

    }

    @Id // primary key unique value
    @GeneratedValue // Automatically increment current 0,1,2,3,......14,15
    Long id;

    String name;
    int emp_id;
    String dept;

    //parameterized constructor
    public Employee(String name, int emp_id, String dept) {
        this.name = name;
        this.emp_id = emp_id;
        this.dept = dept;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}
