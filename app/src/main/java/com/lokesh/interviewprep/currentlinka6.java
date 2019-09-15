package com.lokesh.interviewprep;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class currentlinka6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currentlinka6);

        WebView webview=new WebView(this);
        setContentView(webview);
        webview.loadUrl("https://www.indiabix.com/group-discussion/youth-in-politics/");
    }
}
