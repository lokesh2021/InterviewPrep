package com.lokesh.interviewprep;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class google extends AppCompatActivity {
    private Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google);

        b= (Button)findViewById(R.id.google1);
        b.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View view)
                                 {
                                     Intent i = new Intent(google.this,google1.class);
                                     startActivity(i);
                                 }
                             }

        );

        b= (Button)findViewById(R.id.google2);
        b.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View view)
                                 {
                                     Intent i = new Intent(google.this,google2.class);
                                     startActivity(i);
                                 }
                             }

        );

        b= (Button)findViewById(R.id.google3);
        b.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View view)
                                 {
                                     Intent i = new Intent(google.this,google3.class);
                                     startActivity(i);
                                 }
                             }

        );

        b= (Button)findViewById(R.id.google4);
        b.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View view)
                                 {
                                     Intent i = new Intent(google.this,google4.class);
                                     startActivity(i);
                                 }
                             }

        );

        b= (Button)findViewById(R.id.google5);
        b.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View view)
                                 {
                                     Intent i = new Intent(google.this,google5.class);
                                     startActivity(i);
                                 }
                             }

        );

        b= (Button)findViewById(R.id.google6);
        b.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View view)
                                 {
                                     Intent i = new Intent(google.this,google6.class);
                                     startActivity(i);
                                 }
                             }

        );
    }
}
