package com.thesisit.flippino;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class PhonogramG extends AppCompatActivity {
    private MontserratTextView ga_text;
    private MontserratTextView ga_red;
    private MontserratTextView ge_text;
    private MontserratTextView ge_red;
    private MontserratTextView gi_text;
    private MontserratTextView gi_red;
    private MontserratTextView go_text;
    private MontserratTextView go_red;
    private MontserratTextView gu_text;
    private MontserratTextView gu_red;
    private MontserratTextView gatas;
    private MontserratTextView gelatin;
    private MontserratTextView gitara;
    private MontserratTextView goma;
    private MontserratTextView guyabano;
    private ImageView gatas_img;
    private ImageView gelatin_img;
    private ImageView gitara_img;
    private ImageView goma_img;
    private ImageView guyabano_img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gpr_intro_gu);
        ga_text = (MontserratTextView) findViewById(R.id.ga_text);
        ga_red = (MontserratTextView) findViewById(R.id.ga_red);

        ge_text = (MontserratTextView) findViewById(R.id.ge_text);
        ge_red = (MontserratTextView) findViewById(R.id.ge_red);

        gi_text = (MontserratTextView) findViewById(R.id.gi_text);
        gi_red = (MontserratTextView) findViewById(R.id.gi_red);

        go_text = (MontserratTextView) findViewById(R.id.go_text);
        go_red = (MontserratTextView) findViewById(R.id.go_red);

        gu_text = (MontserratTextView) findViewById(R.id.gu_text);
        gu_red = (MontserratTextView) findViewById(R.id.gu_red);

        //captions
        gatas = (MontserratTextView) findViewById(R.id.gatas);
        gelatin = (MontserratTextView) findViewById(R.id.gelatin);
        gitara = (MontserratTextView) findViewById(R.id.gitara);
        goma = (MontserratTextView) findViewById(R.id.goma);
        guyabano = (MontserratTextView) findViewById(R.id.guyabano);

        //images
        gatas_img = (ImageView) findViewById(R.id.gatas_img);
        gelatin_img = (ImageView) findViewById(R.id.gelatin_img);
        gitara_img = (ImageView) findViewById(R.id.gitara_img);
        goma_img = (ImageView) findViewById(R.id.goma_img);
        guyabano_img = (ImageView) findViewById(R.id.guyabano_img);
    }

    public void gaClick(View view) {
        ga_red.setVisibility(View.VISIBLE);
        ga_text.setVisibility(View.INVISIBLE);
        gatas.setVisibility(View.VISIBLE);
        gatas_img.setVisibility(View.VISIBLE);

        ge_text.setVisibility(View.VISIBLE);
        ge_red.setVisibility(View.INVISIBLE);
        gelatin.setVisibility(View.INVISIBLE);
        gelatin_img.setVisibility(View.INVISIBLE);

        gi_red.setVisibility(View.INVISIBLE);
        gi_text.setVisibility(View.VISIBLE);
        gitara.setVisibility(View.INVISIBLE);
        gitara_img.setVisibility(View.INVISIBLE);

        go_red.setVisibility(View.INVISIBLE);
        go_text.setVisibility(View.VISIBLE);
        goma.setVisibility(View.INVISIBLE);
        goma_img.setVisibility(View.INVISIBLE);

        gu_red.setVisibility(View.INVISIBLE);
        gu_text.setVisibility(View.VISIBLE);
        guyabano.setVisibility(View.INVISIBLE);
        guyabano_img.setVisibility(View.INVISIBLE);

    }

    public void geClick(View view) {
        ge_red.setVisibility(View.VISIBLE);
        ge_text.setVisibility(View.INVISIBLE);
        gelatin.setVisibility(View.VISIBLE);
        gelatin_img.setVisibility(View.VISIBLE);

        ga_red.setVisibility(View.INVISIBLE);
        ga_text.setVisibility(View.VISIBLE);
        gatas.setVisibility(View.INVISIBLE);
        gatas_img.setVisibility(View.INVISIBLE);

        gi_red.setVisibility(View.INVISIBLE);
        gi_text.setVisibility(View.VISIBLE);
        gitara.setVisibility(View.INVISIBLE);
        gitara_img.setVisibility(View.INVISIBLE);

        go_red.setVisibility(View.INVISIBLE);
        go_text.setVisibility(View.VISIBLE);
        goma.setVisibility(View.INVISIBLE);
        goma_img.setVisibility(View.INVISIBLE);

        gu_red.setVisibility(View.INVISIBLE);
        gu_text.setVisibility(View.VISIBLE);
        guyabano.setVisibility(View.INVISIBLE);
        guyabano_img.setVisibility(View.INVISIBLE);
    }

    public void giClick(View view) {
        gi_red.setVisibility(View.VISIBLE);
        gi_text.setVisibility(View.INVISIBLE);
        gitara.setVisibility(View.VISIBLE);
        gitara_img.setVisibility(View.VISIBLE);

        ge_red.setVisibility(View.INVISIBLE);
        ge_text.setVisibility(View.VISIBLE);
        gelatin.setVisibility(View.INVISIBLE);
        gelatin_img.setVisibility(View.INVISIBLE);

        ga_red.setVisibility(View.INVISIBLE);
        ga_text.setVisibility(View.VISIBLE);
        gatas.setVisibility(View.INVISIBLE);
        gatas_img.setVisibility(View.INVISIBLE);

        go_red.setVisibility(View.INVISIBLE);
        go_text.setVisibility(View.VISIBLE);
        goma.setVisibility(View.INVISIBLE);
        goma_img.setVisibility(View.INVISIBLE);

        gu_red.setVisibility(View.INVISIBLE);
        gu_text.setVisibility(View.VISIBLE);
        guyabano.setVisibility(View.INVISIBLE);
        guyabano_img.setVisibility(View.INVISIBLE);
    }

    public void goClick(View view) {
        go_red.setVisibility(View.VISIBLE);
        go_text.setVisibility(View.INVISIBLE);
        goma.setVisibility(View.VISIBLE);
        goma_img.setVisibility(View.VISIBLE);

        ge_red.setVisibility(View.INVISIBLE);
        ge_text.setVisibility(View.VISIBLE);
        gelatin.setVisibility(View.INVISIBLE);
        gelatin_img.setVisibility(View.INVISIBLE);

        gi_red.setVisibility(View.INVISIBLE);
        gi_text.setVisibility(View.VISIBLE);
        gitara.setVisibility(View.INVISIBLE);
        gitara_img.setVisibility(View.INVISIBLE);

        ga_red.setVisibility(View.INVISIBLE);
        ga_text.setVisibility(View.VISIBLE);
        gatas.setVisibility(View.INVISIBLE);
        gatas_img.setVisibility(View.INVISIBLE);

        gu_red.setVisibility(View.INVISIBLE);
        gu_text.setVisibility(View.VISIBLE);
        guyabano.setVisibility(View.INVISIBLE);
        guyabano_img.setVisibility(View.INVISIBLE);
    }
    public void guClick(View view) {
        gu_red.setVisibility(View.VISIBLE);
        gu_text.setVisibility(View.INVISIBLE);
        guyabano.setVisibility(View.VISIBLE);
        guyabano_img.setVisibility(View.VISIBLE);

        ge_red.setVisibility(View.INVISIBLE);
        ge_text.setVisibility(View.VISIBLE);
        gelatin.setVisibility(View.INVISIBLE);
        gelatin_img.setVisibility(View.INVISIBLE);

        gi_red.setVisibility(View.INVISIBLE);
        gi_text.setVisibility(View.VISIBLE);
        gitara.setVisibility(View.INVISIBLE);
        gitara_img.setVisibility(View.INVISIBLE);

        go_red.setVisibility(View.INVISIBLE);
        go_text.setVisibility(View.VISIBLE);
        goma.setVisibility(View.INVISIBLE);
        goma_img.setVisibility(View.INVISIBLE);

        ga_red.setVisibility(View.INVISIBLE);
        ga_text.setVisibility(View.VISIBLE);
        gatas.setVisibility(View.INVISIBLE);
        gatas_img.setVisibility(View.INVISIBLE);
    }
}
