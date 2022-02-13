package com.example.umsapp.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.umsapp.databinding.ItemMinuteBinding;
import com.example.umsapp.databinding.ItemTariffBinding;
import com.example.umsapp.model.Minute;
import com.example.umsapp.model.Tariff;

import java.util.List;

public class MinuteAdapter extends BaseAdapter {
    private List<Minute> minuteList;
    private OnItemClickListener onItemClickListener;

    public MinuteAdapter(List<Minute> minuteList, OnItemClickListener onItemClickListener) {
        this.minuteList = minuteList;
        this.onItemClickListener = onItemClickListener;
    }

    @Override
    public int getCount() {
        return minuteList.size();
    }

    @Override
    public Object getItem(int i) {
        return minuteList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ItemMinuteBinding binding;
        if (view == null) {
            binding = ItemMinuteBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        } else {
            binding = ItemMinuteBinding.bind(view);
        }
        binding.name.setText(minuteList.get(i).getName());
        binding.name.setSelected(true);
        binding.code.setText(minuteList.get(i).getCode());
        binding.data.setText(String.valueOf(minuteList.get(i).getData()));
        binding.getRoot().setOnClickListener(view1 -> onItemClickListener.onItemClickListener(minuteList.get(i)));
        binding.data.setSelected(true);
        return binding.getRoot();
    }

    public interface OnItemClickListener {
        void onItemClickListener(Minute minute);
    }
}
