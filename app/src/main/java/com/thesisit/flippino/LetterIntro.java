package com.thesisit.flippino;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

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
                setContentView(R.layout.activity_tlh_intro_t);
                break;
            case 'L':
                setContentView(R.layout.activity_tlh_intro_l);
                break;
            case 'H':
                setContentView(R.layout.activity_tlh_intro_h);
                break;

            // NDK
            case 'N':
                setContentView(R.layout.activity_ndk_intro_n);
                break;
            case 'D':
                setContentView(R.layout.activity_ndk_intro_d);
                break;
            case 'K':
                setContentView(R.layout.activity_ndk_intro_k);
                break;

            // WY
            case 'W':
                //setContentView(R.layout.activity_wy_intro_w);
                break;
            case 'Y':
                //setContentView(R.layout.activity_wy_intro_y);
                break;

            // GPR
            case 'G':
                setContentView(R.layout.activity_gpr_intro_g);
                break;
            case 'P':
                setContentView(R.layout.activity_gpr_intro_p);
                break;
            case 'R':
                setContentView(R.layout.activity_gpr_intro_r);
                break;

            // BMNg
            case 'B':
                setContentView(R.layout.activity_bmng_intro_b);
                break;
            case 'M':
                setContentView(R.layout.activity_bmng_intro_m);
                break;
            case ']':
                setContentView(R.layout.activity_bmng_intro_ng);
                break;

        // HIRAM
            // NJCF
            case '[':
                setContentView(R.layout.activity_njcf_intro_n);
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

            // XQU
            case 'X':
                setContentView(R.layout.activity_xqu_intro_x);
                break;
            case 'Q':
                setContentView(R.layout.activity_xqu_intro_qu);
                break;
        }
    }
}
