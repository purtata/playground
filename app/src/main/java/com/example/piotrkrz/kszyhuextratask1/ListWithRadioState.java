package com.example.piotrkrz.kszyhuextratask1;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by piotrkrz on 2017-04-18.
 */

public class ListWithRadioState implements AppState {

    @Override
    public AppState stateUpdate(Context context, EditText editText, ViewGroup viewGroup, Button button) {
        viewGroup.removeAllViews();
        editText.setText(context.getResources().getString(R.string.zero));
        button.setText(context.getResources().getString(R.string.button_start));
        return new BeginState();
    }
}
