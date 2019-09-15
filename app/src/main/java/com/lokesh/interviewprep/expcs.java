package com.lokesh.interviewprep;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class expcs extends AppCompatActivity {
    private Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expcs2);

        b= (Button)findViewById(R.id.google);
        b.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View view)
                                 {
                                     Intent i = new Intent(expcs.this,google.class);
                                     startActivity(i);
                                 }
                             }

        );

        b= (Button)findViewById(R.id.microsoft);
        b.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View view)
                                 {
                                     Intent i = new Intent(expcs.this,microsoft.class);
                                     startActivity(i);
                                 }
                             }

        );

        b= (Button)findViewById(R.id.oracle);
        b.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View view)
                                 {
                                     Intent i = new Intent(expcs.this,oracle.class);
                                     startActivity(i);
                                 }
                             }

        );

        b= (Button)findViewById(R.id.amazon);
        b.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View view)
                                 {
                                     Intent i = new Intent(expcs.this,amazon.class);
                                     startActivity(i);
                                 }
                             }

        );

    }
}
