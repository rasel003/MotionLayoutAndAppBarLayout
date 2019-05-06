package com.example.motionlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.motionlayout.bottom_app_bar.BottomAppBarActivity;
import com.example.motionlayout.collapsible_toolbar.ActCollapsibleToolbar;
import com.example.motionlayout.drawerlayout.ActDrawerLayout;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        findViewById(R.id.btnAppBar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Dashboard.this, BottomAppBarActivity.class));
            }
        });

        findViewById(R.id.btnMotionActivity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Dashboard.this, MainActivity.class));
            }
        });
        findViewById(R.id.btnMotionFirst).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Dashboard.this, MotionFirstTest.class));
            }
        });
        findViewById(R.id.btnMotionCollapsingToolbar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Dashboard.this, ActCollapsibleToolbar.class));
            }
        });
        findViewById(R.id.btnMotionDrawerLayout).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Dashboard.this, ActDrawerLayout.class));
            }
        });
    }

    public void btnClicked(View view) {
        /*switch (view.getId()) {
            case R.id.btnAppBar:
                startActivity(new Intent(Dashboard.this, BottomAppBarActivity.class));
                break;
            case R.id.btnMotionActivity:
                startActivity(new Intent(Dashboard.this, MainActivity.class));
                break;
            case R.id.btnMotionFirst:
                startActivity(new Intent(Dashboard.this, MotionFirstTest.class));
                break;
            *//*case R.id.btnMotionCollapsingToolbar:
                startActivity(new Intent(Dashboard.this, ActCollapsibleToolbar.class));
                break;*//*
            case R.id.btnMotionDrawerLayout:
                startActivity(new Intent(Dashboard.this, ActDrawerLayout.class));
                break;
        }*/
    }
}
