package com.example.android.fivefunctions;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by ee5415 on 7/20/2016.
 */
public class bangtan_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bangtan_layout);

    }

    public void profile_link(View v)
    {
        String url = "https://en.wikipedia.org/wiki/BTS_(band)";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
    public void Fire_youtube(View v)
    {
        String url = "https://youtu.be/shcBoNpAEBk";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
    public void Danger_youtube (View v)
    {
        String url = "https://youtu.be/43r6lXilbcQ";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
    public void I_need_you_youtube(View v)
    {
        String url = "https://youtu.be/DOuhvBJqKVY";
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
