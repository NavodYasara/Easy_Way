package com.mad.easy_way;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText edtUsername, edtPassword;
    Button btn;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtUsername = findViewById(R.id.editTextLoginUsername);
        edtPassword = findViewById(R.id.editTextLoginPassword);
        btn = findViewById(R.id.buttonLogin);
        tv = findViewById(R.id.textViewNewUser);

        // following code is for when click on "login" button a message(Toast) appear as "Login Success".

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // here the null validation part
                String username = edtUsername.getText().toString();
                String password = edtPassword.getText().toString();
                if (username.length()==0 || password.length()==0){
                    Toast.makeText(getApplicationContext(), "Please fill all details !" , Toast.LENGTH_SHORT).show();
                }else{
                Toast.makeText(getApplicationContext(), "Login Success" , Toast.LENGTH_SHORT).show();
                startActivity(new Intent(LoginActivity.this, ServiceActivity.class));
                }
            }
        });


        // when click on "Register for new user" go to Register activity.
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this,RegisterActivity.class));
            }
        });

    }


}