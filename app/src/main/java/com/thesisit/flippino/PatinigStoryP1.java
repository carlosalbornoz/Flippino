package com.thesisit.flippino;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PatinigStoryP1 extends AppCompatActivity {

    char letter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle extras = getIntent().getExtras();
        letter = extras.getChar("letter");
        switch (letter) {
            case 'A':
                setContentView(R.layout.activity_astoryp1);
                break;
            case 'E':
                setContentView(R.layout.activity_estoryp1);
                break;
            case 'I':
                setContentView(R.layout.activity_istoryp1);
                break;
            case 'O':
                setContentView(R.layout.activity_ostoryp1);
                break;
            case 'U':
                setContentView(R.layout.activity_ustoryp1);
        }
    }

    /* public void next(View view) {
    } */
}
