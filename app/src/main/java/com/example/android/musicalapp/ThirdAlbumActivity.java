package com.example.android.musicalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.example.android.musicalapp.R.id.thirdAlbum;

public class ThirdAlbumActivity extends AppCompatActivity implements View.OnClickListener{
    private Button fourthAlbum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_album);
        fourthAlbum = (Button) findViewById(R.id.NextPage);
        fourthAlbum.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(ThirdAlbumActivity.this, FourthAlbumActivity.class);
        startActivity(intent);
    }
}
