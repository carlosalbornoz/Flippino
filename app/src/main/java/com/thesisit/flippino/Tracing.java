package com.thesisit.flippino;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class Tracing extends AppCompatActivity {

    private CanvasView customCanvas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle extras = getIntent().getExtras();
        char letter = extras.getChar("letter");
        switch (letter) {
            // PATINIG
            case 'A':
                setContentView(R.layout.tracing_demo);
                customCanvas = (CanvasView) findViewById(R.id.imageView49);
                //customCanvas.letter = letter;
                break;
            case 'E':
                setContentView(R.layout.activity_e_tracing);
                //customCanvas.letter = letter;
                break;
            case 'I':
                setContentView(R.layout.activity_i_tracing);
                //customCanvas.letter = letter;
                break;
            case 'O':
                setContentView(R.layout.activity_o_tracing);
                //customCanvas.letter = letter;
                break;
            case 'U':
                setContentView(R.layout.activity_u_tracing);
//                customCanvas.letter = letter;
                break;

            // KATINIG
            // TLH
            case 'T':
                setContentView(R.layout.activity_tlh_tracing_t);
//                customCanvas.letter = letter;
                break;
            case 'L':
                setContentView(R.layout.activity_tlh_tracing_l);
//                customCanvas.letter = letter;
                break;
            case 'H':
                setContentView(R.layout.activity_tlh_tracing_h);
//                customCanvas.letter = letter;
                break;

            // NDK
            case 'N':
                setContentView(R.layout.activity_ndk_tracing_n);
//                customCanvas.letter = letter;
                break;
            case 'D':
                setContentView(R.layout.activity_ndk_tracing_d);
//                customCanvas.letter = letter;
                break;
            case 'K':
                setContentView(R.layout.activity_ndk_tracing_k);
//                customCanvas.letter = letter;
                break;

            // WYS
            case 'W':
                setContentView(R.layout.activity_wys_tracing_w);
//                customCanvas.letter = letter;
                break;
            case 'Y':
                setContentView(R.layout.activity_wys_tracing_y);
//                customCanvas.letter = letter;
                break;
            case 'S':
                setContentView(R.layout.activity_wys_tracing_s);
//                customCanvas.letter = letter;
                break;

            // GPR
            case 'G':
                setContentView(R.layout.activity_gpr_tracing_g);
//                customCanvas.letter = letter;
                break;
            case 'P':
                setContentView(R.layout.activity_gpr_tracing_p);
//                customCanvas.letter = letter;
                break;
            case 'R':
                setContentView(R.layout.activity_gpr_tracing_r);
//                customCanvas.letter = letter;
                break;

            // BMNg
            case 'B':
                setContentView(R.layout.activity_bmng_tracing_b);
//                customCanvas.letter = letter;
                break;
            case 'M':
                setContentView(R.layout.activity_bmng_tracing_m);
//                customCanvas.letter = letter;
                break;
            case ']':
                setContentView(R.layout.activity_bmng_tracing_ng);
//                customCanvas.letter = letter;
                break;

            // HIRAM
            // NJCF
            case '[':
                setContentView(R.layout.activity_njcf_tracing_enye);
//                customCanvas.letter = letter;
                break;
            case 'J':
                setContentView(R.layout.activity_njcf_tracing_j);
//                customCanvas.letter = letter;
                break;
            case 'C':
                setContentView(R.layout.activity_njcf_tracing_c);
//                customCanvas.letter = letter;
                break;
            case 'F':
                setContentView(R.layout.activity_njcf_tracing_f);
//                customCanvas.letter = letter;
                break;

            // VZ
            case 'V':
                setContentView(R.layout.activity_vz_tracingintro_v);
//                customCanvas.letter = letter;
                break;
            case 'Z':
                setContentView(R.layout.activity_vz_tracingintro_z);
//                customCanvas.letter = letter;
                break;

            // XQu
            case 'X':
                setContentView(R.layout.activity_xqu_tracing_x);
//                customCanvas.letter = letter;
                break;
            case 'Q':
                setContentView(R.layout.activity_xqu_tracing_qu);
//                customCanvas.letter = letter;
                break;
        }
    }

    //PATINIG
    public void doneA(View view) {
        Intent intent = new Intent(this, LettersMenu.class);
        startActivity(intent);
    }

    //KATINIG
    // TLH
    public void p2TLH(View view) {
        Intent intent = new Intent(this, StoryP2.class);
        char letter = 'T';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }
    public void p3TLH(View view) {
        Intent intent = new Intent(this, StoryP3.class);
        char letter = 'T';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }

    // NDK
    public void p2NDK(View view) {
        Intent intent = new Intent(this, StoryP2.class);
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

    // WYS
    public void p2WYS(View view) {
        Intent intent = new Intent(this, StoryP2.class);
        char letter = 'W';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }
    public void p3WYS(View view) {
        Intent intent = new Intent(this, StoryP3.class);
        char letter = 'W';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }

    // GPR
    public void p2GPR(View view) {
        Intent intent = new Intent(this, StoryP2.class);
        char letter = 'G';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }
    public void p3GPR(View view) {
        Intent intent = new Intent(this, StoryP3.class);
        char letter = 'G';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }

    // BMNg
    public void p2BMNg(View view) {
        Intent intent = new Intent(this, StoryP2.class);
        char letter = 'B';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }
    public void p3BMNg(View view) {
        Intent intent = new Intent(this, StoryP3.class);
        char letter = 'B';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }

    // HIRAM
    // NJCF
    public void p2NJCF(View view) {
        Intent intent = new Intent(this, StoryP2.class);
        char letter = 'J';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }
    public void letterJ(View view) {
        Intent intent = new Intent(this, LetterIntro.class);
        char letter = 'J';
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
    public void p3VZ(View view) {
        Intent intent = new Intent(this, StoryP2.class);
        char letter = 'V';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }

    // XQu
    public void p2XQu(View view) {
        Intent intent = new Intent(this, StoryP2.class);
        char letter = 'X';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }
}
