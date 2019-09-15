package com.lokesh.interviewprep;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class course extends AppCompatActivity {

    private Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);

        b= (Button)findViewById(R.id.ae);
        b.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View view)
                                 {
                                     Intent i = new Intent(course.this,aeronautical.class);
                                     startActivity(i);
                                 }
                             }
        );

                b= (Button)findViewById(R.id.cs);
        b.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View view)
                                 {
                                     Intent i = new Intent(course.this,computer.class);
                                     startActivity(i);
                                 }
                             }

        );



            b= (Button)findViewById(R.id.ee);
        b.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View view)
                                 {
                                     Intent i = new Intent(course.this,electrical.class);
                                     startActivity(i);
                                 }
                             }

        );

             b= (Button)findViewById(R.id.me);
        b.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View view)
                                 {
                                     Intent i = new Intent(course.this,mechanical.class);
                                     startActivity(i);
                                 }
                             }

        );


    }
    }

