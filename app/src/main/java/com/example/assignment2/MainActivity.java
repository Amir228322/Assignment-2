package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    EditText input, answer;
    Button convertF, convertC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = findViewById(R.id.Input);
        answer = findViewById(R.id.answ);

        convertF = findViewById(R.id.ConvertF);
        convertC = findViewById(R.id.ConvertC);

        final DecimalFormat numberFormat = new DecimalFormat("#.00");

        convertC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String in = input.getText().toString();
                if (!input.getText().toString().isEmpty())
                {
                    double inp = Double.parseDouble(in);
                    double ou = (inp*9/5)+32;
                    answer.setText(" " + numberFormat.format(ou));
                }
                else{
                    Context context = getApplicationContext();
                    CharSequence text ="Enter the value";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
            }
        });

        convertF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String in = input.getText().toString();
                if (!input.getText().toString().isEmpty())
                {
                    double inp = Double.parseDouble(in);
                    double ou = (inp-32)*5/9;
                    answer.setText(" " + numberFormat.format(ou));
                }else{
                    Context context = getApplicationContext();
                    CharSequence text ="Enter the value";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
            }
        });
    }

}