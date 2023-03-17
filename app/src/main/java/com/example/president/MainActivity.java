package com.example.president;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GameController gameController = new GameController();
        Button button = findViewById(R.id.testButton);
        button.setOnClickListener(gameController);
    }
}