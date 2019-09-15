package com.lokesh.interviewprep;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class isro extends AppCompatActivity {
    private Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isro);

        b= (Button)findViewById(R.id.isro1);
        b.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View view)
                                 {
                                     Intent i = new Intent(isro.this,isro1.class);
                                     startActivity(i);
                                 }
                             }

        );

        b= (Button)findViewById(R.id.isro2);
        b.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View view)
                                 {
                                     Intent i = new Intent(isro.this,isro2.class);
                                     startActivity(i);
                                 }
                             }

        );

        b= (Button)findViewById(R.id.isro3);
        b.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View view)
                                 {
                                     Intent i = new Intent(isro.this,isro3.class);
                                     startActivity(i);
                                 }
                             }

        );

        b= (Button)findViewById(R.id.isro4);
        b.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View view)
                                 {
                                     Intent i = new Intent(isro.this,isro4.class);
                                     startActivity(i);
                                 }
                             }

        );


        b= (Button)findViewById(R.id.isro5);
        b.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View view)
                                 {
                                     Intent i = new Intent(isro.this,isro5.class);
                                     startActivity(i);
                                 }
                             }

        );
    }
}
