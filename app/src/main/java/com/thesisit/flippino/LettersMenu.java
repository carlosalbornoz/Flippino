package com.thesisit.flippino;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LettersMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lettersmenu);
    }

    public void startPatinig(View view) {
        Intent intent = new Intent(this, LettersSubPatinig.class);
        startActivity(intent);
    }

    public void startKatinig(View view) {
        Intent intent = new Intent(this, LettersSubKatinig.class);
        startActivity(intent);
    }

    public void startHiram(View view) {
        Intent intent = new Intent(this, LettersSubHiram.class);
        startActivity(intent);
    }

    public void startALog(View view) {
 //       Intent intent = new Intent(this, FlippinoMainMenu.class);
 //       startActivity(intent);
    }

    public void exit(View view) {
        Intent intent = new Intent(this, FlippinoMainMenu.class);
        startActivity(intent);
    }
}
