package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class New_Game extends AppCompatActivity {
    Button btnSinglePlay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new__game);

        singleplay();
        btnSinglePlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i  = new Intent(New_Game.this,Single_Play.class);
                startActivity(i);
            }
        });

    }


    private void singleplay(){
        btnSinglePlay=(Button) findViewById(R.id.btnSinglePlay);
    }
}
