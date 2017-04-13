package com.example.piotrkrz.kszyhuextratask1;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

/**
 * Created by piotrkrz on 2017-04-18.
 */

public class BeginState implements AppState {

    @Override
    public AppState stateUpdate(Context context, EditText editText, ViewGroup viewGroup, Button button) {
        try {
            int numberOfViews = Integer.parseInt(editText.getText().toString());
            if (numberOfViews > 0) {
                for (int i = 0; i < numberOfViews; i++) {
                    RadioButton radioButton = new RadioButton(context);
                    String radioButtonLabel = context.getResources().getString(R.string.radio_button_label) + (i+1);
                    radioButton.setText(radioButtonLabel);
                    viewGroup.addView(radioButton);
                }
                button.setText(context.getResources().getString(R.string.button_clear));
                return new ListWithRadioState();
            }
        }catch (Exception e) {
            return this;
        }
        return this;
    }
}

