package com.example.api;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.api.api.EmployeeAPI;
import com.example.api.model.Employee;
import com.example.api.model.EmployeeCUD;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class UpdateEmployeeActivity extends AppCompatActivity {
    private final static String BASE_URL = "http://dummy.restapiexample.com/api/v1/";
    private Button btnSearch, btnUpdate,btnDelete;
    private EditText etEmpNo;
    private EditText etEmpName, etEmpSalary, etEmpAge;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_employee);
        btnSearch = findViewById(R.id.btnSearch);
        btnUpdate = findViewById(R.id.btnUpdate);
        btnDelete = findViewById(R.id.btnDelete);
        etEmpNo = findViewById(R.id.etEmpNo);
        etEmpName = findViewById(R.id.etEmpName);
        etEmpSalary = findViewById(R.id.etEmpSalary);
        etEmpAge = findViewById(R.id.etEmpAge);

        Retrofit retrofit;
        EmployeeAPI employeeAPI;
        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadData();
            }
        });
        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateEmployee();

            }
        });
        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                deleteEmployee();
            }
        });

    }
    private void CreateInstance(){
        retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();

        employeeAPI = retrofit.create(EmployeeAPI.class);

    }





}
