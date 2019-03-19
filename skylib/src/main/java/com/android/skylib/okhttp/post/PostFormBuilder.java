package com.android.skylib.okhttp.post;



import com.android.skylib.okhttp.RequestBuilder;
import com.android.skylib.okhttp.RequestCall;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class PostFormBuilder extends RequestBuilder {
    private List<FileInput> files = new ArrayList<>();

    @Override
    public PostFormBuilder url(String url) {
        this.url = url;
        return this;
    }

    @Override
    public RequestCall build() {
//        String token = EncryUtils.getInstance().decryptString(SharedPreferenceInstance.getInstance().getToken(), MyApplication.getApp().getPackageName());
//        addHeader("access-auth-token", token);
//        String language = SharedPreferenceInstance.getInstance().getLanguageCode() == 1 ? "zh-CN,zh" : "en-us";
//        addHeader("Accept-Language", language);
        return new PostFormRequest(url, params, headers, files).build();
    }

    ///IdentityHashMap  与 hashMap
    @Override
    public PostFormBuilder addParams(String key, String value) {
        if (this.params == null) params = new HashMap<>();
        params.put(key, value);
        return this;
    }

    @Override
    public RequestBuilder addMapParams(Map<String, String> params) {
        if (this.params == null) this.params = new HashMap<>();
        this.params = params;
        return this;
    }

    public PostFormBuilder addFile(String name, String filename, File file) {
        files.add(new FileInput(name, filename, file));
        return this;
    }

    @Override
    public PostFormBuilder addHeader(String key, String value) {
        if (this.headers == null) headers = new HashMap<>();
        headers.put(key, value);
        return this;
    }

    @Override
    public RequestBuilder addMapHeader(Map<String, String> headers) {
        if (this.headers == null) this.headers = new HashMap<>();
        this.headers = headers;
        return this;
    }

    public static class FileInput {
        public String key;
        public String filename;
        public File file;

        public FileInput(String name, String filename, File file) {
            this.key = name;
            this.filename = filename;
            this.file = file;
        }
    }


}
