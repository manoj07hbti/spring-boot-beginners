package com.example.demo.model;

public class EmployeeModel {

    String name;
    int age;
    String dept;

    // parametrized constructor

    public EmployeeModel(String name, int age, String dept) {
        this.name = name;
        this.age = age;
        this.dept = dept;
    }

   // getter ans setter methods

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}
