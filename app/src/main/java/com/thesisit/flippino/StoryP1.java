package com.thesisit.flippino;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class StoryP1 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle extras = getIntent().getExtras();
        char letter = extras.getChar("letter");
        switch (letter) {
            //PATINIG
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
                break;

            // KATINIG
            // TLH
            case 'T':
                setContentView(R.layout.activity_tlh_story_p1);
                break;
            // NDK
            case 'N':
                setContentView(R.layout.activity_ndk_story_p1);
                break;
            // WYS
            case 'W':
                setContentView(R.layout.activity_wys_story_p1);
                break;
            // GPR
            case 'G':
                setContentView(R.layout.activity_gpr_story_p1);
                break;
            // BMNg
            case 'B':
                setContentView(R.layout.activity_bmng_story_p1);
                break;

            // HIRAM
            // NJCF
            case 'J':
                setContentView(R.layout.activity_njcf_story_p1);
                break;
            // VZ
            case 'V':
                setContentView(R.layout.activity_vzstoryp1);
                break;
            // XQu
            case 'X':
                setContentView(R.layout.activity_xqustoryp1);
                break;
        }
    }

    //PATINIG
    public void p2A(View view) {
        Intent intent = new Intent(this, StoryP2.class);
        char letter = 'A';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }

    public void p2E(View view) {
        Intent intent = new Intent(this, StoryP2.class);
        char letter = 'E';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }

    public void p2I(View view) {
        Intent intent = new Intent(this, StoryP2.class);
        char letter = 'I';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }

    public void p2O(View view) {
        Intent intent = new Intent(this, StoryP2.class);
        char letter = 'O';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }

    public void p2U(View view) {
        Intent intent = new Intent(this, StoryP2.class);
        char letter = 'U';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }

    //KATINIG
    // TLH
    public void letterL(View view) {
        Intent intent = new Intent(this, LetterIntro.class);
        char letter = 'L';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }

    // NDK
    public void letterK(View view) {
        Intent intent = new Intent(this, LetterIntro.class);
        char letter = 'K';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }

    // WYS
    public void letterW(View view) {
        Intent intent = new Intent(this, LetterIntro.class);
        char letter = 'W';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }

    // GPR
    public void letterG(View view) {
        Intent intent = new Intent(this, LetterIntro.class);
        char letter = 'G';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }

    // BMNg
    public void letterB(View view) {
        Intent intent = new Intent(this, LetterIntro.class);
        char letter = 'B';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }

    // HIRAM
    // NJCF
    public void letterC(View view) {
        Intent intent = new Intent(this, LetterIntro.class);
        char letter = 'C';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }

    // VZ
    public void p2VZ(View view) {
        Intent intent = new Intent(this, StoryP2.class);
        char letter = 'V';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }

    // XQu
    public void letterX(View view) {
        Intent intent = new Intent(this, LetterIntro.class);
        char letter = 'X';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }
}
