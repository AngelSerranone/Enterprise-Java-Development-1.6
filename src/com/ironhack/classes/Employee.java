package com.ironhack.classes;

public class Employee {
    protected String name;
    protected int age;
    protected int salary;

    // Constructor
    public Employee(String name, int age, int salary) {
        setName(name);
        setAge(age);
        setSalary(salary);
    }

    // Methods
    public String Description () {
        String description = (name + " tiene " + age + " años y tiene un salario de " + salary + " euros.");
        return description;
    }

    // Getters y Setter
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
