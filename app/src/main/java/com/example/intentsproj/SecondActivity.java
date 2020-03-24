package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    EditText e3,e4;
    TextView t1;
    Button bAdd, bSub, bMulti, bDiv;
    int n1,n2;
    double ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        e3 = findViewById(R.id.editText3);
        e4 = findViewById(R.id.editText5);
        t1 = findViewById(R.id.textView);
        bAdd = findViewById(R.id.button2);
        bSub = findViewById(R.id.button3);
        bMulti = findViewById(R.id.button4);
        bDiv = findViewById(R.id.button5);

        Intent intent = getIntent();

        final String Value1 = intent.getStringExtra("Value1");
        final String Value2 = intent.getStringExtra("Value2");


        e3.setText(Value1);
        e4.setText(Value2);

        bAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans = Double.parseDouble(Value1)+ Double.parseDouble(Value2);
                t1.setText(Value1+ "+" +Value2+ "=" +Double.toString(ans));


            }
        });

        bSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans = Double.parseDouble(Value1) - Double.parseDouble(Value2);
                t1.setText(Value1+ "-" +Value2+ "=" +Double.toString(ans));
            }
        });

        bMulti.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans = Double.parseDouble(Value1) * Double.parseDouble(Value2);
                t1.setText(Value1+ "x" +Value2+ "=" +Double.toString(ans));

            }
        }));

        bDiv.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans = Double.parseDouble(Value1) / Double.parseDouble(Value2);
                t1.setText(Value1+ "/" +Value2+ "=" +Double.toString(ans));
            }
        }));
    }
}
