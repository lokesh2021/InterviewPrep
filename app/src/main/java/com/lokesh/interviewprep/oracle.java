package com.lokesh.interviewprep;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class oracle extends AppCompatActivity {

    private Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oracle);

        b= (Button)findViewById(R.id.oracle1);
        b.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View view)
                                 {
                                     Intent i = new Intent(oracle.this,oracle1.class);
                                     startActivity(i);
                                 }
                             }

        );

        b= (Button)findViewById(R.id.oracle2);
        b.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View view)
                                 {
                                     Intent i = new Intent(oracle.this,oracle2.class);
                                     startActivity(i);
                                 }
                             }

        );

        b= (Button)findViewById(R.id.oracle3);
        b.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View view)
                                 {
                                     Intent i = new Intent(oracle.this,oracle3.class);
                                     startActivity(i);
                                 }
                             }

        );

        b= (Button)findViewById(R.id.oracle4);
        b.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View view)
                                 {
                                     Intent i = new Intent(oracle.this,oracle4.class);
                                     startActivity(i);
                                 }
                             }

        );
    }
}
