package com.example.piotrkrz.kszyhuextratask1;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by piotrkrz on 2017-04-18.
 */

public interface AppState {
    AppState stateUpdate(Context context, EditText editText, RecyclerView view, Button button);
}
