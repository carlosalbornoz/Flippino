package com.thesisit.flippino;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class FlippinoMainMenu extends AppCompatActivity {

    private ImageButton exit;
    private ImageButton home;
    private ImageButton stars;
    private ImageButton help;
    private ImageButton soundToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainmenu);
        addButtonListener();
    }

    public void startMaglakbay(View view) {
        Intent intent = new Intent(this, LettersMenu.class);
        startActivity(intent);
    }

    public void addButtonListener()
    {
        exit = (ImageButton) findViewById(R.id.global_exit);
        home = (ImageButton) findViewById(R.id.global_home);
        stars = (ImageButton) findViewById(R.id.global_stars);
        help = (ImageButton) findViewById(R.id.global_help);
        soundToggle = (ImageButton) findViewById(R.id.global_sound);


        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), LettersMenu.class);
                startActivity(intent);
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), FlippinoStart.class);
                startActivity(intent);
            }
        });
    }

    /*public void startMagsanay(View view) {
        Intent intent = new Intent(this, *****);
        startActivity(intent);
    } */
}
