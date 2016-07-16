package com.thesisit.flippino;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class PhonogramNg extends AppCompatActivity {
    private MontserratTextView nga_text;
    private MontserratTextView nga_red;
    private MontserratTextView ngi_text;
    private MontserratTextView ngi_red;
    private MontserratTextView ngo_text;
    private MontserratTextView ngo_red;
    private MontserratTextView sanga;
    private MontserratTextView ngipin;
    private MontserratTextView bungo;
    private ImageView sanga_img;
    private ImageView ngipin_img;
    private ImageView bungo_img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmng_intro_nga);
        nga_text = (MontserratTextView) findViewById(R.id.nga_text);
        nga_red = (MontserratTextView) findViewById(R.id.nga_red);

        ngi_text = (MontserratTextView) findViewById(R.id.ngi_text);
        ngi_red = (MontserratTextView) findViewById(R.id.ngi_red);

        ngo_text = (MontserratTextView) findViewById(R.id.ngo_text);
        ngo_red = (MontserratTextView) findViewById(R.id.ngo_red);


        //captions
        sanga = (MontserratTextView) findViewById(R.id.sanga);
        ngipin = (MontserratTextView) findViewById(R.id.ngipin);
        bungo = (MontserratTextView) findViewById(R.id.bungo);

        //images
        sanga_img = (ImageView) findViewById(R.id.sanga_img);
        ngipin_img = (ImageView) findViewById(R.id.ngipin_img);
        bungo_img = (ImageView) findViewById(R.id.bungo_img);
    }

    public void ngaClick(View view) {
        nga_red.setVisibility(View.VISIBLE);
        nga_text.setVisibility(View.INVISIBLE);
        sanga.setVisibility(View.VISIBLE);
        sanga_img.setVisibility(View.VISIBLE);

        ngi_red.setVisibility(View.INVISIBLE);
        ngi_text.setVisibility(View.VISIBLE);
        ngipin.setVisibility(View.INVISIBLE);
        ngipin_img.setVisibility(View.INVISIBLE);

        ngo_red.setVisibility(View.INVISIBLE);
        ngo_text.setVisibility(View.VISIBLE);
        bungo.setVisibility(View.INVISIBLE);
        bungo_img.setVisibility(View.INVISIBLE);

    }


    public void ngiClick(View view) {
        ngi_red.setVisibility(View.VISIBLE);
        ngi_text.setVisibility(View.INVISIBLE);
        ngipin.setVisibility(View.VISIBLE);
        ngipin_img.setVisibility(View.VISIBLE);

        nga_red.setVisibility(View.INVISIBLE);
        nga_text.setVisibility(View.VISIBLE);
        sanga.setVisibility(View.INVISIBLE);
        sanga_img.setVisibility(View.INVISIBLE);

        ngo_red.setVisibility(View.INVISIBLE);
        ngo_text.setVisibility(View.VISIBLE);
        bungo.setVisibility(View.INVISIBLE);
        bungo_img.setVisibility(View.INVISIBLE);
    }

    public void ngoClick(View view) {
        ngo_red.setVisibility(View.VISIBLE);
        ngo_text.setVisibility(View.INVISIBLE);
        bungo.setVisibility(View.VISIBLE);
        bungo_img.setVisibility(View.VISIBLE);

        ngi_red.setVisibility(View.INVISIBLE);
        ngi_text.setVisibility(View.VISIBLE);
        ngipin.setVisibility(View.INVISIBLE);
        ngipin_img.setVisibility(View.INVISIBLE);

        nga_red.setVisibility(View.INVISIBLE);
        nga_text.setVisibility(View.VISIBLE);
        sanga.setVisibility(View.INVISIBLE);
        sanga_img.setVisibility(View.INVISIBLE);
    }

}
