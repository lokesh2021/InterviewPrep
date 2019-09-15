package com.lokesh.interviewprep;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sociala8 extends AppCompatActivity {

    private  Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sociala8);

        b= (Button)findViewById(R.id.sociallinka8);
        b.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View view)
                                 {
                                     Intent i = new Intent(sociala8.this,sociallinka8.class);
                                     startActivity(i);
                                 }
                             }

        );
    }
}
