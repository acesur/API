package com.example.api.api;

import com.example.api.model.Employee;
import com.example.api.model.EmployeeCUD;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface EmployeeAPI {

    @GET("employees")
    Call<List<Employee>> getAllEmployees();

    //Get employee on basis of id
    @GET("employee/{empID}")
    Call<Employee> getEmployeeByID(@Path("empID") int empID);

    @POST("create")
    Call<Void> registerEmployee(@Body EmployeeCUD emp);

    @PUT("update/{empID}")
    Call<Void> updateEmployee(@Path("empID") int empId,@Body EmployeeCUD emp);

}
