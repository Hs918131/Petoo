package com.example.petoo.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import com.example.petoo.R;

public class MainActivity extends AppCompatActivity {

    Button checkbox,checkbox2,checkbox3,checkbox4,checkbox5,checkbox6,checkbox7,checkbox8;
    String totalbill;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkbox = findViewById(R.id.checkBox);
        checkbox2 = findViewById(R.id.checkBox2);
        checkbox3 = findViewById(R.id.checkBox3);
        checkbox4 = findViewById(R.id.checkBox4);
        checkbox5 = findViewById(R.id.checkBox5);
        checkbox6 = findViewById(R.id.checkBox6);
        checkbox7 = findViewById(R.id.checkBox7);
        checkbox8 = findViewById(R.id.checkBox8);


        checkbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Added Burger : Rs60/-", Toast.LENGTH_SHORT).show();
            }

        });


        checkbox2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Added Pizza : Rs100/-", Toast.LENGTH_SHORT).show();
            }

        });
        checkbox3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Added Garlic Bread : Rs80/-", Toast.LENGTH_SHORT).show();
            }

        });

        checkbox4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Added Fries : Rs40/-", Toast.LENGTH_SHORT).show();
            }

        });

        checkbox5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Added Chowmein : Rs40/-", Toast.LENGTH_SHORT).show();
            }

        });

        checkbox6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Added Coffee : Rs30/-", Toast.LENGTH_SHORT).show();
            }

        });

        checkbox7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Added Mojito : Rs50/-", Toast.LENGTH_SHORT).show();
            }

        });

        checkbox8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Added Tea : Rs10/-", Toast.LENGTH_SHORT).show();
            }

        });



            ConstraintLayout cartbtn=findViewById(R.id.cartbtn);
            cartbtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(MainActivity.this,CartActivity.class ));
                }
            });



    }
}