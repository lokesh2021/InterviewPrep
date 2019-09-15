package com.lokesh.interviewprep;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class politics extends AppCompatActivity {

    private  Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_politics);

        b= (Button)findViewById(R.id.politicsq1);
        b.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View view)
                                 {
                                     Intent i = new Intent(politics.this,politicsa1.class);
                                     startActivity(i);
                                 }
                             }

        );

        b= (Button)findViewById(R.id.politicsq2);
        b.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View view)
                                 {
                                     Intent i = new Intent(politics.this,politicsa2.class);
                                     startActivity(i);
                                 }
                             }

        );

        b= (Button)findViewById(R.id.politicsq3);
        b.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View view)
                                 {
                                     Intent i = new Intent(politics.this,politicsa3.class);
                                     startActivity(i);
                                 }
                             }

        );

        b= (Button)findViewById(R.id.politicsq4);
        b.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View view)
                                 {
                                     Intent i = new Intent(politics.this,politicsa4.class);
                                     startActivity(i);
                                 }
                             }

        );


        b= (Button)findViewById(R.id.politicsq5);
        b.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View view)
                                 {
                                     Intent i = new Intent(politics.this,politicsa5.class);
                                     startActivity(i);
                                 }
                             }

        );

        b= (Button)findViewById(R.id.politicsq6);
        b.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View view)
                                 {
                                     Intent i = new Intent(politics.this,politicsa6.class);
                                     startActivity(i);
                                 }
                             }

        );

        b= (Button)findViewById(R.id.politicsq7);
        b.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View view)
                                 {
                                     Intent i = new Intent(politics.this,politicsa7.class);
                                     startActivity(i);
                                 }
                             }

        );

        b= (Button)findViewById(R.id.politicsq8);
        b.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View view)
                                 {
                                     Intent i = new Intent(politics.this,politicsa8.class);
                                     startActivity(i);
                                 }
                             }

        );
    }
}
