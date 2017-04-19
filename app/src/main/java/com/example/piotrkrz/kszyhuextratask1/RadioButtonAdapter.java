package com.example.piotrkrz.kszyhuextratask1;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;

import java.util.List;

/**
 * Created by piotrkrz on 2017-04-18.
 */

public class RadioButtonAdapter extends RecyclerView.Adapter<RadioButtonViewHolder> {

    private List <RadioButton> mRadioButtonList;

    public RadioButtonAdapter(List <RadioButton> list){
        this.mRadioButtonList=list;
    }

    @Override
    public RadioButtonViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.radio_button_row, parent, false);
        return new RadioButtonViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(RadioButtonViewHolder holder, int position) {
        String text = mRadioButtonList.get(position).getText().toString();
        holder.getRadioButton().setText(text);
    }

    @Override
    public int getItemCount() {
        return mRadioButtonList.size();
    }
}