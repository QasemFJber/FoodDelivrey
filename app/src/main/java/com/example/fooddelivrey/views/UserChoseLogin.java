package com.example.fooddelivrey.views;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.fooddelivrey.R;
import com.example.fooddelivrey.databinding.ActivityUserChoseLoginBinding;

public class UserChoseLogin extends AppCompatActivity implements View.OnClickListener {
ActivityUserChoseLoginBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityUserChoseLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setOnClick();
    }

    private void setOnClick() {
        binding.btnLogin.setOnClickListener(this::onClick);
    }


    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_login){
            Intent intent = new Intent(getApplicationContext(),Login.class);
            startActivity(intent);
        }
    }
}