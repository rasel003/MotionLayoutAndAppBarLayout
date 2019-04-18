package com.example.motionlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomappbar.BottomAppBar;

public class BottomAppBarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_app_bar);

        BottomAppBar bar = findViewById(R.id.bar);
        setSupportActionBar(bar);

       /* bar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle the navigation click by showing a BottomDrawer etc.

                Toast.makeText(BottomAppBarActivity.this, "item clicked : "+v.getId(), Toast.LENGTH_SHORT).show();
            }
        });*/
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
                Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show();
                ExampleBottomSheetDialogFragment bottomNavDrawerFragment = new ExampleBottomSheetDialogFragment();
                bottomNavDrawerFragment.show(getSupportFragmentManager(), "exampleBottomSheet");
                return true;
            default:
                Toast.makeText(this, "Default", Toast.LENGTH_SHORT).show();
                return super.onContextItemSelected(item);
        }
    }
}
