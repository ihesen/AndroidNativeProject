package com.example.androidnativeproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import io.flutter.embedding.android.FlutterActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.tv_hellow).setOnClickListener(this::onclick);
    }

    private void onclick(View view) {
//        startActivity(new Intent(this, MyFlutterActivity.class));
        Intent intent = FlutterActivity.withNewEngine().initialRoute("/main").build(this);
        startActivity(intent);
    }
}