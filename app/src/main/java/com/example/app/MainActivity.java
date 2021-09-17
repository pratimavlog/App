package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView createnewaccount;
    Button btnlogin;
    TextView forgotPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnlogin=findViewById(R.id.btnlogin);
        createnewaccount=findViewById(R.id.createnewaccount);
        btnlogin.setOnClickListener(this);
        createnewaccount.setOnClickListener(this);
        forgotPassword=findViewById(R.id.forgotPassword);
         forgotPassword.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnlogin:
                break;
            case R.id.createnewaccount:
                startActivity(new Intent(this,register.class));
                break;
            case R.id.forgotPassword:
                startActivity(new Intent(this,Forgot.class));
                break;


        }

    }
}