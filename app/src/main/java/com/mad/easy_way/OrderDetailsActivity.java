package com.mad.easy_way;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class OrderDetailsActivity extends AppCompatActivity {

    EditText edYourEmp,edTaskDetails,edSAddress,edCity,edDistrict,edLocation;

    Button btn;

    String[] disricts = {"Colombo", "Galle", "Gampaha", "Hambantota", "Jaffna", "Kalutara", "Kandy",
            "Kegalle", "Kilinochchi", "Kurunegala", "Mannar", "Matale", "Matara", "Moneragala", "Mullaitivu",
            "Nuwara Eliya", "Polonnaruwa", "Puttalam", "Ratnapura", "Trincomalee", "Vavuniya"};

    AutoCompleteTextView autoCompleteTxt;

    ArrayAdapter<String> adapterItems;
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

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String TaskDetails = edTaskDetails.getText().toString();
                String SAddress = edSAddress.getText().toString();
                String City = edCity.getText().toString();
                String District = edDistrict.getText().toString();
                String Location = edLocation.getText().toString();

                if (TaskDetails.length() == 0 || SAddress.length() == 0 || City.length() == 0 || District.length() == 0 || Location.length()==0) {
                    Toast.makeText(getApplicationContext(), "Please fill in all details", Toast.LENGTH_SHORT).show();
                } else {
                        startActivity(new Intent(OrderDetailsActivity.this, PayinformationActivity.class));
                }
            }
        });

        autoCompleteTxt = findViewById(R.id.auto_complete_txt);
        adapterItems = new ArrayAdapter<>(this,R.layout.list_item);
        autoCompleteTxt.setAdapter(adapterItems);
        autoCompleteTxt.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = parent.getItemAtPosition(position).toString();
                Toast.makeText(getApplicationContext(),"Item:"+item,Toast.LENGTH_SHORT).show();
            }
        });
    }

}
