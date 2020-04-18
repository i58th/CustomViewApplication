package com.example.customviewapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    Button customButton,customCheck,customRadio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        customButton=(Button)findViewById(R.id.customButton);
        customCheck=(Button)findViewById(R.id.customCheck);
        customRadio=(Button)findViewById(R.id.customRadio);

        customButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this,"You Selected Custom Button",Toast.LENGTH_LONG).show();
                Intent intent= new Intent(MainActivity.this,ButtonActivity.class);
                startActivity(intent);
            }
        });
        customCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"You Selected Custom CheckBox",Toast.LENGTH_LONG).show();
                Intent intent= new Intent(MainActivity.this, CheckActivity.class);
                startActivity(intent);
            }
        });
        customRadio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"You Selected Custom RadioButton",Toast.LENGTH_LONG).show();
                Intent intent= new Intent(MainActivity.this,RadioActivity.class);
                startActivity(intent);
            }
        });
    }
}
