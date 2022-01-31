package com.example.lab10_webviewresponsive_2021855398;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
    private WebView web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        web = (WebView) findViewById(R.id.web);
        web.loadUrl("file:///android_asset/www/index.html");
        //web.loadUrl("https://www.google.com");
    }
}