package com.example.umsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.umsapp.databinding.ActivityMinuteDataBinding;
import com.example.umsapp.model.Minute;

public class MinuteData extends AppCompatActivity {
    private ActivityMinuteDataBinding binding;
    private Minute minute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMinuteDataBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Intent intent = getIntent();
        minute = (Minute) intent.getSerializableExtra("minute");
        binding.minuteName.setSelected(true);
        binding.minuteName.setText(minute.getName());
        binding.data.setText(minute.getData());
        binding.code.setText(minute.getCode());
        binding.arrowBack.setOnClickListener(view -> {
            finish();
        });
    }
}