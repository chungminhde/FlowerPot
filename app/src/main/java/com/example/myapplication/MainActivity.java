package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnNewGame;
    Button btnStatistics;
    Button btnAbout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        map();

        btnNewGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, New_Game.class);
                startActivity(i);
            }
        });

        statistics();
        btnStatistics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent(MainActivity.this,Statistics.class);
                startActivity(j);
            }
        });
        about_game();
        btnAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(MainActivity.this,About.class);
                startActivity(k);
            }
        });
    }

    private void map(){
        btnNewGame = (Button) findViewById(R.id.btnNewGame);
    }
    private void statistics(){
        btnStatistics=(Button) findViewById(R.id.btnStatistic);
    }
    private void about_game(){
        btnAbout=(Button) findViewById(R.id.btnAbout);
    }

}
