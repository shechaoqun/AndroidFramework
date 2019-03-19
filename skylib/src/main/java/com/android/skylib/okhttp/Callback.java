package com.android.skylib.okhttp;


import java.io.IOException;

import okhttp3.Request;
import okhttp3.Response;


public abstract class Callback<T> {

    public abstract T parseNetworkResponse(Response response) throws IOException;

    public void onBefore(Request request) {
    }


    public void onAfter() {
    }

    public void inProgress(float progress) {

    }

    public abstract void onError(Request request, Exception e);

    public abstract void onResponse(T response);

    public static Callback CALLBACK_DEFAULT = new Callback() {

        @Override
        public Object parseNetworkResponse(Response response) throws IOException {
            return null;
        }

        @Override
        public void onError(Request request, Exception e) {

        }

        @Override
        public void onResponse(Object response) {

        }
    };
}
