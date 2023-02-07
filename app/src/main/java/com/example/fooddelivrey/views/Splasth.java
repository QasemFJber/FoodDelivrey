package com.example.fooddelivrey.views;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.fooddelivrey.R;

public class Splasth extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splasth);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(getApplicationContext(),UserChoseLogin.class);
                startActivity(intent);
            }
        },3200);
    }

    @Override
    protected void onStop() {
        super.onStop();
        finish();
    }
}