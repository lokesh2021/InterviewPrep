package com.lokesh.interviewprep;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class oracle2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oracle2);

        WebView webview=new WebView(this);
        setContentView(webview);
        webview.loadUrl("https://www.geeksforgeeks.org/oracle-interview-experience-set-22-on-campus-for-oracle-financial-services-software/");
    }
}
