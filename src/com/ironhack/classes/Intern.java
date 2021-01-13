package com.ironhack.classes;

public class Intern extends Employee {

    // Constructor
    public Intern (String name, int age, int salary) {
        super(name, age, salary);

    }

    // Methods
    public void setSalary (int salary) {
        if (salary<=20000) {
            super.setSalary(salary);
        } else {
            super.setSalary(20000);
        }

    }


}
