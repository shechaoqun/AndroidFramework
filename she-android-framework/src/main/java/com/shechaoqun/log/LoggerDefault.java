package com.shechaoqun.log;

import android.util.Log;

/**
 * Helper class to redirect {@link LogManager#logger} to {@link Log}
 */
public class LoggerDefault implements Logger {

    private static final String LOG_FORMAT = "%1$s\n%2$s";
    private  volatile boolean writeDebugLogs = false;
    private  volatile boolean writeLogs = true;

    /**
     * Enables/disables detail logging of work
     * Debug logs are disabled by default.
     */
    public  void writeDebugLogs(boolean writeDebugLogs) {
        this.writeDebugLogs = writeDebugLogs;
    }

    /** Enables/disables logging of this library completely (even error logs). */
    public  void writeLogs(boolean writeLogs) {
        this.writeLogs = writeLogs;
    }


    @Override
    public int v(String tag, String msg) {
        return Log.v(tag, msg);
    }

    @Override
    public int v(String tag, String msg, Throwable tr) {
        return Log.v(tag, msg, tr);
    }

    @Override
    public int d(String tag, String msg) {
            return Log.d(tag, msg);
    }

    @Override
    public int d(String tag, String msg, Throwable tr) {
        return Log.d(tag, msg, tr);
    }

    @Override
    public int i(String tag, String msg) {
        return Log.i(tag, msg);
    }

    @Override
    public int i(String tag, String msg, Throwable tr) {
        return Log.i(tag, msg, tr);
    }

    @Override
    public int w(String tag, String msg) {
        return Log.w(tag, msg);
    }

    @Override
    public int w(String tag, String msg, Throwable tr) {
        return Log.w(tag, msg, tr);
    }

    @Override
    public int e(String tag, String msg) {
        return Log.e(tag, msg);
    }

    @Override
    public int e(String tag, String msg, Throwable tr) {
        return Log.e(tag, msg, tr);
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
