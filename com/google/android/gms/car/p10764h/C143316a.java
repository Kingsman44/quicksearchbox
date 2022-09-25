package com.google.android.gms.car.p10764h;

import android.util.Log;
import java.util.Locale;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.car.h.a */
/* compiled from: PG */
public final class C143316a {
    static {
        new ConcurrentHashMap();
    }

    /* renamed from: a */
    public static void m232511a(String str, Throwable th, String str2) {
        m232514d(3, str, th, str2, new Object[0]);
    }

    /* renamed from: b */
    public static void m232512b(String str, Throwable th, String str2) {
        m232514d(6, str, th, str2, new Object[0]);
    }

    /* renamed from: c */
    public static void m232513c(String str, Throwable th, String str2) {
        m232514d(4, str, th, str2, new Object[0]);
    }

    /* renamed from: d */
    public static void m232514d(int i, String str, Throwable th, String str2, Object... objArr) {
        if (objArr.length != 0) {
            str2 = String.format(Locale.US, str2, objArr);
        }
        if (i == 2) {
            Log.v(str, str2, th);
        } else if (i == 3) {
            Log.d(str, str2, th);
        } else if (i == 4) {
            Log.i(str, str2, th);
        } else if (i != 5) {
            Log.e(str, str2, th);
        } else {
            Log.w(str, str2, th);
        }
    }

    /* renamed from: e */
    public static boolean m232515e(String str, int i) {
        return Log.isLoggable(str, i);
    }

    /* renamed from: f */
    public static void m232516f(String str, String str2) {
        m232514d(2, str, (Throwable) null, str2, new Object[0]);
    }
}
