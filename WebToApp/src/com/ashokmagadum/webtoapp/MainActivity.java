package com.ashokmagadum.webtoapp;


import android.app.Activity;
import android.os.Bundle;

import android.webkit.WebSettings;
import android.webkit.WebView;

 public class MainActivity extends Activity {

	
	private WebView mWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        mWebView =(WebView)findViewById(R.id.activity_main_webview);
        WebSettings webSettings=mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mWebView.loadUrl("http://www.onlinesbi.com");
    }


}
