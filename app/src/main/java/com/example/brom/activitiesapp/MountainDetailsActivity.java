package com.example.brom.activitiesapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MountainDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mountaindetails);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Intent intent = getIntent();
        String locations = intent.getStringExtra("mountainLocations");
        String names = intent.getStringExtra("mountainNames");
        String heights = intent.getStringExtra("mountainHeights");

        TextView myTextView = (TextView)findViewById(R.id.myTextView);
        myTextView.setText("Namn: " + names + '\n' + "Plats: "+ locations + '\n' + "Höjd: "+ heights);
    }

}


