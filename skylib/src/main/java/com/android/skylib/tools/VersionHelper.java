package com.android.skylib.tools;

import android.os.Build;
import android.util.Log;

import com.android.skylib.BuildConfig;

/**
 * User: shechaoqun
 * Email: shechaoqun@gmail.com
 * 2016/5/11
 */
public class VersionHelper {
    private static String TAG = VersionHelper.class.getSimpleName();

    /**
     * @return int
     * 获取当前系统版本号
     */
    public static int getSDKVersion() {
        if (BuildConfig.ENABLE_DEBUG) {
            Log.i(TAG, "SDKVersion = " + Build.VERSION.SDK_INT);
        }
        return Build.VERSION.SDK_INT;
    }

    /**
     * @return String
     * 获取当前系统版本名称
     */
    public static String getSDKVersionName() {
        if (BuildConfig.ENABLE_DEBUG) {
            Log.i(TAG, "SDKVersionName = " + Build.VERSION.RELEASE);
        }
        return Build.VERSION.RELEASE;
    }
}
