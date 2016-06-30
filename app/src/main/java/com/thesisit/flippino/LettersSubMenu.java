package com.thesisit.flippino;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LettersSubMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle extras = getIntent().getExtras();
        char menuSelection = extras.getChar("menuSelection");
        switch (menuSelection) {
            case 'P':
                setContentView(R.layout.activity_patinigmenu);
                break;
            case 'K':
                setContentView(R.layout.activity_katinigmenu);
                break;
            case 'H':
                setContentView(R.layout.activity_hirammenu);
                break;
        }
    }

//PATINIG
    public void titleA(View view) {
        Intent intent = new Intent(this, StoryTitle.class);
        char letter = 'A';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }

    public void titleE(View view) {
        Intent intent = new Intent(this, StoryTitle.class);
        char letter = 'E';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }

    public void titleI(View view) {
        Intent intent = new Intent(this, StoryTitle.class);
        char letter = 'I';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }

    public void titleO(View view) {
        Intent intent = new Intent(this, StoryTitle.class);
        char letter = 'O';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }

    public void titleU(View view) {
        Intent intent = new Intent(this, StoryTitle.class);
        char letter = 'U';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }

// KATINIG
    // TLH
    public void titleTLH(View view) {
        Intent intent = new Intent(this, StoryTitle.class);
        char letter = 'T';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }

    // NDK
    public void titleNDK(View view) {
        Intent intent = new Intent(this, StoryTitle.class);
        char letter = 'N';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }

    // WY
    public void titleWY(View view) {
        Intent intent = new Intent(this, StoryTitle.class);
        char letter = 'W';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }

    // GPR
    public void titleGPR(View view) {
        Intent intent = new Intent(this, StoryTitle.class);
        char letter = 'G';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }

    // BMNg
    public void titleBMNg(View view) {
        Intent intent = new Intent(this, StoryTitle.class);
        char letter = 'B';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }

// HIRAM
    // NJCF
    public void titleNJCF(View view) {
        Intent intent = new Intent(this, StoryTitle.class);
        char letter = 'J';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }

    // VZ
    public void titleVZ(View view) {
        Intent intent = new Intent(this, StoryTitle.class);
        char letter = 'V';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }

    // XQu
    public void titleXQu(View view) {
        Intent intent = new Intent(this, StoryTitle.class);
        char letter = 'X';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }
}
