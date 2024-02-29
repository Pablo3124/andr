package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





    }
    Button btn = findViewById(R.id.button);
    TextView txt = findViewById(R.id.textView3);
    public void aa(View view){
        View aa = findViewById(R.id.editTextNumber);
        View bb = findViewById(R.id.editTextNumber2);
        int a = Integer.parseInt(String.valueOf(aa.getContext()));
        int b = Integer.parseInt(String.valueOf(bb.getContext()));
        if(a>b){
            a = a-b;
        }else if(b>a){
            b=b-a;
        }else{
            txt.setText(a);
        }

    }



}











