package com.example.screensecurity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class RegisterIntruder extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_intruder);

        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            if(bundle.getString("some") != null){
                Toast.makeText(getApplicationContext(),"data: " + bundle.getString("some"), Toast.LENGTH_SHORT).show();
            }
        }
    }
}