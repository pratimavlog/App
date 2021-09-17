package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class register extends AppCompatActivity implements View.OnClickListener{
    Button btnregister;
    TextView alreadyhaveaccunt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        btnregister=findViewById(R.id.btnregister);
        alreadyhaveaccunt=findViewById(R.id.alreadyhaveaccunt);
        btnregister.setOnClickListener(this);
        alreadyhaveaccunt.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btnregister:
                break;
            case R.id.alreadyhaveaccunt:
                startActivity(new Intent(this,MainActivity.class));

        }

    }
}