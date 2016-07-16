package com.thesisit.flippino;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import com.thesisit.flippino.MontserratTextView;

/**
 * Created by jethrolmanalo on 01/07/16.
 */
public class PhonogramB extends AppCompatActivity {
    private MontserratTextView ba_text;
    private MontserratTextView ba_red;
    private MontserratTextView be_text;
    private MontserratTextView be_red;
    private MontserratTextView bi_text;
    private MontserratTextView bi_red;
    private MontserratTextView bo_text;
    private MontserratTextView bo_red;
    private MontserratTextView bu_text;
    private MontserratTextView bu_red;
    private MontserratTextView baboy;
    private MontserratTextView belo;
    private MontserratTextView bibe;
    private MontserratTextView bote;
    private MontserratTextView butiki;
    private ImageView baboy_img;
    private ImageView belo_img;
    private ImageView bibe_img;
    private ImageView bote_img;
    private ImageView butiki_img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_bmng_intro_bu);
            ba_text = (MontserratTextView) findViewById(R.id.ba_text);
            ba_red = (MontserratTextView) findViewById(R.id.ba_red);

            be_text = (MontserratTextView) findViewById(R.id.be_text);
            be_red = (MontserratTextView) findViewById(R.id.be_red);

            bi_text = (MontserratTextView) findViewById(R.id.bi_text);
            bi_red = (MontserratTextView) findViewById(R.id.bi_red);

            bo_text = (MontserratTextView) findViewById(R.id.bo_text);
            bo_red = (MontserratTextView) findViewById(R.id.bo_red);

            bu_text = (MontserratTextView) findViewById(R.id.bu_text);
            bu_red = (MontserratTextView) findViewById(R.id.bu_red);

            //captions
            baboy = (MontserratTextView) findViewById(R.id.baboy);
            belo = (MontserratTextView) findViewById(R.id.belo);
            bibe = (MontserratTextView) findViewById(R.id.bibe);
            bote = (MontserratTextView) findViewById(R.id.bote);
            butiki = (MontserratTextView) findViewById(R.id.butiki);

            //images
            baboy_img = (ImageView) findViewById(R.id.baboy_img);
            belo_img = (ImageView) findViewById(R.id.belo_img);
            bibe_img = (ImageView) findViewById(R.id.bibe_img);
            bote_img = (ImageView) findViewById(R.id.bote_img);
            butiki_img = (ImageView) findViewById(R.id.butiki_img);
        }

        public void baClick(View view) {
            ba_red.setVisibility(View.VISIBLE);
            ba_text.setVisibility(View.INVISIBLE);
            baboy.setVisibility(View.VISIBLE);
            baboy_img.setVisibility(View.VISIBLE);

            be_text.setVisibility(View.VISIBLE);
            be_red.setVisibility(View.INVISIBLE);
            belo.setVisibility(View.INVISIBLE);
            belo_img.setVisibility(View.INVISIBLE);

            bi_red.setVisibility(View.INVISIBLE);
            bi_text.setVisibility(View.VISIBLE);
            bibe.setVisibility(View.INVISIBLE);
            bibe_img.setVisibility(View.INVISIBLE);

            bo_red.setVisibility(View.INVISIBLE);
            bo_text.setVisibility(View.VISIBLE);
            bote.setVisibility(View.INVISIBLE);
            bote_img.setVisibility(View.INVISIBLE);

            bu_red.setVisibility(View.INVISIBLE);
            bu_text.setVisibility(View.VISIBLE);
            butiki.setVisibility(View.INVISIBLE);
            butiki_img.setVisibility(View.INVISIBLE);

        }

        public void beClick(View view) {
            be_red.setVisibility(View.VISIBLE);
            be_text.setVisibility(View.INVISIBLE);
            belo.setVisibility(View.VISIBLE);
            belo_img.setVisibility(View.VISIBLE);

            ba_red.setVisibility(View.INVISIBLE);
            ba_text.setVisibility(View.VISIBLE);
            baboy.setVisibility(View.INVISIBLE);
            baboy_img.setVisibility(View.INVISIBLE);

            bi_red.setVisibility(View.INVISIBLE);
            bi_text.setVisibility(View.VISIBLE);
            bibe.setVisibility(View.INVISIBLE);
            bibe_img.setVisibility(View.INVISIBLE);

            bo_red.setVisibility(View.INVISIBLE);
            bo_text.setVisibility(View.VISIBLE);
            bote.setVisibility(View.INVISIBLE);
            bote_img.setVisibility(View.INVISIBLE);

            bu_red.setVisibility(View.INVISIBLE);
            bu_text.setVisibility(View.VISIBLE);
            butiki.setVisibility(View.INVISIBLE);
            butiki_img.setVisibility(View.INVISIBLE);
        }

        public void biClick(View view) {
            bi_red.setVisibility(View.VISIBLE);
            bi_text.setVisibility(View.INVISIBLE);
            bibe.setVisibility(View.VISIBLE);
            bibe_img.setVisibility(View.VISIBLE);

            be_red.setVisibility(View.INVISIBLE);
            be_text.setVisibility(View.VISIBLE);
            belo.setVisibility(View.INVISIBLE);
            belo_img.setVisibility(View.INVISIBLE);

            ba_red.setVisibility(View.INVISIBLE);
            ba_text.setVisibility(View.VISIBLE);
            baboy.setVisibility(View.INVISIBLE);
            baboy_img.setVisibility(View.INVISIBLE);

            bo_red.setVisibility(View.INVISIBLE);
            bo_text.setVisibility(View.VISIBLE);
            bote.setVisibility(View.INVISIBLE);
            bote_img.setVisibility(View.INVISIBLE);

            bu_red.setVisibility(View.INVISIBLE);
            bu_text.setVisibility(View.VISIBLE);
            butiki.setVisibility(View.INVISIBLE);
            butiki_img.setVisibility(View.INVISIBLE);
        }

        public void boClick(View view) {
            bo_red.setVisibility(View.VISIBLE);
            bo_text.setVisibility(View.INVISIBLE);
            bote.setVisibility(View.VISIBLE);
            bote_img.setVisibility(View.VISIBLE);

            be_red.setVisibility(View.INVISIBLE);
            be_text.setVisibility(View.VISIBLE);
            belo.setVisibility(View.INVISIBLE);
            belo_img.setVisibility(View.INVISIBLE);

            bi_red.setVisibility(View.INVISIBLE);
            bi_text.setVisibility(View.VISIBLE);
            bibe.setVisibility(View.INVISIBLE);
            bibe_img.setVisibility(View.INVISIBLE);

            ba_red.setVisibility(View.INVISIBLE);
            ba_text.setVisibility(View.VISIBLE);
            baboy.setVisibility(View.INVISIBLE);
            baboy_img.setVisibility(View.INVISIBLE);

            bu_red.setVisibility(View.INVISIBLE);
            bu_text.setVisibility(View.VISIBLE);
            butiki.setVisibility(View.INVISIBLE);
            butiki_img.setVisibility(View.INVISIBLE);
        }
        public void buClick(View view) {
            bu_red.setVisibility(View.VISIBLE);
            bu_text.setVisibility(View.INVISIBLE);
            butiki.setVisibility(View.VISIBLE);
            butiki_img.setVisibility(View.VISIBLE);

            be_red.setVisibility(View.INVISIBLE);
            be_text.setVisibility(View.VISIBLE);
            belo.setVisibility(View.INVISIBLE);
            belo_img.setVisibility(View.INVISIBLE);

            bi_red.setVisibility(View.INVISIBLE);
            bi_text.setVisibility(View.VISIBLE);
            bibe.setVisibility(View.INVISIBLE);
            bibe_img.setVisibility(View.INVISIBLE);

            bo_red.setVisibility(View.INVISIBLE);
            bo_text.setVisibility(View.VISIBLE);
            bote.setVisibility(View.INVISIBLE);
            bote_img.setVisibility(View.INVISIBLE);

            ba_red.setVisibility(View.INVISIBLE);
            ba_text.setVisibility(View.VISIBLE);
            baboy.setVisibility(View.INVISIBLE);
            baboy_img.setVisibility(View.INVISIBLE);
        }
    }
