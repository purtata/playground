package com.example.piotrkrz.kszyhuextratask1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    private EditText mEditText;
    private Button mButton;
    private RecyclerView mRecyclerView;
    private AppState mAppState;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAppState = new BeginState();
    }

    public void onClickedButton(View view) {
        mEditText = (EditText) findViewById(R.id.nrOfViews);
        mButton = (Button) view;
        mRecyclerView = (RecyclerView) findViewById(R.id.list);
        mAppState = mAppState.stateUpdate(this, mEditText, mRecyclerView, mButton);
    }
}