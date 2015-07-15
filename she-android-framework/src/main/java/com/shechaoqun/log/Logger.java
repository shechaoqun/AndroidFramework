package com.shechaoqun.log;

/**
 * Created by chaoqun on 2015/7/9.
 * Logger是一个日志的接口
 */
public interface Logger {

    int v(String tag, String msg);

    int v(String tag, String msg, Throwable tr);

    int d(String tag, String msg);

    int d(String tag, String msg, Throwable tr);

    int i(String tag, String msg);

    int i(String tag, String msg, Throwable tr);

    int w(String tag, String msg);

    int w(String tag, String msg, Throwable tr);

    int e(String tag, String msg);

    int e(String tag, String msg, Throwable tr);

    void open();

    void close();

    void println(int priority, String tag, String message);
}
