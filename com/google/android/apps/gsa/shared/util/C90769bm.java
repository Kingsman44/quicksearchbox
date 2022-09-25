package com.google.android.apps.gsa.shared.util;

import android.text.format.Time;
import java.util.Calendar;

/* renamed from: com.google.android.apps.gsa.shared.util.bm */
/* compiled from: PG */
public final class C90769bm {
    /* renamed from: a */
    public static boolean m148269a(long j) {
        return System.currentTimeMillis() > j;
    }

    /* renamed from: b */
    public static boolean m148270b(long j, long j2) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        Calendar instance2 = Calendar.getInstance();
        instance2.setTimeInMillis(j2);
        if (instance.get(1) == instance2.get(1) && instance.get(6) == instance2.get(6)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m148271c(long j, long j2) {
        Time time = new Time();
        time.set(j);
        int julianDay = Time.getJulianDay(j, time.gmtoff);
        time.set(j2);
        return julianDay - Time.getJulianDay(j2, time.gmtoff) == 1;
    }
}
