package com.example.customviewapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ButtonActivity extends AppCompatActivity {

    Button rectangle,rounded,oval,circle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        rectangle=(Button)findViewById(R.id.rect);
        rounded=(Button)findViewById(R.id.round);
        oval=(Button)findViewById(R.id.oval);
        circle=(Button)findViewById(R.id.circle);

        rectangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ButtonActivity.this, "Rectangle Button Clicked", Toast.LENGTH_LONG).show();
            }
        });

        rounded.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ButtonActivity.this, "Rounded Button Clicked", Toast.LENGTH_LONG).show();
            }
        });

        oval.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ButtonActivity.this, "Oval Button Clicked", Toast.LENGTH_LONG).show();
            }
        });

        circle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ButtonActivity.this, "Circular Button Clicked", Toast.LENGTH_LONG).show();
            }
        });
    }
}
