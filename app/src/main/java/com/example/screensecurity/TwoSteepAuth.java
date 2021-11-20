package com.example.screensecurity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TwoSteepAuth extends AppCompatActivity {

    Button btnVerify;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_steep_auth);

        btnVerify = (Button)findViewById(R.id.verify);
        btnVerify.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent i = new Intent(TwoSteepAuth.this, home.class);
                startActivity(i);
            }
        });
    }
}