package com.google.common.android.p4521a;

import android.os.SystemClock;
import com.google.common.base.C58889cz;

/* renamed from: com.google.common.android.a.c */
/* compiled from: PG */
public final class C58274c {

    /* renamed from: a */
    public static final C58889cz f155808a;

    static {
        C58889cz czVar;
        try {
            SystemClock.elapsedRealtimeNanos();
            czVar = new C58272a();
        } catch (Throwable unused) {
            SystemClock.elapsedRealtime();
            czVar = new C58273b();
        }
        f155808a = czVar;
    }
}
