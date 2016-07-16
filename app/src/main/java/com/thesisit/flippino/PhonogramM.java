package com.thesisit.flippino;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class PhonogramM extends AppCompatActivity {
    private MontserratTextView ma_text;
    private MontserratTextView ma_red;
    private MontserratTextView me_text;
    private MontserratTextView me_red;
    private MontserratTextView mi_text;
    private MontserratTextView mi_red;
    private MontserratTextView mo_text;
    private MontserratTextView mo_red;
    private MontserratTextView mu_text;
    private MontserratTextView mu_red;
    private MontserratTextView mangga;
    private MontserratTextView mesa;
    private MontserratTextView minero;
    private MontserratTextView motor;
    private MontserratTextView multo;
    private ImageView mangga_img;
    private ImageView mesa_img;
    private ImageView minero_img;
    private ImageView motor_img;
    private ImageView multo_img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmng_intro_ma);
        ma_text = (MontserratTextView) findViewById(R.id.ma_text);
        ma_red = (MontserratTextView) findViewById(R.id.ma_red);

        me_text = (MontserratTextView) findViewById(R.id.me_text);
        me_red = (MontserratTextView) findViewById(R.id.me_red);

        mi_text = (MontserratTextView) findViewById(R.id.mi_text);
        mi_red = (MontserratTextView) findViewById(R.id.mi_red);

        mo_text = (MontserratTextView) findViewById(R.id.mo_text);
        mo_red = (MontserratTextView) findViewById(R.id.mo_red);

        mu_text = (MontserratTextView) findViewById(R.id.mu_text);
        mu_red = (MontserratTextView) findViewById(R.id.mu_red);

        //captions
        mangga = (MontserratTextView) findViewById(R.id.mangga);
        mesa = (MontserratTextView) findViewById(R.id.mesa);
        minero = (MontserratTextView) findViewById(R.id.minero);
        motor = (MontserratTextView) findViewById(R.id.motor);
        multo = (MontserratTextView) findViewById(R.id.multo);

        //images
        //mangga_img = (ImageView) findViewById(R.id.mangga_img);
        mesa_img = (ImageView) findViewById(R.id.mesa_img);
        minero_img = (ImageView) findViewById(R.id.minero_img);
        motor_img = (ImageView) findViewById(R.id.motor_img);
        multo_img = (ImageView) findViewById(R.id.multo_img);
    }

    public void maClick(View view) {
        ma_red.setVisibility(View.VISIBLE);
        ma_text.setVisibility(View.INVISIBLE);
        mangga.setVisibility(View.VISIBLE);
        mangga_img.setVisibility(View.VISIBLE);

        me_text.setVisibility(View.VISIBLE);
        me_red.setVisibility(View.INVISIBLE);
        mesa.setVisibility(View.INVISIBLE);
        mesa_img.setVisibility(View.INVISIBLE);

        mi_red.setVisibility(View.INVISIBLE);
        mi_text.setVisibility(View.VISIBLE);
        minero.setVisibility(View.INVISIBLE);
        minero_img.setVisibility(View.INVISIBLE);

        mo_red.setVisibility(View.INVISIBLE);
        mo_text.setVisibility(View.VISIBLE);
        motor.setVisibility(View.INVISIBLE);
        motor_img.setVisibility(View.INVISIBLE);

        mu_red.setVisibility(View.INVISIBLE);
        mu_text.setVisibility(View.VISIBLE);
        multo.setVisibility(View.INVISIBLE);
        multo_img.setVisibility(View.INVISIBLE);
    }

    public void meClick(View view) {
        me_red.setVisibility(View.VISIBLE);
        me_text.setVisibility(View.INVISIBLE);
        mesa.setVisibility(View.VISIBLE);
        mesa_img.setVisibility(View.VISIBLE);

        ma_text.setVisibility(View.VISIBLE);
        ma_red.setVisibility(View.INVISIBLE);
        mangga.setVisibility(View.INVISIBLE);
        mangga_img.setVisibility(View.INVISIBLE);

        mi_red.setVisibility(View.INVISIBLE);
        mi_text.setVisibility(View.VISIBLE);
        minero.setVisibility(View.INVISIBLE);
        minero_img.setVisibility(View.INVISIBLE);

        mo_red.setVisibility(View.INVISIBLE);
        mo_text.setVisibility(View.VISIBLE);
        motor.setVisibility(View.INVISIBLE);
        motor_img.setVisibility(View.INVISIBLE);

        mu_red.setVisibility(View.INVISIBLE);
        mu_text.setVisibility(View.VISIBLE);
        multo.setVisibility(View.INVISIBLE);
        multo_img.setVisibility(View.INVISIBLE);
    }

    public void miClick(View view) {
        mi_red.setVisibility(View.VISIBLE);
        mi_text.setVisibility(View.INVISIBLE);
        minero.setVisibility(View.VISIBLE);
        minero_img.setVisibility(View.VISIBLE);

        me_text.setVisibility(View.VISIBLE);
        me_red.setVisibility(View.INVISIBLE);
        mesa.setVisibility(View.INVISIBLE);
        mesa_img.setVisibility(View.INVISIBLE);

        ma_red.setVisibility(View.INVISIBLE);
        ma_text.setVisibility(View.VISIBLE);
        mangga.setVisibility(View.INVISIBLE);
        mangga_img.setVisibility(View.INVISIBLE);

        mo_red.setVisibility(View.INVISIBLE);
        mo_text.setVisibility(View.VISIBLE);
        motor.setVisibility(View.INVISIBLE);
        motor_img.setVisibility(View.INVISIBLE);

        mu_red.setVisibility(View.INVISIBLE);
        mu_text.setVisibility(View.VISIBLE);
        multo.setVisibility(View.INVISIBLE);
        multo_img.setVisibility(View.INVISIBLE);
    }

    public void moClick(View view) {
        mo_red.setVisibility(View.VISIBLE);
        mo_text.setVisibility(View.INVISIBLE);
        motor.setVisibility(View.VISIBLE);
        motor_img.setVisibility(View.VISIBLE);

        me_text.setVisibility(View.VISIBLE);
        me_red.setVisibility(View.INVISIBLE);
        mesa.setVisibility(View.INVISIBLE);
        mesa_img.setVisibility(View.INVISIBLE);

        mi_red.setVisibility(View.INVISIBLE);
        mi_text.setVisibility(View.VISIBLE);
        minero.setVisibility(View.INVISIBLE);
        minero_img.setVisibility(View.INVISIBLE);

        ma_red.setVisibility(View.INVISIBLE);
        ma_text.setVisibility(View.VISIBLE);
        mangga.setVisibility(View.INVISIBLE);
        mangga_img.setVisibility(View.INVISIBLE);

        mu_red.setVisibility(View.INVISIBLE);
        mu_text.setVisibility(View.VISIBLE);
        multo.setVisibility(View.INVISIBLE);
        multo_img.setVisibility(View.INVISIBLE);
    }
    public void muClick(View view) {
        mu_red.setVisibility(View.VISIBLE);
        mu_text.setVisibility(View.INVISIBLE);
        multo_img.setVisibility(View.VISIBLE);
        multo.setVisibility(View.VISIBLE);

        me_text.setVisibility(View.VISIBLE);
        me_red.setVisibility(View.INVISIBLE);
        mesa.setVisibility(View.INVISIBLE);
        mesa_img.setVisibility(View.INVISIBLE);

        mi_red.setVisibility(View.INVISIBLE);
        mi_text.setVisibility(View.VISIBLE);
        minero.setVisibility(View.INVISIBLE);
        minero_img.setVisibility(View.INVISIBLE);

        mo_red.setVisibility(View.INVISIBLE);
        mo_text.setVisibility(View.VISIBLE);
        motor.setVisibility(View.INVISIBLE);
        motor_img.setVisibility(View.INVISIBLE);

        ma_red.setVisibility(View.INVISIBLE);
        ma_text.setVisibility(View.VISIBLE);
        mangga.setVisibility(View.INVISIBLE);
        mangga_img.setVisibility(View.INVISIBLE);
    }
}
