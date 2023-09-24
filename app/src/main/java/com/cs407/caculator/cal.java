package com.cs407.caculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class cal extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal);
        textView =(TextView) findViewById(R.id.textView);
        Intent intent=getIntent();
        String str=intent.getStringExtra("result");
        textView.setText(str);
    }
}