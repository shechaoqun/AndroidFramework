package com.android.skylib.okhttp;


import java.util.Map;


public abstract class RequestBuilder {
    protected String url;
    protected Map<String, String> params;
    protected Map<String, String> headers;

    public abstract RequestBuilder url(String url);

    public abstract RequestCall build();

    public abstract RequestBuilder addParams(String key, String val);
    public abstract RequestBuilder addMapParams(Map<String, String> params);

    public abstract RequestBuilder addHeader(String key, String val);
    public abstract RequestBuilder addMapHeader(Map<String, String> headers);

}
