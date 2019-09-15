package com.lokesh.interviewprep;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sportsa1 extends AppCompatActivity {

    private  Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sportsa1);

        b= (Button)findViewById(R.id.sportslinka1);
        b.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View view)
                                 {
                                     Intent i = new Intent(sportsa1.this,sportslinka1.class);
                                     startActivity(i);
                                 }
                             }

        );
    }
}
