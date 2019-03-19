package com.android.skylib.okhttp;


import java.io.IOException;

import okhttp3.Response;


public abstract class StringCallback extends Callback<String> {
    @Override
    public String parseNetworkResponse(Response response) throws IOException {
        return response.body().string();
    }
}
