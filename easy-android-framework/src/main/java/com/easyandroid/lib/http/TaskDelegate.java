package com.easyandroid.lib.http;

/**
 * Email: shechaoqun@gmail.com
 * 2015/9/1
 * 任务分发接口
 */
public interface TaskDelegate {


    <T> void faild_TaskDelegate(int taskId, T t);
    <T> void success_TaskDelegate(int taskId, T t);
}
