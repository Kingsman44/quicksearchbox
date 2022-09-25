package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.google.android.material.datepicker.i */
/* compiled from: PG */
final class C44636i {
    /* renamed from: a */
    static String m79094a(long j, Locale locale) {
        return C44625au.m79081b("yMMMd", locale).format(new Date(j));
    }

    /* renamed from: b */
    public static boolean m79095b(long j) {
        Calendar f = C44625au.m79085f();
        Calendar g = C44625au.m79086g((Calendar) null);
        g.setTimeInMillis(j);
        if (f.get(1) == g.get(1)) {
            return true;
        }
        return false;
    }
}
