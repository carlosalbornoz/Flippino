package com.thesisit.flippino;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TracingIntro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle extras = getIntent().getExtras();
        char letter = extras.getChar("letter");
        switch (letter) {
            // PATINIG
            case 'A':
                setContentView(R.layout.activity_a_tracingintro);
                break;
            case 'E':
                setContentView(R.layout.activity_e_tracingintro);
                break;
            case 'I':
                setContentView(R.layout.activity_i_tracingintro);
                break;
            case 'O':
                setContentView(R.layout.activity_o_tracingintro);
                break;
            case 'U':
                setContentView(R.layout.activity_u_tracingintro);
                break;

            // KATINIG
            // TLH
            case 'T':
                setContentView(R.layout.activity_tlh_tracingintro_t);
                break;
            case 'L':
                setContentView(R.layout.activity_tlh_tracingintro_l);
                break;
            case 'H':
                setContentView(R.layout.activity_tlh_tracingintro_h);
                break;

            // NDK
            case 'N':
                setContentView(R.layout.activity_ndk_tracingintro_n);
                break;
            case 'D':
                setContentView(R.layout.activity_ndk_tracingintro_d);
                break;
            case 'K':
                setContentView(R.layout.activity_ndk_tracingintro_k);
                break;

            // WYS
            case 'W':
                setContentView(R.layout.activity_wys_tracingintro_w);
                break;
            case 'Y':
                setContentView(R.layout.activity_wys_tracingintro_y);
                break;
            case 'S':
                setContentView(R.layout.activity_wys_tracingintro_s);
                break;

            // GPR
            case 'G':
                setContentView(R.layout.activity_gpr_tracingintro_g);
                break;
            case 'P':
                setContentView(R.layout.activity_gpr_tracingintro_p);
                break;
            case 'R':
                setContentView(R.layout.activity_gpr_tracingintro_r);
                break;

            // BMNg
            case 'B':
                setContentView(R.layout.activity_bmng_tracingintro_b);
                break;
            case 'M':
                setContentView(R.layout.activity_bmng_tracingintro_m);
                break;
            case ']':
                setContentView(R.layout.activity_bmng_tracingintro_ng);
                break;

            // HIRAM
            // NJCF
            case '[':
                setContentView(R.layout.activity_njcf_tracingintro_n);
                break;
            case 'J':
                setContentView(R.layout.activity_njcf_tracingintro_j);
                break;
            case 'C':
                setContentView(R.layout.activity_njcf_tracingintro_c);
                break;
            case 'F':
                setContentView(R.layout.activity_njcf_tracingintro_f);
                break;

            // VZ
            case 'V':
                setContentView(R.layout.activity_vz_tracingintro_v);
                break;
            case 'Z':
                setContentView(R.layout.activity_vz_tracingintro_z);
                break;

            // XQu
            case 'X':
                setContentView(R.layout.activity_xqu_tracingintro_x);
                break;
            case 'Q':
                setContentView(R.layout.activity_xqu_tracingintro_qu);
                break;
        }
    }


    //PATINIG
    public void tracingA(View view) {
        Intent intent = new Intent(this, Tracing.class);
        char letter = 'A';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }
    public void tracingE(View view) {
        Intent intent = new Intent(this, Tracing.class);
        char letter = 'E';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }
    public void tracingI(View view) {
        Intent intent = new Intent(this, Tracing.class);
        char letter = 'I';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }
    public void tracingO(View view) {
        Intent intent = new Intent(this, Tracing.class);
        char letter = 'O';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }
    public void tracingU(View view) {
        Intent intent = new Intent(this, Tracing.class);
        char letter = 'U';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }

    //KATINIG
    // TLH
    public void tracingT(View view) {
        Intent intent = new Intent(this, Tracing.class);
        char letter = 'T';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }
    public void tracingL(View view) {
        Intent intent = new Intent(this, Tracing.class);
        char letter = 'L';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }
    public void tracingH(View view) {
        Intent intent = new Intent(this, Tracing.class);
        char letter = 'H';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }

    // NDK
    public void tracingN(View view) {
        Intent intent = new Intent(this, Tracing.class);
        char letter = 'N';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }
    public void tracingD(View view) {
        Intent intent = new Intent(this, Tracing.class);
        char letter = 'D';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }
    public void tracingK(View view) {
        Intent intent = new Intent(this, Tracing.class);
        char letter = 'K';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }

    // WYS
    public void tracingW(View view) {
        Intent intent = new Intent(this, Tracing.class);
        char letter = 'W';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }
    public void tracingY(View view) {
        Intent intent = new Intent(this, Tracing.class);
        char letter = 'Y';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }
    public void tracingS(View view) {
        Intent intent = new Intent(this, Tracing.class);
        char letter = 'S';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }

    // GPR
    public void tracingG(View view) {
        Intent intent = new Intent(this, Tracing.class);
        char letter = 'G';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }
    public void tracingP(View view) {
        Intent intent = new Intent(this, Tracing.class);
        char letter = 'P';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }
    public void tracingR(View view) {
        Intent intent = new Intent(this, Tracing.class);
        char letter = 'R';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }

    // BMNg
    public void tracingB(View view) {
        Intent intent = new Intent(this, Tracing.class);
        char letter = 'B';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }
    public void tracingM(View view) {
        Intent intent = new Intent(this, Tracing.class);
        char letter = 'M';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }
    public void tracingNg(View view) {
        Intent intent = new Intent(this, Tracing.class);
        char letter = ']';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }

    // HIRAM
    // NJCF
    public void tracingEne(View view) {
        Intent intent = new Intent(this, Tracing.class);
        char letter = '[';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }
    public void tracingJ(View view) {
        Intent intent = new Intent(this, Tracing.class);
        char letter = 'J';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }
    public void tracingC(View view) {
        Intent intent = new Intent(this, Tracing.class);
        char letter = 'C';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }
    public void tracingF(View view) {
        Intent intent = new Intent(this, Tracing.class);
        char letter = 'F';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }

    // VZ
    public void tracingV(View view) {
        Intent intent = new Intent(this, Tracing.class);
        char letter = 'V';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }
    public void tracingZ(View view) {
        Intent intent = new Intent(this, Tracing.class);
        char letter = 'Z';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }

    // XQu
    public void tracingX(View view) {
        Intent intent = new Intent(this, Tracing.class);
        char letter = 'X';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }
    public void tracingQu(View view) {
        Intent intent = new Intent(this, Tracing.class);
        char letter = 'Q';
        intent.putExtra("letter", letter);
        startActivity(intent);
    }
}
