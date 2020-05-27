package com.example.animationsinandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtHelloWorld;
    private TextView txtHi;
    private boolean faded=true;
    private ImageView lion;
    private ImageView cheeta;
    boolean next=true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtHelloWorld = findViewById(R.id.hello_world);
        txtHi = findViewById(R.id.hi_world);

        txtHelloWorld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("TAG","hello");
                if(faded) {
                    txtHelloWorld.animate().alpha(0f).setDuration(3000);
                    txtHi.animate().alpha(1f).setDuration(3000);
                    faded=false;
                } else{
                    txtHelloWorld.animate().alpha(1f).setDuration(3000);
                    txtHi.animate().alpha(0f).setDuration(3000);


                    faded=true;

                }


            }
        });

        lion = findViewById(R.id.lion);
        cheeta = findViewById(R.id.cheeta);

        lion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(next) {
                    lion.animate().alpha(0f).setDuration(3000);
                    cheeta.animate().alpha(1f).setDuration(3000);
                   // cheeta.animate().translationX(200f).setDuration(1500);
                    cheeta.animate().rotationX(360f).setDuration(1500);
                    next=false;
            } else {
                    lion.animate().alpha(1f).setDuration(3000);
                    cheeta.animate().alpha(0f).setDuration(3000);
                  //   cheeta.animate().translationX(-200f).setDuration(1500);
                    next=true;

            }
            }
        });


    }


}
