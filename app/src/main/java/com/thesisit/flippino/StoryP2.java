package com.thesisit.flippino;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.hanks.htextview.HTextView;
import com.hanks.htextview.HTextViewType;
import com.hanks.htextview.util.FontManager;

import java.util.Timer;
import java.util.TimerTask;

public class StoryP2 extends AppCompatActivity {

    private HTextView hTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle extras = getIntent().getExtras();
        char letter = extras.getChar("letter");
        switch (letter) {
        //PATINIG
            case 'A':
                setContentView(R.layout.activity_astoryp2);
                break;
            case 'E':
                setContentView(R.layout.activity_estoryp2);
                break;
            case 'I':
                setContentView(R.layout.activity_istoryp2);
                break;
            case 'O':
                setContentView(R.layout.activity_ostoryp2);
                break;
            case 'U':
                setContentView(R.layout.activity_ustoryp2);
                break;

        // KATINIG
            // TLH
            case 'T':
                setContentView(R.layout.activity_tlh_story_p2);
                break;
            // NDK
            case 'N':
                setContentView(R.layout.activity_ndk_story_p2);
                break;
            // WYS
            case 'W':
                //setContentView(R.layout.activity_wy_story_p2);
                break;
            // GPR
            case 'G':
                setContentView(R.layout.activity_gpr_story_p2);
                break;
            // BMNg
            case 'B':
                setContentView(R.layout.activity_bmng_story_p2);
                break;

        // HIRAM
            // NJCF
            case 'J':
                setContentView(R.layout.activity_njcf_story_p2);
                break;
            // VZ
            case 'V':
                setContentView(R.layout.activity_vzstoryp2);
                break;
            // XQu
            case 'X':
                setContentView(R.layout.activity_xqustoryp1);
                break;
        }

        hTextView = (HTextView) findViewById(R.id.textView3);
        hTextView.setTypeface(FontManager.getInstance(getAssets()).getFont("fonts/montserrat_black.otf"));
                        hTextView.setAnimateType(HTextViewType.TYPER);

    }

    //PATINIG
    public void p3A(View view) {
        Intent intent = new Intent(this, StoryP3.class);
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
    public void p3U(View view) {
        Intent intent = new Intent(this, StoryP3.class);
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

    // NDK
    public void letterN(View view) {
        Intent intent = new Intent(this, LetterIntro.class);
        char letter = 'N';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }

    // WYS
    public void letterS(View view) {
        Intent intent = new Intent(this, LetterIntro.class);
        char letter = 'S';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }

    // GPR
    public void letterP(View view) {
        Intent intent = new Intent(this, LetterIntro.class);
        char letter = 'P';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }

    // BMNg
    public void letterM(View view) {
        Intent intent = new Intent(this, LetterIntro.class);
        char letter = 'M';
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

    // VZ
    public void letterV(View view) {
        Intent intent = new Intent(this, LetterIntro.class);
        char letter = 'V';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }

    // XQu
    public void letterQu(View view) {
        Intent intent = new Intent(this, LetterIntro.class);
        char letter = 'Q';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }
}
