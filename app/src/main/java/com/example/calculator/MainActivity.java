package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText firstValue , secondValue ;
    TextView answer;
    Button plus , minus , multy , div , layouts ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        firstValue = findViewById(R.id.etFiestValue);
        secondValue = findViewById(R.id.etSecondValue);
        answer = findViewById(R.id.answerValue);
        plus = findViewById(R.id.btnPlus);
        minus = findViewById(R.id.btnMinus);
        multy = findViewById(R.id.btnMultiply);
        div = findViewById(R.id.btnDivide);
        layouts = findViewById(R.id.allLayouts);



        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int one , two , total;
                one =Integer.parseInt(firstValue.getText().toString());
                two =Integer.parseInt(secondValue.getText().toString());
                total = one + two;
                answer.setText(" Your Answer Is = " +total);
            }
        });
         minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int one , two , total;
                one =Integer.parseInt(firstValue.getText().toString());
                two =Integer.parseInt(secondValue.getText().toString());
                total = one - two;
                answer.setText(" Your Answer Is = " +total);
            }
        });
         multy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int one , two , total;
                one =Integer.parseInt(firstValue.getText().toString());
                two =Integer.parseInt(secondValue.getText().toString());
                total = one * two;
                answer.setText(" Your Answer Is = " +total);
            }
        });
         div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int one , two , total;
                one =Integer.parseInt(firstValue.getText().toString());
                two =Integer.parseInt(secondValue.getText().toString());
                total = one / two;
                answer.setText(" Your Answer Is = " +total);
            }
        });

         layouts.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 Intent intent = new Intent(MainActivity.this , Layouts.class);
                 startActivity(intent);
             }
         });




















    }
}