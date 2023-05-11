package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignUp extends AppCompatActivity implements View.OnClickListener{
    Button buttonToProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        buttonToProfile = findViewById(R.id.btn_toprofile);
        buttonToProfile.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        startActivity(new Intent(this, Profile.class));
    }
}