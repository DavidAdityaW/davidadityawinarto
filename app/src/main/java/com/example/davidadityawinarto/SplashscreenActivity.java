package com.example.davidadityawinarto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/*
    Dikerjakan pada tanggal : 19 Mei 2021
    Dibuat oleh :
    NIM   : 10118071
    Nama  : David Aditya Winarto
    Kelas : IF-2
*/

public class SplashscreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), WalkthroughActivity.class));
                finish();
            }
        }, 3000L); // 3 detik
    }
}