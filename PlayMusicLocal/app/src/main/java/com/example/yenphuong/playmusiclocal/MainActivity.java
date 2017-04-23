package com.example.yenphuong.playmusiclocal;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnPlay;
    Button btnStop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnPlay = (Button)findViewById(R.id.buttonPlay);
        final MediaPlayer song = MediaPlayer.create(MainActivity.this,R.raw.noinaycoanh);
        btnPlay.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                song.start();
            }
        });


        btnStop = (Button)findViewById(R.id.buttonStop);
        btnStop.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                onPause();
                song.pause();
            }
        });

    }
}
