package com.android.skylib.okhttp.get;


import com.android.skylib.okhttp.RequestBuilder;
import com.android.skylib.okhttp.RequestCall;

import java.util.HashMap;
import java.util.Map;


public class GetBuilder extends RequestBuilder {
    @Override
    public RequestCall build() {
        return new GetRequest(url, params, headers).build();
    }

    private String appendParams(String url, Map<String, String> params) {
        //TODO
        return null;
    }

    @Override
    public GetBuilder url(String url) {
        this.url = url;
        return this;
    }


    @Override
    public GetBuilder addParams(String key, String val) {
        if (this.params == null) params = new HashMap<>();
        params.put(key, val);
        return this;
    }

    @Override
    public RequestBuilder addMapParams(Map<String, String> params) {
        if (this.params == null) this.params = new HashMap<>();
        this.params = params;
        return this;
    }

    @Override
    public GetBuilder addHeader(String key, String val) {
        if (this.headers == null) headers = new HashMap<>();
        headers.put(key, val);
        return this;
    }

    @Override
    public RequestBuilder addMapHeader(Map<String, String> headers) {
        if (this.headers == null) this.headers = new HashMap<>();
        this.headers = headers;
        return this;
    }
}
