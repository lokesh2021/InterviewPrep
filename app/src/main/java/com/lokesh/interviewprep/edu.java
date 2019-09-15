package com.lokesh.interviewprep;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class edu extends AppCompatActivity {

    private Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edu);

        b= (Button)findViewById(R.id.eduq1);
        b.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View view)
                                 {
                                     Intent i = new Intent(edu.this,edua1.class);
                                     startActivity(i);
                                 }
                             }

        );

        b= (Button)findViewById(R.id.eduq2);
        b.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View view)
                                 {
                                     Intent i = new Intent(edu.this,edua2.class);
                                     startActivity(i);
                                 }
                             }

        );

        b= (Button)findViewById(R.id.eduq3);
        b.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View view)
                                 {
                                     Intent i = new Intent(edu.this,edua3.class);
                                     startActivity(i);
                                 }
                             }

        );

        b= (Button)findViewById(R.id.eduq4);
        b.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View view)
                                 {
                                     Intent i = new Intent(edu.this,edua4.class);
                                     startActivity(i);
                                 }
                             }

        );


        b= (Button)findViewById(R.id.eduq5);
        b.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View view)
                                 {
                                     Intent i = new Intent(edu.this,edua5.class);
                                     startActivity(i);
                                 }
                             }

        );

        b= (Button)findViewById(R.id.eduq6);
        b.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View view)
                                 {
                                     Intent i = new Intent(edu.this,edua6.class);
                                     startActivity(i);
                                 }
                             }

        );

        b= (Button)findViewById(R.id.eduq7);
        b.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View view)
                                 {
                                     Intent i = new Intent(edu.this,edua7.class);
                                     startActivity(i);
                                 }
                             }

        );

        b= (Button)findViewById(R.id.eduq8);
        b.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View view)
                                 {
                                     Intent i = new Intent(edu.this,edua8.class);
                                     startActivity(i);
                                 }
                             }

        );
    }
}
