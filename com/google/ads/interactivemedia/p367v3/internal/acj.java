package com.google.ads.interactivemedia.p367v3.internal;

import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.acj */
/* compiled from: PG */
public final class acj {

    /* renamed from: a */
    private final int f20311a = -1;

    /* renamed from: b */
    public static final long m18242b(acr acr) {
        IOException iOException = acr.f20323a;
        if (!(iOException instanceof aco)) {
            return -9223372036854775807L;
        }
        int i = ((aco) iOException).f20320a;
        if (i == 403 || i == 404 || i == 410 || i == 416 || i == 500 || i == 503) {
            return 60000;
        }
        return -9223372036854775807L;
    }

    /* renamed from: c */
    public static final long m18243c(acr acr) {
        IOException iOException = acr.f20323a;
        if ((iOException instanceof C6886dt) || (iOException instanceof FileNotFoundException) || (iOException instanceof acz)) {
            return -9223372036854775807L;
        }
        return (long) Math.min((acr.f20324b - 1) * 1000, 5000);
    }

    /* renamed from: a */
    public final int mo14451a(int i) {
        return i == 7 ? 6 : 3;
    }
}
