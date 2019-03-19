package com.android.skylib.okhttp.post;



import com.android.skylib.okhttp.OkHttpRequest;

import java.util.Map;

import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;


public class PostJsonRequest extends OkHttpRequest {

    private String body;
    private MediaType mime;

    protected PostJsonRequest(String url, Map<String, String> params, Map<String, String> headers, String body, MediaType mime) {
        super(url, params, headers);
        this.body = body;
        this.mime = mime;
    }

    @Override
    protected RequestBody buildRequestBody() {
        return RequestBody.create(mime, body);
    }

    @Override
    protected Request buildRequest(Request.Builder builder, RequestBody requestBody) {
        return builder.post(requestBody).build();
    }
}