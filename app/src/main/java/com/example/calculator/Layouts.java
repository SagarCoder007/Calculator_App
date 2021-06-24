package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Layouts extends AppCompatActivity {

    Button line , reel , cons ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layouts);

        line = findViewById(R.id.lenon);
        reel = findViewById(R.id.relate);
        cons = findViewById(R.id.constraint);

        line.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Layouts.this , leonLayout.class);
                startActivity(intent);
            }
        });

        reel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Layouts.this , relativelay.class);
                startActivity(intent);
            }
        });

        cons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Layouts.this , constaint.class);
                startActivity(intent);
            }
        });














    }
}