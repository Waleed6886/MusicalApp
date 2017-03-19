package com.example.android.musicalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

import static android.R.attr.button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView firstAlbum, secondAlbum, thirdAlbum, fourthAlbum, fifthAlbum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstAlbum  = (TextView) findViewById(R.id.firstAlbum);
        secondAlbum = (TextView) findViewById(R.id.secondAlbum);
        thirdAlbum  = (TextView) findViewById(R.id.thirdAlbum);
        fourthAlbum = (TextView) findViewById(R.id.fourthAlbum);
        fifthAlbum = (TextView) findViewById(R.id.fifthAlbum);
        firstAlbum.setOnClickListener(this);
        secondAlbum.setOnClickListener(this);
        thirdAlbum.setOnClickListener(this);
        fourthAlbum.setOnClickListener(this);
        fifthAlbum.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        int id = v.getId();
        Intent intent =null;
        switch(id) {
            case R.id.firstAlbum:
                intent = new Intent(MainActivity.this , FirstAlbumActivity.class);
                break;
            case R.id.secondAlbum:
                intent = new Intent(MainActivity.this , SecondAlbumActivity.class);
                break;
            case R.id.thirdAlbum:
                intent = new Intent(MainActivity.this , ThirdAlbumActivity.class);
                break;
            case R.id.fourthAlbum:
                intent = new Intent(MainActivity.this , FourthAlbumActivity.class);
                break;
            case R.id.fifthAlbum:
                intent = new Intent(MainActivity.this , FifthAlbumActivity.class);
                break;
        }
        startActivity(intent);
    }
}

