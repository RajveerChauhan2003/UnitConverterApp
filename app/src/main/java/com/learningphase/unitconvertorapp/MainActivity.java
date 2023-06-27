package com.learningphase.unitconvertorapp;

import androidx.appcompat.app.AppCompatActivity;


import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
  // 1 : in xml we create layout and here we declare the views
    double poundValue;
    Button button;
    TextView textView1;
    TextView textView2;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 2: instantiating the views
        textView1 = findViewById(R.id.heading);
        editText = findViewById(R.id.userInput);
        textView2 = findViewById(R.id.outputValue);
        button = findViewById(R.id.convertButton);

        // 3 : adding functionalities

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String kgValueString = editText.getText().toString();
                poundValue = toPounds(kgValueString);
                textView2.setText(poundValue+" lbs");
            }
        });


    }

    public double toPounds(String kgs){
        double kilos = Double.parseDouble(kgs);

        return 2.205*kilos;
    }
}

// 4 : we run and test the app