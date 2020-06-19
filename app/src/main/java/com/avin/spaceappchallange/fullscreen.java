package com.avin.spaceappchallange;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ImageView;

public class fullscreen extends AppCompatActivity {
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullscreen);

        imageView = (ImageView) findViewById(R.id.image_view);
        getSupportActionBar().hide();
        Intent i = getIntent();
        int position = i.getExtras().getInt("id");

        ImageAdapter imageAdapter= new ImageAdapter(this);
        imageView.setImageResource(imageAdapter.imageArray[position]);





    }
}
