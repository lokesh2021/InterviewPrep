package com.lokesh.interviewprep;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Resume extends AppCompatActivity {
    private Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resume);

        b= (Button)findViewById(R.id.chronological);
        b.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View view)
                                 {
                                     Intent i = new Intent(Resume.this,chronological.class);
                                     startActivity(i);
                                 }
                             }
        );


                b= (Button)findViewById(R.id.functional);
        b.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View view)
                                 {
                                     Intent i = new Intent(Resume.this,functional.class);
                                     startActivity(i);
                                 }
                             }

        );

        b= (Button)findViewById(R.id.hybrid);
        b.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View view)
                                 {
                                     Intent i = new Intent(Resume.this,hybrid.class);
                                     startActivity(i);
                                 }
                             }
        );

        b= (Button)findViewById(R.id.resumelink);
        b.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View view)
                                 {
                                     Intent intent=new Intent();
                                     intent.setAction(Intent.ACTION_VIEW);
                                     intent.addCategory(Intent.CATEGORY_BROWSABLE);
                                     intent.setData(Uri.parse("https://vinaysomawat.github.io/Resume-Builder/"));
                                     startActivity(intent);
                                 }
                             }
        );
    }


    }

