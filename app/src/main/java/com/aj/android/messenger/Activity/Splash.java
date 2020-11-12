package com.aj.android.messenger.Activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.aj.android.messenger.R;

public class Splash extends AppCompatActivity {
    private SharedPreferences preferences;
    public static final String SIGNED_IN = "signed_in";
    public static final String APP_PREFERENCE = "Messenger_preference";
    public boolean loggedIn = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        preferences = getSharedPreferences(APP_PREFERENCE, MODE_PRIVATE);
        loggedIn = preferences.getBoolean(SIGNED_IN, false);
        new Handler().postDelayed(() -> {
            if (loggedIn)
                startActivity(new Intent(this, HomeActivity.class));
            else
                startActivity(new Intent(this, SignUpActivity.class));
            finish();
        }, 3000);
    }
}