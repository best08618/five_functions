package com.example.android.fivefunctions;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by ee5415 on 7/20/2016.
 */
public class bigbang_activity  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bigbang_layout);

    }

    public void profile_link(View v)
    {
        String url = "https://en.wikipedia.org/wiki/Big_Bang_(South_Korean_band)";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
    public void bangbangbang_youtube(View v)
    {
        String url = "https://youtu.be/2ips2mM7Zqw";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
    public void fantastic_youtube(View v)
    {
        String url = "https://youtu.be/AAbokV76tkU";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
    public void loser_youtube(View v)
    {
        String url = "https://youtu.be/1CTced9CMMk";
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