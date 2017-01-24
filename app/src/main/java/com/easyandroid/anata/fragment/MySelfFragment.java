package com.easyandroid.anata.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.skylib.fragment.LogFragment;
import com.easyandroid.anata.R;

/**
 * Created by chaoqunshe on 9/8/16.
 */
public class MySelfFragment extends LogFragment {

    public static MySelfFragment newInstance() {
        MySelfFragment f = new MySelfFragment();
        return f;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_myself, container, false);
        return v;
    }
}
