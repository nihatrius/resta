package com.trius.resta.util;

import org.apache.commons.lang3.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtils extends org.apache.commons.lang3.time.DateUtils {

    public static String TR_SIMPLE_PATTERN = "dd.MM.YYYY";


    public static Date currentDate() {
        return Calendar.getInstance().getTime();
    }

    public static String dateToString(Date dt, String pattern) {
        if (StringUtils.isBlank(pattern))
            pattern = TR_SIMPLE_PATTERN;
        SimpleDateFormat df = new SimpleDateFormat(pattern);
        return df.format(dt);
    }

    public static Date stringToDate(String dateStr, String pattern) {
        if (StringUtils.isBlank(pattern))
            pattern = TR_SIMPLE_PATTERN;
        SimpleDateFormat df = new SimpleDateFormat(pattern);
        try {
            return df.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
            return currentDate();
        }
    }
}
