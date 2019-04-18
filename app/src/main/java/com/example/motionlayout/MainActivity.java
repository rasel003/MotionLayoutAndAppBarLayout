package com.example.motionlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    AnimationDrawable rocketAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView rocketImage = findViewById(R.id.rocket_image);
        rocketImage.setBackgroundResource(R.drawable.rocket_thrust);
        rocketAnimation = (AnimationDrawable) rocketImage.getBackground();

        rocketImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rocketAnimation.start();
            }
        });
    }
}
