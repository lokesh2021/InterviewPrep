package com.lokesh.interviewprep;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class social extends AppCompatActivity {

    private Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social);

        b= (Button)findViewById(R.id.socialq1);
        b.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View view)
                                 {
                                     Intent i = new Intent(social.this,sociala1.class);
                                     startActivity(i);
                                 }
                             }

        );

        b= (Button)findViewById(R.id.socialq2);
        b.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View view)
                                 {
                                     Intent i = new Intent(social.this,sociala2.class);
                                     startActivity(i);
                                 }
                             }

        );

        b= (Button)findViewById(R.id.socialq3);
        b.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View view)
                                 {
                                     Intent i = new Intent(social.this,sociala3.class);
                                     startActivity(i);
                                 }
                             }

        );

        b= (Button)findViewById(R.id.socialq4);
        b.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View view)
                                 {
                                     Intent i = new Intent(social.this,sociala4.class);
                                     startActivity(i);
                                 }
                             }

        );


        b= (Button)findViewById(R.id.socialq5);
        b.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View view)
                                 {
                                     Intent i = new Intent(social.this,sociala5.class);
                                     startActivity(i);
                                 }
                             }

        );

        b= (Button)findViewById(R.id.socialq6);
        b.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View view)
                                 {
                                     Intent i = new Intent(social.this,sociala6.class);
                                     startActivity(i);
                                 }
                             }

        );

        b= (Button)findViewById(R.id.socialq7);
        b.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View view)
                                 {
                                     Intent i = new Intent(social.this,sociala7.class);
                                     startActivity(i);
                                 }
                             }

        );

        b= (Button)findViewById(R.id.socialq8);
        b.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View view)
                                 {
                                     Intent i = new Intent(social.this,sociala8.class);
                                     startActivity(i);
                                 }
                             }

        );
    }
}
