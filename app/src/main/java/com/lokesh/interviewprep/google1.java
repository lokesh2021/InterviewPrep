package com.lokesh.interviewprep;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class google1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google1);

        WebView webview=new WebView(this);
        setContentView(webview);
        webview.loadUrl("https://www.geeksforgeeks.org/google-interview-experience-for-the-post-of-technical-operations-specialisttools-team-adwords-hyderabadindia/");
    }
}
