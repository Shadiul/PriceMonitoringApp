package com.example.pricemonitoringapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class SearchResult extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_result);

        getSupportActionBar().setTitle("Search Result");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
