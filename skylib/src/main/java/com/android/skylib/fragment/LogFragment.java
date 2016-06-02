package com.android.skylib.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.skylib.BuildConfig;

/**
 * User: shechaoqun
 * Email: shechaoqun@gmail.com
 * 2016/5/11
 */
public class LogFragment extends Fragment {

    static final String TAG = LogFragment.class.getSimpleName();
    //Fragment is inflated from layout
    @Override
    public void onInflate(Context context, AttributeSet attrs, Bundle savedInstanceState) {
        super.onInflate(context, attrs, savedInstanceState);
        if (BuildConfig.ENABLE_DEBUG) {
            Log.i(TAG, "onInflate");
        }
    }

    //Fragment is added to existing activity
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (BuildConfig.ENABLE_DEBUG) {
            Log.i(TAG,"onAttach");
        }
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (BuildConfig.ENABLE_DEBUG) {
            Log.i(TAG,"onCreate");
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (BuildConfig.ENABLE_DEBUG) {
            Log.i(TAG,"onCreateView");
        }
        return super.onCreateView(inflater, container, savedInstanceState);

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (BuildConfig.ENABLE_DEBUG) {
            Log.i(TAG,"onViewCreated");
        }
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if (BuildConfig.ENABLE_DEBUG) {
            Log.i(TAG,"onActivityCreated");
        }
    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        if (BuildConfig.ENABLE_DEBUG) {
            Log.i(TAG,"onViewStateRestored");
        }
    }

    @Override
    public void onStart() {
        super.onStart();
        if (BuildConfig.ENABLE_DEBUG) {
            Log.i(TAG,"onStart");
        }
    }

    //after this , fragment is active
    @Override
    public void onResume() {
        super.onResume();
        if (BuildConfig.ENABLE_DEBUG) {
            Log.i(TAG,"onResume");
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        if (BuildConfig.ENABLE_DEBUG) {
            Log.i(TAG,"onPause");
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        if (BuildConfig.ENABLE_DEBUG) {
            Log.i(TAG,"onSaveInstanceState");
        }
    }

    @Override
    public void onStop() {
        super.onStop();
        if (BuildConfig.ENABLE_DEBUG) {
            Log.i(TAG,"onStop");
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        if (BuildConfig.ENABLE_DEBUG) {
            Log.i(TAG,"onDestroyView");
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (BuildConfig.ENABLE_DEBUG) {
            Log.i(TAG,"onDestroy");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        if (BuildConfig.ENABLE_DEBUG) {
            Log.i(TAG,"onDetach");
        }
    }
}
