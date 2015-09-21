package com.easyandroid.lib.http;

/**
 * Email: shechaoqun@gmail.com
 * 2015/9/1
 */
public interface TaskOtherDelegate {
    void onPreExecute_TaskDelegate(int _taskId);
    <T>  void onProgressUpdate_TaskDelegate(int _taskId, T t );
}
