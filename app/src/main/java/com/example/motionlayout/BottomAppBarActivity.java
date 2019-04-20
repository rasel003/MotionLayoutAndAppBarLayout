package com.example.motionlayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.bottomappbar.BottomAppBar;

public class BottomAppBarActivity extends AppCompatActivity implements ExampleBottomSheetDialogFragment.BottomSheetListener{

    private  ExampleBottomSheetDialogFragment bottomNavDrawerFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_app_bar);

        BottomAppBar bar = findViewById(R.id.bar);
        setSupportActionBar(bar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.bottomappbar_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.app_bar_fav:
                Toast.makeText(this, "Love", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.app_bar_search:
                Toast.makeText(this, "Search", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.app_bar_settings:
                Toast.makeText(this, "Setting", Toast.LENGTH_SHORT).show();
                return true;
            case android.R.id.home:
                bottomNavDrawerFragment = new ExampleBottomSheetDialogFragment();
                bottomNavDrawerFragment.show(getSupportFragmentManager(), "exampleBottomSheet");
                return true;
            default:
                Toast.makeText(this, "Default", Toast.LENGTH_SHORT).show();
                return super.onContextItemSelected(item);
        }
    }

    @Override
    public void onButtonClicked(String text) {
        if("Button close clicked".equals(text)){
            bottomNavDrawerFragment.dismiss();
        }
    }
}
