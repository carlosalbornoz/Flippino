package com.thesisit.flippino;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LettersSubPatinig extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patinigmenu);
    }

    public void startA(View view) {
        Intent intent = new Intent(this, PatinigStoryP1.class);
        char letter = 'A';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }

    public void startE(View view) {
        Intent intent = new Intent(this, PatinigStoryP1.class);
        char letter = 'E';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }

    public void startI(View view) {
        Intent intent = new Intent(this, PatinigStoryP1.class);
        char letter = 'I';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }

    public void startO(View view) {
        Intent intent = new Intent(this, PatinigStoryP1.class);
        char letter = 'O';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }

    public void startU(View view) {
        Intent intent = new Intent(this, PatinigStoryP1.class);
        char letter = 'U';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }
}
