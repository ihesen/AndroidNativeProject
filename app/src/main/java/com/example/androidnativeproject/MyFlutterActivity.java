package com.example.androidnativeproject;

import android.os.Bundle;

import androidx.annotation.NonNull;

import io.flutter.embedding.android.FlutterActivity;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.GeneratedPluginRegistrant;

/**
 * @Description:
 * @Author: xes
 * @Date: 2022/2/24
 */
public class MyFlutterActivity extends FlutterActivity {

    private static final String CHANNEL = "samples.flutter.dev/battery";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flutter);
//        final FlutterView flutterView = Flutter.createView(
//                this,
//                getLifecycle(),
//                "route1"
//        );
//        final FrameLayout layout = findViewById(R.id.flutter_container);
//        layout.addView(flutterView);
//        final FlutterView.FirstFrameListener[] listeners = new FlutterView.FirstFrameListener[1];
//        listeners[0] = new FlutterView.FirstFrameListener() {
//            @Override
//            public void onFirstFrame() {
//                layout.setVisibility(View.VISIBLE);
//            }
//        };
//        flutterView.addFirstFrameListener(listeners[0]);

    }

    @Override
    public void configureFlutterEngine(@NonNull FlutterEngine flutterEngine) {
        super.configureFlutterEngine(flutterEngine);
        GeneratedPluginRegistrant.registerWith(flutterEngine);
        new MethodChannel(flutterEngine.getDartExecutor().getBinaryMessenger(), CHANNEL)
                .setMethodCallHandler((call, result) -> {

                });
    }
}
