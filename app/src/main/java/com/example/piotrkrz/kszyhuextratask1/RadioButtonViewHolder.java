package com.example.piotrkrz.kszyhuextratask1;

import android.provider.MediaStore;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.RadioButton;


/**
 * Created by piotrkrz on 2017-04-18.
 */

public class RadioButtonViewHolder extends RecyclerView.ViewHolder {

    private RadioButton mButton;

    public RadioButtonViewHolder(View itemView) {
        super(itemView);
        mButton = (RadioButton)itemView;
    }

    public RadioButton getRadioButton(){
        return mButton;
    }
}
