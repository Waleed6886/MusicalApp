package com.example.android.musicalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.android.musicalapp.R.id.secondAlbum;
import static com.example.android.musicalapp.R.id.thirdAlbum;

public class SecondAlbumActivity extends AppCompatActivity  implements View.OnClickListener{
    private Button thirdAlbum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_album);
          thirdAlbum = (Button) findViewById(R.id.NextPage);
          thirdAlbum.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(SecondAlbumActivity.this, ThirdAlbumActivity.class);
        startActivity(intent);
    }
}

