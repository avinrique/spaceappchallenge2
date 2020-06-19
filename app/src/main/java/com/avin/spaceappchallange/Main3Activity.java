package com.avin.spaceappchallange;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class Main3Activity extends AppCompatActivity {
    TextView textView;

    private AppBarConfiguration mAppBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main3, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }

    public void browser1(MenuItem item) {
        Intent broserintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.aljazeera.com/news/2020/04/countries-reported-coronavirus-cases-200412093314762.html"));
        startActivity(broserintent);
    }

    public void browser2(MenuItem item) {
        Intent broserintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.spaceappschallenge.org/"));
        startActivity(broserintent);

    }

    public void browser3(MenuItem item) {
        Intent intent = new Intent(Main3Activity.this,Main4Activity.class);
        startActivity(intent);
    }

    public void browser4(MenuItem item) {
        Intent intent = new Intent(Main3Activity.this,gallary.class);
        startActivity(intent);
    }

    public void browser5(MenuItem item) {
        Intent intent = new Intent(Main3Activity.this,Aboutus.class);
        startActivity(intent);


    }
    public void livee(MenuItem item) {
        Intent intent = new Intent(Main3Activity.this,liveupdates.class);
        startActivity(intent);

    }

    public void browser6(MenuItem item) {
        Intent intent = new Intent(Main3Activity.this,Main5Activity.class);
        startActivity(intent);

    }
}
