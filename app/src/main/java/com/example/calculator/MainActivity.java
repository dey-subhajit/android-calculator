package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView result;
    EditText f_no, s_no;
    Button BtnAdd, BtnSub, BtnMul, BtnDiv, BtnClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        f_no = findViewById(R.id.f_no);
        s_no = findViewById(R.id.s_no);
        BtnAdd = findViewById(R.id.BtnAdd);
        BtnSub = findViewById(R.id.BtnSub);
        BtnMul = findViewById(R.id.BtnMul);
        BtnDiv = findViewById(R.id.BtnDiv);
        BtnClear = findViewById(R.id.BtnClear);
        result = findViewById(R.id.result);

        BtnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer f_number, s_number, Sum;
                f_number = Integer.parseInt(f_no.getText().toString());
                s_number = Integer.parseInt(s_no.getText().toString());
                Sum = f_number+s_number;
                /*System.out.println(f_number+s_number);*/
                /*Toast.makeText(MainActivity.this, "Result is: "+Sum, Toast.LENGTH_LONG).show();*/
                result.setText("Result is: "+String.valueOf(Sum));
            }
        });

        BtnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer f_number, s_number, Sub;
                f_number = Integer.parseInt(f_no.getText().toString());
                s_number = Integer.parseInt(s_no.getText().toString());
                Sub = f_number-s_number;
                /*System.out.println(f_number-s_number);*/
                /*Toast.makeText(MainActivity.this, "Result is: "+ Sub, Toast.LENGTH_LONG).show();*/
                result.setText("Result is: "+String.valueOf(Sub));
            }
        });

        BtnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer f_number, s_number, Sub;
                f_number = Integer.parseInt(f_no.getText().toString());
                s_number = Integer.parseInt(s_no.getText().toString());
                Sub = f_number*s_number;
                /*System.out.println(f_number-s_number);*/
                /*Toast.makeText(MainActivity.this, "Result is: "+ Sub, Toast.LENGTH_LONG).show();*/
                result.setText("Result is: "+String.valueOf(Sub));
            }
        });

        BtnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Float f_number, s_number;
                Float Sub;
                f_number = Float.parseFloat(f_no.getText().toString());
                s_number = Float.parseFloat(s_no.getText().toString());
                Sub = f_number/s_number;
                /*System.out.println(f_number-s_number);*/
                /*Toast.makeText(MainActivity.this, "Result is: "+ Sub, Toast.LENGTH_LONG).show();*/
                /*String val = String.valueOf(Sub);*/
                result.setText("Result is: "+String.valueOf(Sub));
            }
        });

        BtnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f_no.setText("");
                s_no.setText((""));;
                result.setText("");
            }
        });
    }
}