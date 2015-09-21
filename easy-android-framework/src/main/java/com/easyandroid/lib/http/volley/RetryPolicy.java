package com.easyandroid.lib.http.volley;

/**
 * 重试策略  for a request
 * Email: shechaoqun@gmail.com
 * 2015/9/6
 */
public interface RetryPolicy {

    /**
     * Returns the current timeout (used for logging).
     * 返回当前超时
     */
    int getCurrentTimeout();

    /**
     * 返回当前重试次数 (used for logging).
     */
    int getCurrentRetryCount();

    void retry() throws V
}
