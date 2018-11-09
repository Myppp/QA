package ru.aisubp.azk;

import java.text.DateFormat;
import java.util.Calendar;

public class SimpleDateFormat {
    String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
}
