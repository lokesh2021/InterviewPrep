package com.lokesh.interviewprep;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class amazon extends AppCompatActivity {

    private Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amazon);

        b= (Button)findViewById(R.id.amazon1);
        b.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View view)
                                 {
                                     Intent i = new Intent(amazon.this,amazon1.class);
                                     startActivity(i);
                                 }
                             }

        );

        b= (Button)findViewById(R.id.amazon2);
        b.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View view)
                                 {
                                     Intent i = new Intent(amazon.this,amazon2.class);
                                     startActivity(i);
                                 }
                             }

        );

        b= (Button)findViewById(R.id.amazon3);
        b.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View view)
                                 {
                                     Intent i = new Intent(amazon.this,amazon3.class);
                                     startActivity(i);
                                 }
                             }

        );

        b= (Button)findViewById(R.id.amazon4);
        b.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View view)
                                 {
                                     Intent i = new Intent(amazon.this,amazon4.class);
                                     startActivity(i);
                                 }
                             }

        );
    }
}
