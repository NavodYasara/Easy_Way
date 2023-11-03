package com.mad.easy_way;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class OrderDetailsActivity extends AppCompatActivity {

    EditText edYourEmp,edTaskDetails,edSAddress,edCity,edDistrict,edLocation;

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_detail);

        edYourEmp = findViewById(R.id.orderYourEmp);
        edTaskDetails = findViewById(R.id.orderTaskDetails);
        edSAddress = findViewById(R.id.orderStreetAddress);
        edCity = findViewById(R.id.orderCity);
        edDistrict = findViewById(R.id.orderDistrict);
        edLocation= findViewById(R.id.orderLocation);
        btn = findViewById(R.id.btnordertopayment);
    }
}
