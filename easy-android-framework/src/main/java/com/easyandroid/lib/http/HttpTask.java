package com.easyandroid.lib.http;

import android.os.AsyncTask;

/**
 * Email: shechaoqun@gmail.com
 * 2015/9/1
 */
public abstract class HttpTask<Params, Progress, Result> extends AsyncTask<Params, Progress, Result> {

    public static final String LOG_TAG = "HttpTask";

    public TaskDelegate delegate;
    public TaskOtherDelegate otherDelegate;
    public int taskId;

    public HttpTask(int _task, TaskDelegate _delegate) {
        super();
        taskId = _task;
        delegate = _delegate;
    }

    @Override
    protected void onPreExecute() {
        if (otherDelegate != null) {
            otherDelegate.onPreExecute_TaskDelegate(taskId);
        }
        super.onPreExecute();
    }

    @Override
    protected void onProgressUpdate(Progress... values) {
        if (otherDelegate != null) {
            otherDelegate.onProgressUpdate_TaskDelegate(taskId, values);
        }
        super.onProgressUpdate(values);
    }

    protected enum TaskStateEnum {
        NORMAL_STATE, SUCCESS_STATE, FAILD_STATE;
    }

    protected TaskStateEnum state = TaskStateEnum.NORMAL_STATE;


}


