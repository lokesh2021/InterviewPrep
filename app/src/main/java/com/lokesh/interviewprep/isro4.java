package com.lokesh.interviewprep;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class isro4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isro4);

        WebView webview=new WebView(this);
        setContentView(webview);
        webview.loadUrl("https://www.quora.com/How-was-your-ISRO-interview-experience-1/answer/Mohnish-Chaurasiya?ch=3&share=72aaaf40&srid=hxfH4");
    }
}
