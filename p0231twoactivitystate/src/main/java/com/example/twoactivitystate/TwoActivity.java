package com.example.twoactivitystate;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

/**
 * Created by 1cprog2 on 27.04.2016.
 */
public class TwoActivity extends AppCompatActivity {

    final String TAG = "States";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.two);
        Log.d(TAG, "two onCreate");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "two onreStart");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "two onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "two onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "two onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "two onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "two onDestroy");
    }
}
