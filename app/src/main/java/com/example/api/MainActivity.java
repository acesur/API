package com.example.api;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.api.api.EmployeeAPI;
import com.example.api.model.Employee;
import com.example.api.url.URL;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    TextView tvAPI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvAPI = findViewById(R.id.tvAPI);

        Retrofit retrofit = new Retrofit.Builder().baseUrl(URL.base_url).addConverterFactory(GsonConverterFactory.create()).build();


        EmployeeAPI employeeAPI = retrofit.create(EmployeeAPI.class);
        Call<List<Employee>> listCall = employeeAPI.getAllEmployees();
    }
}
