package com.lokesh.interviewprep;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class sociallinka2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sociallinka2);

        WebView webview=new WebView(this);
        setContentView(webview);
        webview.loadUrl("https://www.indiabix.com/group-discussion/love-marriages-vs-arranged-marriages/");
    }
}
