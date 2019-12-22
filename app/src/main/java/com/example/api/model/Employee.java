package com.example.api.model;

public class Employee {
    private int id;
    private String emploee_name;
    private float employee_salary;
    private int employee_age;
    private String profile_image;


    public Employee(int id, String emploee_name, float employee_salary, int employee_age, String profile_image) {
        this.id = id;
        this.emploee_name = emploee_name;
        this.employee_salary = employee_salary;
        this.employee_age = employee_age;
        this.profile_image = profile_image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmploee_name() {
        return emploee_name;
    }

    public void setEmploee_name(String emploee_name) {
        this.emploee_name = emploee_name;
    }

    public float getEmployee_salary() {
        return employee_salary;
    }

    public void setEmployee_salary(float employee_salary) {
        this.employee_salary = employee_salary;
    }

    public int getEmployee_age() {
        return employee_age;
    }

    public void setEmployee_age(int employee_age) {
        this.employee_age = employee_age;
    }

    public String getProfile_image() {
        return profile_image;
    }

    public void setProfile_image(String profile_image) {
        this.profile_image = profile_image;
    }
}
