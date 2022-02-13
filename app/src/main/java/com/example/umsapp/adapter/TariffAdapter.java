package com.example.umsapp.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.umsapp.databinding.ItemTariffBinding;
import com.example.umsapp.model.Tariff;

import java.util.List;

public class TariffAdapter extends BaseAdapter {
    private List<Tariff> tariffList;
    private OnItemClickListener onItemClickListener;

    public TariffAdapter(List<Tariff> tariffList, OnItemClickListener onItemClickListener) {
        this.tariffList = tariffList;
        this.onItemClickListener = onItemClickListener;
    }

    @Override
    public int getCount() {
        return tariffList.size();
    }

    @Override
    public Object getItem(int i) {
        return tariffList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ItemTariffBinding binding;
        if (view == null) {
            binding = ItemTariffBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        } else {
            binding = ItemTariffBinding.bind(view);
        }
        binding.name.setText(tariffList.get(i).getName());
        binding.name.setSelected(true);
        binding.code.setText(tariffList.get(i).getCode());
        binding.data.setText(String.valueOf(tariffList.get(i).getData()));
        binding.getRoot().setOnClickListener(view1 -> {
            onItemClickListener.onItemClickListener(tariffList.get(i));
        });
        binding.data.setSelected(true);
        return binding.getRoot();
    }

    public interface OnItemClickListener {
        void onItemClickListener(Tariff tariff);
    }
}
