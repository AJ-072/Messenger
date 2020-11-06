package com.aj.android.messenger.Others;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Common {
    public  static String getTime(long time){
        return SimpleDateFormat.getTimeInstance(DateFormat.SHORT).format(new Date(time));
    }
}
