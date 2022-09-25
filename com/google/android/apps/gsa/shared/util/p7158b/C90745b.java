package com.google.android.apps.gsa.shared.util.p7158b;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.shared.util.b.b */
/* compiled from: PG */
public final class C90745b {

    /* renamed from: a */
    private static SimpleDateFormat f253820a;

    /* renamed from: a */
    public static synchronized String m148220a(Date date) {
        String format;
        synchronized (C90745b.class) {
            if (f253820a == null) {
                f253820a = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", Locale.US);
            }
            format = f253820a.format(date);
        }
        return format;
    }
}
