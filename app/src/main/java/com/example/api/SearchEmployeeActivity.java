package com.example.api;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.api.api.EmployeeAPI;
import com.example.api.model.Employee;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class SearchEmployeeActivity extends AppCompatActivity {


    private final static String BASE_URL = "http://dummy.restapiexample.com/api/v1/employee/";
    private EditText etEmpNo;
    private TextView tvData;
    private Button btnSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_employee);

        etEmpNo = findViewById(R.id.etEmpID);
        tvData = findViewById(R.id.tvData);
        btnSearch = findViewById(R.id.btnSearch);

        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Validate()) {
                    loadData();
                }
                // loadData();
            }
        });

    }

    private boolean Validate() {
        if (TextUtils.isEmpty(etEmpNo.getText())) {
            return false;
        } else {
            return false;
        }


    }


    private void loadData() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        EmployeeAPI employeeAPI = retrofit.create(EmployeeAPI.class);
        Call<Employee> listCall = employeeAPI.getEmployeeByID(Integer.parseInt(etEmpNo.getText().toString()));
        listCall.enqueue(new Callback<Employee>() {
            @Override
            public void onResponse(Call<Employee> call, Response<Employee> response) {
                Toast.makeText(SearchEmployeeActivity.this, response.body().toString(), Toast.LENGTH_SHORT).show();
                String content = "";
                content += "Id :" + response.body().getId() + "\n";
                content += "Name :" + response.body().getEmployee_name() + "\n";
                content += "Age :" + response.body().getEmployee_age() + "\n";
                content += "Salary :" + response.body().getEmployee_salary() + "\n";

                tvData.setText(content);
            }

            @Override
            public void onFailure(Call<Employee> call, Throwable t) {

                Toast.makeText(SearchEmployeeActivity.this, "Error", Toast.LENGTH_SHORT).show();

            }
        });


    }
}
