package com.utc.safestroke;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.utc.safestroke.ui.detect.DetectFragment;

public class DetectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detect);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, DetectFragment.newInstance())
                    .commitNow();
        }
    }
}