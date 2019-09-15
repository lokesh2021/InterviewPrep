package com.lokesh.interviewprep;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class gd extends AppCompatActivity {
    private Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gd);

        b= (Button)findViewById(R.id.current);
        b.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View view)
                                 {
                                     Intent i = new Intent(gd.this,current.class);
                                     startActivity(i);
                                 }
                             }

        );

        b= (Button)findViewById(R.id.social);
        b.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View view)
                                 {
                                     Intent i = new Intent(gd.this,social.class);
                                     startActivity(i);
                                 }
                             }

        );

        b= (Button)findViewById(R.id.politics);
        b.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View view)
                                 {
                                     Intent i = new Intent(gd.this,politics.class);
                                     startActivity(i);
                                 }
                             }

        );

        b= (Button)findViewById(R.id.edu);
        b.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View view)
                                 {
                                     Intent i = new Intent(gd.this,edu.class);
                                     startActivity(i);
                                 }
                             }

        );

        b= (Button)findViewById(R.id.sports);
        b.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View view)
                                 {
                                     Intent i = new Intent(gd.this,sports.class);
                                     startActivity(i);
                                 }
                             }

        );

    }
}
