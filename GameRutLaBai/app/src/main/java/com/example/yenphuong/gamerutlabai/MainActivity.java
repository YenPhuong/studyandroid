package com.example.yenphuong.gamerutlabai;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView imgLabai;
    Button btnRutlabai;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgLabai = (ImageView)findViewById(R.id.imgLabai);
        btnRutlabai = (Button)findViewById(R.id.btnRutlabai);

        btnRutlabai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArrayList<Integer> mangLabai = new ArrayList<Integer>();
                mangLabai.add(R.drawable.c1);//0
                mangLabai.add(R.drawable.c2);//1
                mangLabai.add(R.drawable.c3);//2
                mangLabai.add(R.drawable.c4);
                mangLabai.add(R.drawable.c5);
                mangLabai.add(R.drawable.c6);
                mangLabai.add(R.drawable.c7);
                mangLabai.add(R.drawable.c8);
                mangLabai.add(R.drawable.c9);
                mangLabai.add(R.drawable.c10);
                mangLabai.add(R.drawable.cj);
                mangLabai.add(R.drawable.ck);
                mangLabai.add(R.drawable.cq);

                mangLabai.add(R.drawable.d1);
                mangLabai.add(R.drawable.d2);
                mangLabai.add(R.drawable.d3);
                mangLabai.add(R.drawable.d4);
                mangLabai.add(R.drawable.d5);
                mangLabai.add(R.drawable.d6);
                mangLabai.add(R.drawable.d7);
                mangLabai.add(R.drawable.d8);
                mangLabai.add(R.drawable.d9);
                mangLabai.add(R.drawable.d10);
                mangLabai.add(R.drawable.dj);
                mangLabai.add(R.drawable.dk);
                mangLabai.add(R.drawable.dq);

                mangLabai.add(R.drawable.h1);
                mangLabai.add(R.drawable.h2);
                mangLabai.add(R.drawable.h3);
                mangLabai.add(R.drawable.h4);
                mangLabai.add(R.drawable.h5);
                mangLabai.add(R.drawable.h6);
                mangLabai.add(R.drawable.h7);
                mangLabai.add(R.drawable.h8);
                mangLabai.add(R.drawable.h9);
                mangLabai.add(R.drawable.h10);
                mangLabai.add(R.drawable.hj);
                mangLabai.add(R.drawable.hk);
                mangLabai.add(R.drawable.hq);

                mangLabai.add(R.drawable.s1);
                mangLabai.add(R.drawable.s2);
                mangLabai.add(R.drawable.s3);
                mangLabai.add(R.drawable.s4);
                mangLabai.add(R.drawable.s5);
                mangLabai.add(R.drawable.s6);
                mangLabai.add(R.drawable.s7);
                mangLabai.add(R.drawable.s8);
                mangLabai.add(R.drawable.s9);
                mangLabai.add(R.drawable.s10);
                mangLabai.add(R.drawable.sj);
                mangLabai.add(R.drawable.sk);
                mangLabai.add(R.drawable.sq);

                int lengthArray = mangLabai.size();

                Random r = new Random();
                int batKi = r.nextInt(lengthArray);

                imgLabai.setImageResource(mangLabai.get(batKi));



            }
        });
    }


}
