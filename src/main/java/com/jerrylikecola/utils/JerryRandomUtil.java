package com.jerrylikecola.utils;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Calendar;

/**
 * @author jerrylikecola(xiaxiang)
 * @date 2020-01-18
 * @description class for any random number
 */

public class JerryRandomUtil {

    /**
     * get a random with date time and 4 random number
     * @return
     */
    public static String getDateTimeAndRandomNumber(){
        return getDateTime() + RandomStringUtils.random(4, false, true);
    }

    /**
     * get a random with date time and 4 random
     * @return
     */
    public static String getDateTimeAndRandom(){
        return getDateTime() + RandomStringUtils.random(4, true, true);
    }

    /**
     * get a random
     * @param count
     * @return
     */
    public static String getRandom(int count){
        return RandomStringUtils.random(count,true,true);
    }

    /**
     * 恶搞计算下班时间
     * @return
     */
    public static String getTimeWhenOffTime() {
        int realHour = 18;
        int realMinute = 30;
        Calendar now = Calendar.getInstance();
        boolean isNotOffTime = now.get(Calendar.HOUR_OF_DAY)<realHour||
                            (now.get(Calendar.HOUR_OF_DAY)==realHour&&now.get(Calendar.MINUTE)<realMinute);
        if (isNotOffTime) {
            int second = 60 - now.get(Calendar.SECOND);
            if (now.get(Calendar.MINUTE) <= realMinute-1) {
                int minute = 29 - now.get(Calendar.MINUTE);
                int hour = 18 - now.get(Calendar.HOUR_OF_DAY);
                return hour+" h "+ + minute+" min "+ + second+" s ";
            } else {
                int minute = 89 - now.get(Calendar.MINUTE);
                int hour = 17 - now.get(Calendar.HOUR_OF_DAY);
                return hour+" h "+ + minute+" min "+ + second+" s ";
            }
        }else {
            return "已经下班啦";
        }
    }

    /**
     * get now date time
     * @return
     */
    public static String getDateTime(){
        Calendar now = Calendar.getInstance();

        String year = String.valueOf(now.get(Calendar.YEAR));
        String month = (now.get(Calendar.MONTH) + 1) < 10 ?
                "0" + (now.get(Calendar.MONTH) + 1) : String.valueOf(now.get(Calendar.MONTH) + 1);
        String date =
                now.get(Calendar.DATE) < 10 ? "0" + now.get(Calendar.DATE) : String.valueOf(now.get(Calendar.DATE));
        String hour = now.get(Calendar.HOUR_OF_DAY) < 10 ?
                "0" + now.get(Calendar.HOUR_OF_DAY) : String.valueOf(now.get(Calendar.HOUR_OF_DAY));
        String minute = now.get(Calendar.MINUTE) < 10 ?
                "0" + now.get(Calendar.MINUTE) : String.valueOf(now.get(Calendar.MINUTE));
        String second = now.get(Calendar.SECOND) < 10 ?
                "0" + now.get(Calendar.SECOND) : String.valueOf(now.get(Calendar.SECOND));
        return year + month + date + hour + minute + second;
    }
}
