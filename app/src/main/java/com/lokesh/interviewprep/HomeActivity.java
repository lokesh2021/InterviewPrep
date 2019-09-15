package com.lokesh.interviewprep;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import com.github.clans.fab.FloatingActionButton;

public class HomeActivity extends AppCompatActivity {

    private FloatingActionButton bt;

    private  ImageButton b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        b= (ImageButton) findViewById(R.id.tech);
        b.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View view)
                                 {
                                     Intent i = new Intent(HomeActivity.this,course.class);
                                     startActivity(i);
                                 }
                             }

        );

        b= (ImageButton) findViewById(R.id.basic);
        b.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View view)
                                 {
                                     Intent i = new Intent(HomeActivity.this,common.class);
                                     startActivity(i);
                                 }
                             }

        );

        b= (ImageButton) findViewById(R.id.experience);
        b.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View view)
                                 {
                                     Intent i = new Intent(HomeActivity.this,exp.class);
                                     startActivity(i);
                                 }
                             }

        );

        b= (ImageButton) findViewById(R.id.tips);
        b.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View view)
                                 {
                                     Intent i = new Intent(HomeActivity.this,itips.class);
                                     startActivity(i);
                                 }
                             }

        );

        b= (ImageButton) findViewById(R.id.aptitude);
        b.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View view)
                                 {
                                     Intent i = new Intent(HomeActivity.this,aptitude.class);
                                     startActivity(i);
                                 }
                             }

        );

        b= (ImageButton) findViewById(R.id.gd);
        b.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View view)
                                 {
                                     Intent i = new Intent(HomeActivity.this,gd.class);
                                     startActivity(i);
                                 }
                             }

        );

        b= (ImageButton) findViewById(R.id.resume);
        b.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View view)
                                 {
                                     Intent i = new Intent(HomeActivity.this,Resume.class);
                                     startActivity(i);
                                 }
                             }

        );

        bt= (FloatingActionButton) findViewById(R.id.menu_feedback);
        bt.setOnClickListener(new View.OnClickListener(){
                                  @Override
                                  public void onClick(View view)
                                  {
                                      Intent intent=new Intent();
                                      intent.setAction(Intent.ACTION_VIEW);
                                      intent.addCategory(Intent.CATEGORY_BROWSABLE);
                                      intent.setData(Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSd6VEfTN5ahxxzEDcOTqfP_q7OdbLMnZZhhPFeM3R2q61wpjw/viewform"));
                                      startActivity(intent);
                                  }
                              }

        );


        bt= (FloatingActionButton) findViewById(R.id.menu_updates);
        bt.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View view)
                                 {
                                     Intent intent=new Intent();
                                     intent.setAction(Intent.ACTION_VIEW);
                                     intent.addCategory(Intent.CATEGORY_BROWSABLE);
                                     intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.lokesh.interviewprep"));
                                     startActivity(intent);
                                 }
                             }

        );

        bt= (FloatingActionButton) findViewById(R.id.menu_rate);
        bt.setOnClickListener(new View.OnClickListener(){
                                  @Override
                                  public void onClick(View view)
                                  {
                                      Intent intent=new Intent();
                                      intent.setAction(Intent.ACTION_VIEW);
                                      intent.addCategory(Intent.CATEGORY_BROWSABLE);
                                      intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.lokesh.interviewprep"));
                                      startActivity(intent);
                                  }
                              }

        );

        bt= (FloatingActionButton) findViewById(R.id.menu_about);
        bt.setOnClickListener(new View.OnClickListener(){
                                  @Override
                                  public void onClick(View view)
                                  {
                                      Intent i = new Intent(HomeActivity.this,about.class);
                                      startActivity(i);
                                  }
                              }

        );

        bt= (FloatingActionButton) findViewById(R.id.menu_share);
        bt.setOnClickListener(new View.OnClickListener(){
                                  @Override
                                  public void onClick(View view)
                                  {
                                      Intent myIntent=new Intent((Intent.ACTION_SEND));
                                      myIntent.setType("text/plain");
                                      String shareSub ="Check this app for all your Interview preparartion needs:-" +
                                              "https://play.google.com/store/apps/details?id=com.lokesh.interviewprep";
                                      myIntent.putExtra(Intent.EXTRA_TEXT,shareSub);
                                      startActivity(Intent.createChooser(myIntent,"share using"));
                                  }
                              }

        );
    }
}

