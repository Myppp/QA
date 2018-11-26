package ru.aisubp.azk;

import java.text.DateFormat;
import java.util.Date;

public class SimpleDateFormat {

    public static void main(String[] args) {

        Date now = new Date();
        String date=DateFormat.getDateTimeInstance().format(now);
        System.out.println(date);
    }
}