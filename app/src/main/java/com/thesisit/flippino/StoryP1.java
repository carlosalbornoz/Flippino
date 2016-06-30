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
            // WY
            case 'W':
                //setContentView(R.layout.activity_wy_story_p1);
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
    public void letterA(View view) {
        Intent intent = new Intent(this, LetterIntro.class);
        char letter = 'A';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }
    public void letterE(View view) {
        Intent intent = new Intent(this, LetterIntro.class);
        char letter = 'E';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }
    public void letterI(View view) {
        Intent intent = new Intent(this, LetterIntro.class);
        char letter = 'I';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }
    public void letterO(View view) {
        Intent intent = new Intent(this, LetterIntro.class);
        char letter = 'O';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }
    public void letterU(View view) {
        Intent intent = new Intent(this, LetterIntro.class);
        char letter = 'U';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }

//KATINIG
    // TLH
    public void letterT(View view) {
        Intent intent = new Intent(this, LetterIntro.class);
        char letter = 'T';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }
    public void letterL(View view) {
        Intent intent = new Intent(this, LetterIntro.class);
        char letter = 'L';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }
    public void letterH(View view) {
        Intent intent = new Intent(this, LetterIntro.class);
        char letter = 'H';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }

    // NDK
    public void letterN(View view) {
        Intent intent = new Intent(this, LetterIntro.class);
        char letter = 'N';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }
    public void letterD(View view) {
        Intent intent = new Intent(this, LetterIntro.class);
        char letter = 'D';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }
    public void letterK(View view) {
        Intent intent = new Intent(this, LetterIntro.class);
        char letter = 'K';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }

    // WY
    public void letterW(View view) {
        Intent intent = new Intent(this, LetterIntro.class);
        char letter = 'W';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }
    public void letterY(View view) {
        Intent intent = new Intent(this, LetterIntro.class);
        char letter = 'Y';
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
    public void letterP(View view) {
        Intent intent = new Intent(this, LetterIntro.class);
        char letter = 'P';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }
    public void letterR(View view) {
        Intent intent = new Intent(this, LetterIntro.class);
        char letter = 'R';
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
    public void letterM(View view) {
        Intent intent = new Intent(this, LetterIntro.class);
        char letter = 'M';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }
    public void letterNg(View view) {
        Intent intent = new Intent(this, LetterIntro.class);
        char letter = ']';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }

// HIRAM
    // NJCF
    public void letterEne(View view) {
        Intent intent = new Intent(this, LetterIntro.class);
        char letter = '[';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }
    public void letterJ(View view) {
        Intent intent = new Intent(this, LetterIntro.class);
        char letter = 'J';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }
    public void letterC(View view) {
        Intent intent = new Intent(this, LetterIntro.class);
        char letter = 'C';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }
    public void letterF(View view) {
        Intent intent = new Intent(this, LetterIntro.class);
        char letter = 'F';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }

    // VZ
    public void letterV(View view) {
        Intent intent = new Intent(this, LetterIntro.class);
        char letter = 'V';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }
    public void letterZ(View view) {
        Intent intent = new Intent(this, LetterIntro.class);
        char letter = 'Z';
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
    public void letterQu(View view) {
        Intent intent = new Intent(this, LetterIntro.class);
        char letter = 'Q';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }

}
