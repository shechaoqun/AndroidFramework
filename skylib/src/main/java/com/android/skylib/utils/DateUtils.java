package com.android.skylib.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 11/11/18
 * shechaoqun@gmail.com
 */

public class DateUtils {

    // 将后台传入的时间字符串，输出成希望的格式，比如2018-10-11 17:20:33     转换成  2018-10-11   或者17:20:33或者 2018.10.11

    public static  String dateFomart(String date){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date dateTemp =  format.parse(date);
            String date_temp = format.format(dateTemp);
            return date_temp;
        } catch (ParseException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String dateFomartHour(String date){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat format2 = new SimpleDateFormat("HH:mm:ss");
        try {
            Date dateTemp =  format.parse(date);
            String date_temp = format2.format(dateTemp);
            return date_temp;
        } catch (ParseException e) {
            e.printStackTrace();
            return "";
        }
    }
}
