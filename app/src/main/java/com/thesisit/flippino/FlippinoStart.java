package com.thesisit.flippino;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FlippinoStart extends AppCompatActivity {

    MediaPlayer mySound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flippino_start);
        mySound = MediaPlayer.create(this, R.raw.youmakemesmile);
        mySound.start();
    }

    public void startMagsimula(View view) {
        Intent intent = new Intent(this, NewUser.class);
        startActivity(intent);
    }

    public void startMagpatuloy(View view) {
        Intent intent = new Intent(this, PhonogramB.class);
        startActivity(intent);
    }
}
