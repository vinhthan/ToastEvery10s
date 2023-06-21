package com.example.runmethodevery10s;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Handler handler = new Handler();
    Runnable runnable;
    int delay = 10000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        handler.postDelayed(runnable = new Runnable() {
            public void run() {
                handler.postDelayed(runnable, delay);
                Toast.makeText(MainActivity.this, "This method is run every 10 seconds",
                        Toast.LENGTH_SHORT).show();
            }
        }, delay);
        super.onResume();
    }
}