package com.example.api.model;

public class EmployeeCUD {
    private int id;
    private String name;
    private float salary;
    private int age;
    private String profile_image;

    public EmployeeCUD(int id, String employee_name, float employee_salary, int employee_age) {
        this.id = id;
        this.name = employee_name;
        this.salary = employee_salary;
        this.age = employee_age;

    }

    public EmployeeCUD(String name, Float salary, int age) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public class Employee{
        private int id;
        private String employee_name;
        private float salary;
        private int age;
        private String profile_image;

        public Employee(String employee_name, float employee_salary, int employee_age){
            this.employee_name = employee_name;
            this.salary=employee_salary;
            this.age=employee_age;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getEmployee_name() {
            return employee_name;
        }

        public void setEmployee_name(String employee_name) {
            this.employee_name = employee_name;
        }

        public float getSalary() {
            return salary;
        }

        public void setSalary(float salary) {
            this.salary = salary;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }


}