package com.android.p256b;

import android.util.Log;

/* renamed from: com.android.b.t */
/* compiled from: PG */
public final class C5034t {
    static {
        m13835a("LogUtils");
    }

    /* renamed from: a */
    public static String m13835a(String str) {
        return str.length() > 23 ? str.substring(0, 23) : str;
    }

    /* renamed from: b */
    public static void m13836b(String str, Object... objArr) {
        String str2;
        if (Log.isLoggable(str, 6) || Log.isLoggable(str, 6)) {
            try {
                str2 = String.format("No text to put in to recurrence's end spinner.", objArr);
            } catch (Exception e) {
                str2 = "<" + e.getClass().getSimpleName() + "> No text to put in to recurrence's end spinner. <args: " + ">";
            }
            Log.e(str, str2);
        }
    }
}
