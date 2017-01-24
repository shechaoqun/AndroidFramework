package com.easyandroid.anata.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.skylib.fragment.LogFragment;
import com.easyandroid.anata.R;

/**
 * Created by chaoqunshe on 9/8/16.
 */
public class CalendarFragment extends LogFragment{

    public static CalendarFragment newInstance() {
        CalendarFragment f = new CalendarFragment();
        return f;
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_calendar, container, false);
        return v;
    }
}
