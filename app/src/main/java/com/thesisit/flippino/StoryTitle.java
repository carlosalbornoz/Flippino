package com.thesisit.flippino;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class StoryTitle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle extras = getIntent().getExtras();
        char letter = extras.getChar("letter");
        switch (letter) {
        //PATINIG
            case 'A':
                setContentView(R.layout.activity_a_story_title);
                break;
            case 'E':
                setContentView(R.layout.activity_e_story_title);
                break;
            case 'I':
                setContentView(R.layout.activity_i_story_title);
                break;
            case 'O':
                setContentView(R.layout.activity_o_story_title);
                break;
            case 'U':
                setContentView(R.layout.activity_u_story_title);
                break;

        // KATINIG
            // TLH
            case 'T':
                setContentView(R.layout.activity_tlh_story_title);
                break;
            // NDK
            case 'N':
                setContentView(R.layout.activity_ndk_story_title);
                break;
            // WY
            case 'W':
                //setContentView(R.layout.activity_wy_intro_w);
                break;
            // GPR
            case 'G':
                setContentView(R.layout.activity_gpr_story_title);
                break;
            // BMNg
            case 'B':
                setContentView(R.layout.activity_bmng_story_title);
                break;

        // HIRAM
            // NJCF
            case 'J':
                setContentView(R.layout.activity_njcf_title);
                break;
            // VZ
            case 'V':
                setContentView(R.layout.activity_vz_story_title);
                break;
            // XQu
            case 'X':
                setContentView(R.layout.activity_xqu_story_title);
                break;
        }
    }

//PATINIG
    public void startA(View view) {
        Intent intent = new Intent(this, StoryP1.class);
        char letter = 'A';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }

    public void startE(View view) {
        Intent intent = new Intent(this, StoryP1.class);
        char letter = 'E';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }

    public void startI(View view) {
        Intent intent = new Intent(this, StoryP1.class);
        char letter = 'I';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }

    public void startO(View view) {
        Intent intent = new Intent(this, StoryP1.class);
        char letter = 'O';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }

    public void startU(View view) {
        Intent intent = new Intent(this, StoryP1.class);
        char letter = 'U';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }

//KATINIG
    // TLH
    public void startTLH(View view) {
        Intent intent = new Intent(this, StoryP1.class);
        char letter = 'T';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }
    // NDK
    public void startNDK(View view) {
        Intent intent = new Intent(this, StoryP1.class);
        char letter = 'N';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }
    // WY
    public void startWY(View view) {
        Intent intent = new Intent(this, StoryP1.class);
        char letter = 'W';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }
    // GPR
    public void startGPR(View view) {
        Intent intent = new Intent(this, StoryP1.class);
        char letter = 'G';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }
    // BMNg
    public void startBMNg(View view) {
        Intent intent = new Intent(this, StoryP1.class);
        char letter = 'B';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }

// HIRAM
    // NJCF
    public void startNJCF(View view) {
        Intent intent = new Intent(this, StoryP1.class);
        char letter = 'J';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }

    // VZ
    public void startVZ(View view) {
        Intent intent = new Intent(this, StoryP1.class);
        char letter = 'V';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }

    // XQu
    public void startXQu(View view) {
        Intent intent = new Intent(this, StoryP1.class);
        char letter = 'X';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }

}
