package com.android.skylib.http;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * User: shechaoqun
 * Email: shechaoqun@gmail.com
 * 2016/5/11
 */
public class BitmapHelper {
    private static String TAG = BitmapHelper.class.getSimpleName();
    public static Bitmap getBitmapFromURL(String url) {
        try {
            URL urls = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) urls.openConnection();
            connection.setDoInput(true);
            connection.connect();
            InputStream input = connection.getInputStream();
            Bitmap myBitmap = BitmapFactory.decodeStream(input);
            return myBitmap;
        } catch (IOException e) {
            // Log exception
            return null;
        }
    }
}
