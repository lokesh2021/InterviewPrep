package com.lokesh.interviewprep;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class isro3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isro3);

        WebView webview=new WebView(this);
        setContentView(webview);
        webview.loadUrl("https://www.quora.com/How-was-your-ISRO-interview-experience-1/answer/Das-Poddaturi?ch=3&share=f5b0e3af&srid=hxfH4");
    }
}
