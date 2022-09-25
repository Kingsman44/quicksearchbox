package com.google.android.libraries.p1730f.p1731a;

import android.os.SystemClock;

/* renamed from: com.google.android.libraries.f.a.d */
/* compiled from: PG */
public final class C21374d {

    /* renamed from: a */
    private static final boolean f59767a;

    static {
        boolean z;
        try {
            SystemClock.elapsedRealtimeNanos();
            z = true;
        } catch (Throwable unused) {
            z = false;
        }
        f59767a = z;
    }

    /* renamed from: a */
    public static long m40426a() {
        if (f59767a) {
            return SystemClock.elapsedRealtimeNanos();
        }
        return SystemClock.elapsedRealtime() * 1000000;
    }
}
