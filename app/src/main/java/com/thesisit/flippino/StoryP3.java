package com.thesisit.flippino;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class StoryP3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle extras = getIntent().getExtras();
        char letter = extras.getChar("letter");
        switch (letter) {
        //PATINIG
            case 'A':
                setContentView(R.layout.activity_astoryp3);
                break;
            case 'U':
                setContentView(R.layout.activity_ustoryp3);
                break;

        // KATINIG
            // TLH
            case 'H':
                setContentView(R.layout.activity_tlh_story_p3);
                break;
            // WYS
            case 'Y':
                setContentView(R.layout.activity_wys_story_p3);
                break;
            // GPR
            case 'R':
                setContentView(R.layout.activity_gpr_story_p3);
                break;
            // BMNg
            case ']':
                setContentView(R.layout.activity_bmng_story_p3);
                break;

        // HIRAM
            // VZ
            case 'Z':
                setContentView(R.layout.activity_vzstoryp3);
                break;
        }
    }

// PATINIG
    public void letterA(View view) {
        Intent intent = new Intent(this, LetterIntro.class);
        char letter = 'A';
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
    public void letterH(View view) {
        Intent intent = new Intent(this, LetterIntro.class);
        char letter = 'H';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }

    // WYS
    public void letterY(View view) {
        Intent intent = new Intent(this, LetterIntro.class);
        char letter = 'Y';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }

    // GPR
    public void letterR(View view) {
        Intent intent = new Intent(this, LetterIntro.class);
        char letter = 'R';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }

    // BMNg
    public void letterNg(View view) {
        Intent intent = new Intent(this, LetterIntro.class);
        char letter = ']';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }

// HIRAM
    // VZ
    public void letterZ(View view) {
        Intent intent = new Intent(this, LetterIntro.class);
        char letter = 'Z';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }
}
