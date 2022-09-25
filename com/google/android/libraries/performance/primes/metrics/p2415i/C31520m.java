package com.google.android.libraries.performance.primes.metrics.p2415i;

import android.os.SystemClock;
import com.google.common.base.C58880cq;

/* renamed from: com.google.android.libraries.performance.primes.metrics.i.m */
/* compiled from: PG */
public final class C31520m {

    /* renamed from: a */
    public static final C31520m f84871a = new C31520m(SystemClock.elapsedRealtime());

    /* renamed from: b */
    public final long f84872b;

    /* renamed from: c */
    public long f84873c;

    /* renamed from: d */
    boolean f84874d;

    /* renamed from: e */
    public int f84875e;

    private C31520m() {
        this(SystemClock.elapsedRealtime());
    }

    public C31520m(long j) {
        this.f84873c = -1;
        this.f84875e = 1;
        this.f84874d = false;
        this.f84872b = j;
    }

    /* renamed from: a */
    public static boolean m58749a(C31520m mVar) {
        return mVar == null || mVar == f84871a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo37214b(int i) {
        this.f84875e = i;
    }

    public C31520m(long j, long j2, int i) {
        this.f84873c = -1;
        this.f84875e = 1;
        this.f84874d = false;
        if (j2 >= j) {
            this.f84872b = j;
            this.f84873c = j2;
            this.f84875e = 1;
            return;
        }
        throw new IllegalArgumentException(C58880cq.m90965a("End time %s is before start time %s.", Long.valueOf(j2), Long.valueOf(j)));
    }
}
