package com.example.explorechina;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    private static final int SPLASH_TIME = 3000; // 3 seconds
    private Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        handler = new Handler();

        // Auto-navigate after 3 seconds
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                navigateToMain();
            }
        }, SPLASH_TIME);

        // Allow user to tap screen to skip splash
        View splashView = findViewById(R.id.splash_container);
        splashView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handler.removeCallbacksAndMessages(null);
                navigateToMain();
            }
        });

    }

    private void navigateToMain() {
        Intent intent = new Intent(SplashActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
