package com.example.android.musicalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.example.android.musicalapp.R.id.fourthAlbum;

public class FourthAlbumActivity extends AppCompatActivity implements View.OnClickListener {
    private Button fifthAlbum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_album);
        fifthAlbum = (Button) findViewById(R.id.NextPage);
        fifthAlbum.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(FourthAlbumActivity.this, FifthAlbumActivity.class);
        startActivity(intent);
    }
}
