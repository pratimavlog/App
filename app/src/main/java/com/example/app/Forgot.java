package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Forgot extends AppCompatActivity implements View.OnClickListener{
    TextView forgotpassword,backtologin;
    Button forgotbtn;
    EditText inputEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot);
        forgotbtn=findViewById(R.id.forgotbtn);
        backtologin=findViewById(R.id.backtologin);
        forgotbtn.setOnClickListener(this);
        backtologin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.forgotbtn:
                break;
            case R.id.backtologin:
                startActivity(new Intent(this,MainActivity.class));
        }

    }
}