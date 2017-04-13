package com.example.piotrkrz.kszyhuextratask1;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by piotrkrz on 2017-04-18.
 */

public interface AppState {
    AppState stateUpdate(Context context, EditText editText, ViewGroup viewGroup, Button button);
}
