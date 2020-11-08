package com.aj.android.messenger.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toolbar;

import com.aj.android.messenger.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;

public class SingleChatActivity extends AppCompatActivity {
    private MaterialToolbar appBarLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_chat);
        //appBarLayout = findViewById(R.id.single_chat_appbar);
    }

}