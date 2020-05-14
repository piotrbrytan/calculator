package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView numbers;
    String operation;
    String firstParameter;
    String secondParameter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numbers = (TextView) findViewById(R.id.textview_numbers);

        Button button_1 = (Button) findViewById(R.id.button_1);
        Button button_2 = (Button) findViewById(R.id.button_2);
        Button button_3 = (Button) findViewById(R.id.button_3);
        Button button_4 = (Button) findViewById(R.id.button_4);
        Button button_5 = (Button) findViewById(R.id.button_5);
        Button button_6 = (Button) findViewById(R.id.button_6);
        Button button_7 = (Button) findViewById(R.id.button_7);
        Button button_8 = (Button) findViewById(R.id.button_8);
        Button button_9 = (Button) findViewById(R.id.button_9);
        Button button_0 = (Button) findViewById(R.id.button_0);


        Button button_plus = (Button) findViewById(R.id.button_plus);
        Button button_minus = (Button) findViewById(R.id.button_minus);
        Button button_multi = (Button) findViewById(R.id.button_multi);
        Button button_div = (Button) findViewById(R.id.button_div);

        Button button_ce = (Button) findViewById(R.id.button_ce);
        Button button_equals = (Button) findViewById(R.id.button_equals);

        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setNumber("1");
            }
        });

        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setNumber("2");
            }
        });

        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setNumber("3");
            }
        });

        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setNumber("4");
            }
        });

        button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setNumber("5");
            }
        });

        button_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setNumber("6");
            }
        });

        button_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setNumber("7");
            }
        });

        button_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setNumber("8");
            }
        });

        button_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setNumber("9");
            }
        });

        button_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setNumber("0");
            }
        });

        button_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setOperation("plus");
            }
        });

        button_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setOperation("minus");
            }
        });

        button_multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setOperation("multi");
            }
        });

        button_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setOperation("div");
            }
        });

        button_ce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers.setText("0");
                firstParameter = "";
            }
        });

        button_equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                long sum = 0;
                secondParameter = numbers.getText().toString();
                switch (operation){
                    case "plus":
                        sum = Long.parseLong(firstParameter) + Long.parseLong(secondParameter);
                        break;
                    case "minus":
                        sum = Long.parseLong(firstParameter) - Long.parseLong(secondParameter);
                        break;
                    case "multi":
                        sum = Long.parseLong(firstParameter) * Long.parseLong(secondParameter);
                        break;
                    case "div":
                        if(secondParameter.equals("0")) {
                            numbers.setText("ERR");
                        } else {
                            sum = Long.parseLong(firstParameter) / Long.parseLong(secondParameter);
                        }
                        break;
                    default:
                        break;
                }
                numbers.setText(Long.toString(sum));
            }
        });
    }

    void setNumber(String number) {
        if(numbers.getText().equals("0")) {
            numbers.setText(number);
        } else {
            numbers.setText(numbers.getText() + number);
        }
    }

    void setOperation(String whichOperation) {
        firstParameter = numbers.getText().toString();
        operation = whichOperation;
        numbers.setText("0");
    }



}
