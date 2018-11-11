package com.android.skylib.utils;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;

/**
 * User: shechaoqun
 * Email: shechaoqun@gmail.com
 * 2016/5/11
 */
public class ResourceHelper {

    private static String TAG = ResourceHelper.class.getSimpleName();
    /**
     * @param  context 上下文
     * @param drawableId  资源id
     * @return Drawable
     * 获取Drawable from /drawable  /mipmap
     */
    public static Drawable getDrawableFromId(Context context,int drawableId ) {
        //此方法与下方注释等同 解决版本低于21的问题
        return ContextCompat.getDrawable(context,drawableId);
        /*  if(VersionHelper.getSDKVersion() >= Build.VERSION_CODES.LOLLIPOP) {
            return context.getResources().getDrawable(drawableId,context.getTheme());
        }else {
            return context.getResources().getDrawable(drawableId);
        }*/
    }
}
