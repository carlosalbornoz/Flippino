package com.thesisit.flippino;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LetterIntro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle extras = getIntent().getExtras();
        char letter = extras.getChar("letter");
        switch (letter) {
            // PATINIG
            case 'A':
                setContentView(R.layout.activity_a_intro);
                break;
            case 'E':
                setContentView(R.layout.activity_e_intro);
                break;
            case 'I':
                setContentView(R.layout.activity_i_intro);
                break;
            case 'O':
                setContentView(R.layout.activity_o_intro);
                break;
            case 'U':
                setContentView(R.layout.activity_u_intro);
                break;

            // KATINIG
            // TLH
            case 'T':
                setContentView(R.layout.activity_tlh_intro_tu);
                break;
            case 'L':
                setContentView(R.layout.activity_tlh_intro_lu);
                break;
            case 'H':
                setContentView(R.layout.activity_tlh_intro_hi);
                break;

            // NDK
            case 'N':
                setContentView(R.layout.activity_ndk_intro_ni);
                break;
            case 'D':
                setContentView(R.layout.activity_ndk_intro_du);
                break;
            case 'K':
                setContentView(R.layout.activity_ndk_intro_ku);
                break;

            // WYS
            case 'W':
                setContentView(R.layout.activity_wys_intro_wa);
                break;
            case 'Y':
                setContentView(R.layout.activity_wys_intro_yo);
                break;
            case 'S':
                setContentView(R.layout.activity_wys_intro_si);
                break;

            // GPR
            case 'G':
                setContentView(R.layout.activity_gpr_intro_gu);
                break;
            case 'P':
                setContentView(R.layout.activity_gpr_intro_pa);
                break;
            case 'R':
                setContentView(R.layout.activity_gpr_intro_ra);
                break;

            // BMNg
            case 'B':
                setContentView(R.layout.activity_bmng_intro_bu);
                break;
            case 'M':
                setContentView(R.layout.activity_bmng_intro_ma);
                break;
            case ']':
                setContentView(R.layout.activity_bmng_intro_nga);
                break;

            // HIRAM
            // NJCF
            case '[':
                setContentView(R.layout.activity_njcf_intro_enye);
                break;
            case 'J':
                setContentView(R.layout.activity_njcf_intro_j);
                break;
            case 'C':
                setContentView(R.layout.activity_njcf_intro_c);
                break;
            case 'F':
                setContentView(R.layout.activity_njcf_intro_f);
                break;

            // VZ
            case 'V':
                setContentView(R.layout.activity_vz_intro_v);
                break;
            case 'Z':
                setContentView(R.layout.activity_vz_intro_z);
                break;

            // XQu
            case 'X':
                setContentView(R.layout.activity_xqu_intro_x);
                break;
            case 'Q':
                setContentView(R.layout.activity_xqu_intro_qu);
                break;
        }
    }

    //PATINIG
    public void demoA(View view) {
        Intent intent = new Intent(this, TracingIntro.class);
        char letter = 'A';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }
    public void demoE(View view) {
        Intent intent = new Intent(this, TracingIntro.class);
        char letter = 'E';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }
    public void demoI(View view) {
        Intent intent = new Intent(this, TracingIntro.class);
        char letter = 'I';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }
    public void demoO(View view) {
        Intent intent = new Intent(this, TracingIntro.class);
        char letter = 'O';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }
    public void demoU(View view) {
        Intent intent = new Intent(this, TracingIntro.class);
        char letter = 'U';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }

    //KATINIG
    // TLH
    public void demoT(View view) {
        Intent intent = new Intent(this, TracingIntro.class);
        char letter = 'T';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }
    public void demoL(View view) {
        Intent intent = new Intent(this, TracingIntro.class);
        char letter = 'L';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }
    public void demoH(View view) {
        Intent intent = new Intent(this, TracingIntro.class);
        char letter = 'H';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }

    // NDK
    public void demoN(View view) {
        Intent intent = new Intent(this, TracingIntro.class);
        char letter = 'N';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }
    public void demoD(View view) {
        Intent intent = new Intent(this, TracingIntro.class);
        char letter = 'D';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }
    public void demoK(View view) {
        Intent intent = new Intent(this, TracingIntro.class);
        char letter = 'K';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }

    // WYS
    public void demoW(View view) {
        Intent intent = new Intent(this, TracingIntro.class);
        char letter = 'W';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }
    public void demoY(View view) {
        Intent intent = new Intent(this, TracingIntro.class);
        char letter = 'Y';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }
    public void demoS(View view) {
        Intent intent = new Intent(this, TracingIntro.class);
        char letter = 'S';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }

    // GPR
    public void demoG(View view) {
        Intent intent = new Intent(this, TracingIntro.class);
        char letter = 'G';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }
    public void demoP(View view) {
        Intent intent = new Intent(this, TracingIntro.class);
        char letter = 'P';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }
    public void demoR(View view) {
        Intent intent = new Intent(this, TracingIntro.class);
        char letter = 'R';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }

    // BMNg
    public void demoB(View view) {
        Intent intent = new Intent(this, TracingIntro.class);
        char letter = 'B';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }
    public void demoM(View view) {
        Intent intent = new Intent(this, TracingIntro.class);
        char letter = 'M';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }
    public void demoNg(View view) {
        Intent intent = new Intent(this, TracingIntro.class);
        char letter = ']';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }

    // HIRAM
    // NJCF
    public void demoEne(View view) {
        Intent intent = new Intent(this, TracingIntro.class);
        char letter = '[';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }
    public void demoJ(View view) {
        Intent intent = new Intent(this, TracingIntro.class);
        char letter = 'J';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }
    public void demoC(View view) {
        Intent intent = new Intent(this, TracingIntro.class);
        char letter = 'C';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }
    public void demoF(View view) {
        Intent intent = new Intent(this, TracingIntro.class);
        char letter = 'F';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }

    // VZ
    public void demoV (View view) {
        Intent intent = new Intent(this, TracingIntro.class);
        char letter = 'V';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }
    public void demoZ (View view) {
        Intent intent = new Intent(this, TracingIntro.class);
        char letter = 'Z';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }

    // XQu
    public void demoX(View view) {
        Intent intent = new Intent(this, TracingIntro.class);
        char letter = 'X';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }
    public void demoQu(View view) {
        Intent intent = new Intent(this, TracingIntro.class);
        char letter = 'Q';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }
}
