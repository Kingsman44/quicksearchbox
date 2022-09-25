package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.asr */
/* compiled from: PG */
public final class asr {
    static {
        Math.log(2.0d);
    }

    /* renamed from: a */
    public static boolean m19541a(double d) {
        if (Math.copySign(1.0d - d, 1.0d) <= 0.1d || d == 1.0d) {
            return true;
        }
        if (!Double.isNaN(1.0d) || !Double.isNaN(d)) {
            return false;
        }
        return true;
    }
}
