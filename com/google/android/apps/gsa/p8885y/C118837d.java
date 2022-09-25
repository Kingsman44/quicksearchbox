package com.google.android.apps.gsa.p8885y;

import com.google.android.apps.gsa.p8885y.p8886a.C118831d;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.y.d */
/* compiled from: PG */
public final class C118837d {

    /* renamed from: a */
    private static final long f331453a = TimeUnit.DAYS.toNanos(30);

    /* renamed from: a */
    public static boolean m197247a(long j) {
        return j >= 0 && j < f331453a;
    }

    /* renamed from: b */
    public static C118836c m197248b(C118831d dVar) {
        return new C118836c(dVar, TimeUnit.MILLISECONDS);
    }

    /* renamed from: c */
    public static void m197249c(C118831d dVar, long j) {
        long a = dVar.mo104019a() - j;
        if (m197247a(a)) {
            dVar.mo104025g(TimeUnit.NANOSECONDS.toMicros(a));
        }
    }

    /* renamed from: d */
    public static void m197250d(C118831d dVar, long j) {
        long a = dVar.mo104019a() - j;
        if (m197247a(a)) {
            dVar.mo104025g(TimeUnit.NANOSECONDS.toMillis(a));
        }
    }

    /* renamed from: e */
    public static void m197251e(C118831d dVar, long j) {
        long a = dVar.mo104019a() - j;
        if (m197247a(a)) {
            dVar.mo104025g(TimeUnit.NANOSECONDS.toSeconds(a));
        }
    }
}
