package com.example.umsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.umsapp.databinding.ActivityTariffDataBinding;
import com.example.umsapp.model.Tariff;

public class TariffData extends AppCompatActivity {
    private ActivityTariffDataBinding binding;
    private Tariff tariff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTariffDataBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Intent intent = getIntent();
        tariff = (Tariff) intent.getSerializableExtra("tariff");
        binding.tariffName.setText(tariff.getName());
        binding.data.setText(tariff.getData());
        binding.tariffName.setSelected(true);
        binding.arrowBack.setOnClickListener(view -> {
            finish();
        });
    }
}