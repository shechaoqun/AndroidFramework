package com.easyandroid.anata;

import android.app.Application;

/**
 * Created by chaoqunshe on 7/7/17.
 */

public class MyApplication extends Application {

    private static MyApplication myApplication;

    public static MyApplication getInstance(){
        return myApplication;
    }


    @Override
    public void onCreate() {
        super.onCreate();
        myApplication = this;
    }
}
