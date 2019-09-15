package com.lokesh.interviewprep;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class isro1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isro1);

        WebView webview=new WebView(this);
        setContentView(webview);
        webview.loadUrl("https://www.quora.com/How-was-your-ISRO-interview-experience-1/answer/Vikas-Pandey-%E0%A4%B5%E0%A4%BF%E0%A4%95%E0%A4%BE%E0%A4%B8-%E0%A4%AA%E0%A4%BE%E0%A4%A3%E0%A5%8D%E0%A4%A1%E0%A5%87%E0%A4%AF?ch=3&share=07df086f&srid=hxfH4");
    }
}
