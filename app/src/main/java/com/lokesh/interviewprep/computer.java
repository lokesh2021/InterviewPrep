package com.lokesh.interviewprep;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class computer extends AppCompatActivity {
    private Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer);

        b= (Button)findViewById(R.id.c);
        b.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View view)
                                 {
                                     Intent i = new Intent(computer.this,c.class);
                                     startActivity(i);
                                 }
                             }

        );

        b= (Button)findViewById(R.id.java);
        b.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View view)
                                 {
                                     Intent i = new Intent(computer.this,j.class);
                                     startActivity(i);
                                 }
                             }

        );

        b= (Button)findViewById(R.id.python);
        b.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View view)
                                 {
                                     Intent i = new Intent(computer.this,p.class);
                                     startActivity(i);
                                 }
                             }

        );
    }
}
