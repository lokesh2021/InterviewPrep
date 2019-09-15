package com.lokesh.interviewprep;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class oracle3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oracle3);

        WebView webview=new WebView(this);
        setContentView(webview);
        webview.loadUrl("https://www.geeksforgeeks.org/oracle-interview-experience-set-34-on-campus-for-application-developer/");
    }
}
