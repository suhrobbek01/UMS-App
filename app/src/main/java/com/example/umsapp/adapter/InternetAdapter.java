package com.example.umsapp.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.umsapp.databinding.ItemInternetBinding;
import com.example.umsapp.databinding.ItemTariffBinding;
import com.example.umsapp.model.Internet;
import com.example.umsapp.model.Tariff;

import java.util.List;

public class InternetAdapter extends BaseAdapter {
    private List<Internet> internetList;
    private OnItemClickListener onItemClickListener;

    public InternetAdapter(List<Internet> internetList, OnItemClickListener onItemClickListener) {
        this.internetList = internetList;
        this.onItemClickListener = onItemClickListener;
    }

    @Override
    public int getCount() {
        return internetList.size();
    }

    @Override
    public Object getItem(int i) {
        return internetList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ItemInternetBinding binding;
        if (view == null) {
            binding = ItemInternetBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        } else {
            binding = ItemInternetBinding.bind(view);
        }
        binding.count.setText(internetList.get(i).getCount());
        binding.count.setSelected(true);
        binding.code.setText(internetList.get(i).getCode());
        binding.price.setText(String.valueOf(internetList.get(i).getPrice()));
        binding.getRoot().setOnClickListener(view1 -> {
            onItemClickListener.onItemClickListener(internetList.get(i));
        });
        binding.price.setSelected(true);
        return binding.getRoot();
    }

    public interface OnItemClickListener {
        void onItemClickListener(Internet internet);
    }
}
