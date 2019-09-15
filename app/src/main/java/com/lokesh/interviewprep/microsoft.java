package com.lokesh.interviewprep;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class microsoft extends AppCompatActivity {

    private Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_microsoft);

        b= (Button)findViewById(R.id.microsoft1);
        b.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View view)
                                 {
                                     Intent i = new Intent(microsoft.this,microsoft1.class);
                                     startActivity(i);
                                 }
                             }

        );

        b= (Button)findViewById(R.id.microsoft2);
        b.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View view)
                                 {
                                     Intent i = new Intent(microsoft.this,microsoft2.class);
                                     startActivity(i);
                                 }
                             }

        );

        b= (Button)findViewById(R.id.microsoft3);
        b.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View view)
                                 {
                                     Intent i = new Intent(microsoft.this,microsoft3.class);
                                     startActivity(i);
                                 }
                             }

        );

        b= (Button)findViewById(R.id.microsoft4);
        b.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View view)
                                 {
                                     Intent i = new Intent(microsoft.this,microsoft4.class);
                                     startActivity(i);
                                 }
                             }

        );
    }
}
