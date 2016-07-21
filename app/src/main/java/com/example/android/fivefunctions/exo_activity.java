package com.example.android.fivefunctions;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by ee5415 on 7/20/2016.
 */
public class exo_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exo_layout);

    }

    public void profile_link(View v)
    {
        String url = "https://en.wikipedia.org/wiki/Exo_(band)";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
    public void growl_youtube(View v)
    {
        String url = "https://youtu.be/I3dezFzsNss";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
    public void Call_me_baby_youtube(View v)
    {
        String url = "https://youtu.be/yWfsla_Uh80";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
    public void Monster_youtube(View v)
    {
        String url = "https://youtu.be/mcq_bAxwD4s";
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