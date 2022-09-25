package org.chromium.base;

import android.os.StrictMode;
import java.util.TimeZone;

/* compiled from: PG */
class TimezoneUtils {
    private TimezoneUtils() {
    }

    private static String getDefaultTimeZoneId() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        String id = TimeZone.getDefault().getID();
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        return id;
    }
}
