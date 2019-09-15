package com.lokesh.interviewprep;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class current extends AppCompatActivity {
    private Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current);

        b= (Button)findViewById(R.id.currentq1);
        b.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View view)
                                 {
                                     Intent i = new Intent(current.this,currenta1.class);
                                     startActivity(i);
                                 }
                             }

        );

        b= (Button)findViewById(R.id.currentq3);
        b.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View view)
                                 {
                                     Intent i = new Intent(current.this,currenta3.class);
                                     startActivity(i);
                                 }
                             }

        );

        b= (Button)findViewById(R.id.currentq2);
        b.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View view)
                                 {
                                     Intent i = new Intent(current.this,currenta2.class);
                                     startActivity(i);
                                 }
                             }

        );

        b= (Button)findViewById(R.id.currentq4);
        b.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View view)
                                 {
                                     Intent i = new Intent(current.this,currenta4.class);
                                     startActivity(i);
                                 }
                             }

        );


        b= (Button)findViewById(R.id.currentq5);
        b.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View view)
                                 {
                                     Intent i = new Intent(current.this,currenta5.class);
                                     startActivity(i);
                                 }
                             }

        );

        b= (Button)findViewById(R.id.currentq6);
        b.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View view)
                                 {
                                     Intent i = new Intent(current.this,currenta6.class);
                                     startActivity(i);
                                 }
                             }

        );

        b= (Button)findViewById(R.id.currentq7);
        b.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View view)
                                 {
                                     Intent i = new Intent(current.this,currenta7.class);
                                     startActivity(i);
                                 }
                             }

        );

        b= (Button)findViewById(R.id.currentq8);
        b.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View view)
                                 {
                                     Intent i = new Intent(current.this,currenta8.class);
                                     startActivity(i);
                                 }
                             }

        );


    }
}
