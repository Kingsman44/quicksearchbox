package com.bumptech.glide.p291h;

import android.os.SystemClock;

/* renamed from: com.bumptech.glide.h.l */
/* compiled from: PG */
public final class C5625l {

    /* renamed from: a */
    private static final double f16963a = (1.0d / Math.pow(10.0d, 6.0d));

    /* renamed from: a */
    public static double m14592a(long j) {
        double elapsedRealtimeNanos = (double) (SystemClock.elapsedRealtimeNanos() - j);
        double d = f16963a;
        Double.isNaN(elapsedRealtimeNanos);
        return elapsedRealtimeNanos * d;
    }

    /* renamed from: b */
    public static long m14593b() {
        return SystemClock.elapsedRealtimeNanos();
    }
}
