package com.utc.safestroke;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.utc.safestroke.ui.chatbot.ChatbotFragment;

public class ChatbotActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chatbot);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, ChatbotFragment.newInstance())
                    .commitNow();
        }
    }
}