package com.example.android.fivefunctions;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by ee5415 on 7/20/2016.
 */
public class twice_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.twice_layout);

    }

    public void profile_link(View v)
    {
        String url = "https://en.wikipedia.org/wiki/Twice_(band)";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
    public void cheerup_youtube(View v)
    {
        String url = "https://youtu.be/c7rCyll5AeY";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
    public void oohahh_youtube(View v)
    {
        String url = "https://youtu.be/0rtV5esQT6I";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
    public void begin_youtube(View v)
    {
        String url = "https://youtu.be/H-c2eaBAmKI";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    public void back(View v)
    {

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }



}
