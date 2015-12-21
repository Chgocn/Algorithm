package io.chgocn.demo.algorithm.utils;

/**
 * time helper to format.
 * Created by chgocn(chgocn@gmail.com).
 */
public class DateTimeHelper {

    //public static String timeFormat(long currentMillis) {
    public static String timeFormat(int hour,int minute,int second) {
        //int minute = (int) ((currentMillis / 60000) % 60);
        //int second = (int) ((currentMillis % 60000) / 1000);
        //int hour = (int) (currentMillis / 3600000);
        StringBuilder stringBuilder = new StringBuilder();
        if (hour > 0) {
            if (hour < 10) {
                stringBuilder.append("<big><b>"+hour+"</big></b>");
            } else {
                stringBuilder.append("<big><b>" + String.valueOf(hour) + "</big></b>");
            }
            stringBuilder.append("<small>时</small>");
        }
        if(!("".equals(stringBuilder.toString()))){
            if (minute < 10) {
                stringBuilder.append("<big><b>0" + minute + "</big></b>");
            }
        }else {
            stringBuilder.append("<big><b>" + String.valueOf(minute) + "</big></b>");
        }
        stringBuilder.append("<small>分</small>");
        if(!stringBuilder.toString().contains("<small>时</small>")){
            if (second < 10) {
                stringBuilder.append("<big><b>0" + second + "</big></b>");
            } else {
                stringBuilder.append("<big><b>" + String.valueOf(second) + "</big></b>");
            }
            stringBuilder.append("<small>秒</small>");
        }

        return stringBuilder.toString();
    }
}
