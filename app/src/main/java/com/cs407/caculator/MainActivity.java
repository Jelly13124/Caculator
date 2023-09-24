package com.cs407.caculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    String s;
    public void clickFunctionplus(View view){
        EditText input1 = (EditText) findViewById(R.id.myTextField1);
        EditText input2 = (EditText) findViewById(R.id.myTextField2);
        float answer = Float.parseFloat(input1.getText().toString()) + Float.parseFloat(input2.getText().toString());
        s = Float.toString(answer);
        goToActivity(s);
    }

    public void clickFunctionminus(View view){
        EditText input1 = (EditText) findViewById(R.id.myTextField1);
        EditText input2 = (EditText) findViewById(R.id.myTextField2);
        float answer = Float.parseFloat(input1.getText().toString()) - Float.parseFloat(input2.getText().toString());
        s = Float.toString(answer);
        goToActivity(s);
    }

    public void clickFunctionmulti(View view){
        EditText input1 = (EditText) findViewById(R.id.myTextField1);
        EditText input2 = (EditText) findViewById(R.id.myTextField2);
        float answer = Float.parseFloat(input1.getText().toString()) * Float.parseFloat(input2.getText().toString());
        s = Float.toString(answer);
        goToActivity(s);
    }

    public void clickFunctiondivi(View view){
        EditText input1 = (EditText) findViewById(R.id.myTextField1);
        EditText input2 = (EditText) findViewById(R.id.myTextField2);
        float answer = Float.parseFloat(input1.getText().toString()) / Float.parseFloat(input2.getText().toString());
        s = Float.toString(answer);
        if(Float.parseFloat(input2.getText().toString()) == 0) {
            s = "Can not divide by 0";
        }
        goToActivity(s);
    }


    public void goToActivity(String s){
        Intent intent = new Intent(this, cal.class);
        intent.putExtra("result",s);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}