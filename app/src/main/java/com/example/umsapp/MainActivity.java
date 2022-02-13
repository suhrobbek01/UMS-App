package com.example.umsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.umsapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.tarif.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, Tariffs.class);
            startActivity(intent);
        });
        binding.daqiqa.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, Minutes.class);
            startActivity(intent);
        });
        binding.internet.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, Internet.class);
            startActivity(intent);
        });
        binding.xizmatlar.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, Services.class);
            startActivity(intent);
        });
        binding.sms.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, SMS.class);
            startActivity(intent);
        });
        binding.yangiliklar.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, News.class);
            startActivity(intent);
        });


    }
}