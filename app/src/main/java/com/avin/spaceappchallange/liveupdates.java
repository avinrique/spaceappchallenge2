package com.avin.spaceappchallange;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class liveupdates extends AppCompatActivity {
    private WebView mywebview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liveupdates);
        mywebview = (WebView) findViewById(R.id.late);
        mywebview.loadUrl("https://www.worldometers.info/coronavirus/");
    }
}
