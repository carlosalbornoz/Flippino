package com.thesisit.flippino;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FlippinoMainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(r.layout.activity_mainmenu);
    }

    public void startApp(View view) {
        Intent intent = new Intent(this, TitleA.class);
        startActivity(intent);
    }
}
