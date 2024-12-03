package com.utc.safestroke;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.utc.safestroke.ui.map.MapFragment;

public class MapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MapFragment.newInstance())
                    .commitNow();
        }
    }
}