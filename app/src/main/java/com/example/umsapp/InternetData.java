package com.example.umsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.umsapp.databinding.ActivityInternetDataBinding;
import com.example.umsapp.model.Internet;

public class InternetData extends AppCompatActivity {
    private ActivityInternetDataBinding binding;
    private Internet internet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityInternetDataBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Intent intent = getIntent();
        internet = (Internet) intent.getSerializableExtra("internet");
        binding.count.setText(internet.getCount());
        binding.price.setText(internet.getPrice());
        binding.code.setText(internet.getCode());
        binding.xaridQilish.setOnClickListener(view -> Toast.makeText(InternetData.this, "Siz ushbu internet paketni xarid qildingiz", Toast.LENGTH_SHORT).show());
        binding.arrowBack.setOnClickListener(view -> finish());
    }
}