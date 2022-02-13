package com.example.umsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.umsapp.adapter.InternetAdapter;
import com.example.umsapp.databinding.ActivityInternetBinding;

import java.util.ArrayList;
import java.util.List;

public class Internet extends AppCompatActivity {
    private ActivityInternetBinding binding;
    private List<com.example.umsapp.model.Internet> internetList;
    private InternetAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityInternetBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        loadData();
        adapter = new InternetAdapter(internetList, new InternetAdapter.OnItemClickListener() {
            @Override
            public void onItemClickListener(com.example.umsapp.model.Internet internet) {
                Intent intent = new Intent(Internet.this, InternetData.class);
                intent.putExtra("internet", internet);
                startActivity(intent);
            }
        });
        binding.gridView.setAdapter(adapter);
    }

    private void loadData() {
        internetList = new ArrayList<>();
        internetList.add(new com.example.umsapp.model.Internet("300 MB", "8 000 so‘m", "*102*300#"));
        internetList.add(new com.example.umsapp.model.Internet("500 MB", "9 000 so‘m", "*102*500#"));
        internetList.add(new com.example.umsapp.model.Internet("1000 MB", "11 000 so‘m", "*102*1000#"));
        internetList.add(new com.example.umsapp.model.Internet("2000 MB", "17 000 so‘m", "*102*2000#"));
        internetList.add(new com.example.umsapp.model.Internet("3000 MB", "25 000 so‘m", "*102*3000#"));
        internetList.add(new com.example.umsapp.model.Internet("5000 MB", "33 000 so‘m", "*102*5000#"));
        internetList.add(new com.example.umsapp.model.Internet("10000 MB", "50 000 so‘m", "*102*10000#"));
        internetList.add(new com.example.umsapp.model.Internet("20000 MB", " 55 000 so‘m", "*102*20000#"));
        internetList.add(new com.example.umsapp.model.Internet("30000 MB", "65 000 so‘m", "*102*30000#"));
        internetList.add(new com.example.umsapp.model.Internet("50000 MB", "75 000 so‘m", "*102*50000#"));
    }
}