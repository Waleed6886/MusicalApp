package com.example.android.musicalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.example.android.musicalapp.R.id.fifthAlbum;
import static com.example.android.musicalapp.R.id.fourthAlbum;

public class FifthAlbumActivity extends AppCompatActivity implements View.OnClickListener {
    private Button firstAlbum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth_album);
        firstAlbum = (Button) findViewById(R.id.NextPage);
        firstAlbum.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(FifthAlbumActivity.this, FirstAlbumActivity.class);
        startActivity(intent);
    }
}


