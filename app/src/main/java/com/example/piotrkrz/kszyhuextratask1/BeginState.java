package com.example.piotrkrz.kszyhuextratask1;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by piotrkrz on 2017-04-18.
 */

public class BeginState implements AppState {

    @Override
    public AppState stateUpdate(Context context, EditText editText, RecyclerView view, Button button) {
        try {
            long numberOfViews = Integer.parseInt(editText.getText().toString());
            List <RadioButton> radioButtonList = new ArrayList<>();
            if (numberOfViews > 0) {
                RadioButtonAdapter radioButtonAdapter = new RadioButtonAdapter(radioButtonList);
                RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(context);
                view.setLayoutManager(mLayoutManager);
                for (int i = 0; i < numberOfViews; i++) {
                    RadioButton radioButton = new RadioButton(context);
                    String radioButtonLabel = context.getResources().getString(R.string.radio_button_label) + (i+1);
                    radioButton.setText(radioButtonLabel);
                    radioButtonList.add(radioButton);
                }
                view.setAdapter(radioButtonAdapter);
                button.setText(context.getResources().getString(R.string.button_clear));
                return new ListWithRadioState();
            }
        }catch (Exception e) {
            return this;
        }
        return this;
    }
}
