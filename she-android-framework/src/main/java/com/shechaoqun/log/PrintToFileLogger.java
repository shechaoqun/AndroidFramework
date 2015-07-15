package com.shechaoqun.log;

/**
 * Created by chaoqun on 2015/7/9.
 *
 * @version V1.0
 * @Description PrintToFileLogger是框架中打印到sdcard上面的日志类
 */
public class PrintToFileLogger implements Logger {
    @Override
    public int v(String tag, String msg) {
        return 0;
    }

    @Override
    public int v(String tag, String msg, Throwable tr) {
        return 0;
    }

    @Override
    public int d(String tag, String msg) {
        return 0;
    }

    @Override
    public int d(String tag, String msg, Throwable tr) {
        return 0;
    }

    @Override
    public int i(String tag, String msg) {
        return 0;
    }

    @Override
    public int i(String tag, String msg, Throwable tr) {
        return 0;
    }

    @Override
    public int w(String tag, String msg) {
        return 0;
    }

    @Override
    public int w(String tag, String msg, Throwable tr) {
        return 0;
    }

    @Override
    public int e(String tag, String msg) {
        return 0;
    }

    @Override
    public int e(String tag, String msg, Throwable tr) {
        return 0;
    }

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public void println(int priority, String tag, String message) {

    }
}
