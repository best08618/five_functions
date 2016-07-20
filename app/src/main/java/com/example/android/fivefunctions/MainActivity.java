package com.example.android.fivefunctions;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        public void exoscript(View v) {
            Intent intent = new Intent(this,exo_activity.class);
            startActivity(intent);
        }

    public void bigbangscript(View v)
    {
        Intent intent = new Intent(this, bigbang_activity.class);
        startActivity(intent);
    }
    public void twicescript(View v)
    {
        Intent intent = new Intent(this, twice_activity.class);
        startActivity(intent);
    }
    public void bangtanscript(View v)
    {
        Intent intent = new Intent(this, bangtan_activity.class);
        startActivity(intent);
    }
}
