package com.android.skylib.okhttp;


import okhttp3.Call;
import okhttp3.Request;


public class RequestCall {
    private OkHttpRequest okHttpRequest;
    private Request request;
    private Call call;

    public RequestCall(OkHttpRequest okHttpRequest) {
        this.okHttpRequest = okHttpRequest;
    }

    public void execute(Callback callback) {
        generateCall(callback);
        if (callback != null) {
            callback.onBefore(request);
        }
        WonderfulOkhttpUtils.getInstance().execute(this, callback);
    }


    private Call generateCall(Callback callback) {
        request = generateRequest(callback);
        call = WonderfulOkhttpUtils.getInstance().getOkHttpClient().newCall(request);
        return call;
    }


    private Request generateRequest(Callback callback) {
        return okHttpRequest.generateRequest(callback);
    }

    public Call getCall() {
        return call;
    }
}


