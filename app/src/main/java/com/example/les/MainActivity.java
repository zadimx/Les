package com.example.les;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button micro = findViewById(R.id.micro);
        final Button vibro = findViewById(R.id.vibro);
        final Button ip = findViewById(R.id.ip);
        final Button giro = findViewById(R.id.giro);
        final Button camera = findViewById(R.id.camera);
        final Button geo = findViewById(R.id.geo);
        final Button fon = findViewById(R.id.fon);
        final RelativeLayout back = findViewById(R.id.background);
        final Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        micro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                back.setBackgroundColor(Color.BLACK);
            }
        });
        vibro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                back.setBackgroundColor(Color.GRAY);
                vibrator.vibrate(10000);
            }
        });
        ip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                back.setBackgroundColor(Color.MAGENTA);
                vibrator.cancel();
            }
        });
        giro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                back.setBackgroundColor(Color.RED);
            }
        });
        camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                back.setBackgroundColor(Color.GREEN);
            }
        });
        geo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                back.setBackgroundColor(Color.BLUE);
            }
        });
        fon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                back.setBackgroundColor(Color.YELLOW);
            }
        });
    }
}
