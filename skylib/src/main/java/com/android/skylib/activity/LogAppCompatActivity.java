package com.android.skylib.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.android.skylib.BuildConfig;

import java.util.logging.Logger;

/**
 * User: shechaoqun
 * Email: shechaoqun@gmail.com
 * 2016/5/11
 */
public class LogAppCompatActivity extends AppCompatActivity {

    private static final String TAG = LogAppCompatActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (BuildConfig.ENABLE_DEBUG) {
            Log.i(TAG, "onCreate");
        }
    }

    @Override
    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
        if (BuildConfig.ENABLE_DEBUG) {
            Log.i(TAG,"onAttachFragment");
        }
    }

    @Override
    public void onContentChanged() {
        super.onContentChanged();
        if (BuildConfig.ENABLE_DEBUG) {
            Log.i(TAG,"onContentChanged");
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        if (BuildConfig.ENABLE_DEBUG) {
            Log.i(TAG,"onStart");
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (BuildConfig.ENABLE_DEBUG) {
            Log.i(TAG,"onResume");
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (BuildConfig.ENABLE_DEBUG) {
            Log.i(TAG,"onPause");
        }
    }


    @Override
    protected void onStop() {
        super.onStop();
        if (BuildConfig.ENABLE_DEBUG) {
            Log.i(TAG,"onStop");
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (BuildConfig.ENABLE_DEBUG) {
            Log.i(TAG,"onDestroy");
        }
    }
}
