package com.example.screensecurity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Register extends AppCompatActivity {

    Button btnSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        String title = "Sign Up";

        btnSignUp = (Button)findViewById(R.id.btnsignup);
        btnSignUp.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent i = new Intent(Register.this, TwoSteepAuth.class);
                startActivity(i);
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            }
        });
    }
}