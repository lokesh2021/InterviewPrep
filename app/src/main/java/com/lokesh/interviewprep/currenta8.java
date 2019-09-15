package com.lokesh.interviewprep;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class currenta8 extends AppCompatActivity {

    private  Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currenta8);

        b= (Button)findViewById(R.id.currentlinka8);
        b.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View view)
                                 {
                                     Intent i = new Intent(currenta8.this,currentlinka8.class);
                                     startActivity(i);
                                 }
                             }

        );


    }
}
