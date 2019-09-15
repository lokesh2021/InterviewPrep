package com.lokesh.interviewprep;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class google3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google3);

        WebView webview=new WebView(this);
        setContentView(webview);
        webview.loadUrl("https://www.geeksforgeeks.org/google-mountain-view-interview/");
    }
}
