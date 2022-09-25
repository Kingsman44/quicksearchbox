package com.google.android.libraries.performance.primes.p2402g;

import android.os.SystemClock;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.performance.primes.g.j */
/* compiled from: PG */
public final class C31247j {

    /* renamed from: a */
    private final Object f84167a = new Object();

    /* renamed from: b */
    private final C69464a f84168b;

    /* renamed from: c */
    private int f84169c = 0;

    /* renamed from: d */
    private long f84170d = 0;

    public C31247j(C69464a aVar) {
        this.f84168b = aVar;
    }

    /* renamed from: a */
    public static C31247j m58247a(int i) {
        return new C31247j(new C31246i(i));
    }

    /* renamed from: b */
    public final void mo36967b() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        synchronized (this.f84167a) {
            this.f84169c++;
            if (elapsedRealtime - this.f84170d > 1000) {
                this.f84169c = 0;
                this.f84170d = elapsedRealtime;
            }
        }
    }

    /* renamed from: c */
    public final boolean mo36968c() {
        int intValue = ((Integer) this.f84168b.mo17428b()).intValue();
        if (intValue == 0) {
            return true;
        }
        if (intValue != Integer.MAX_VALUE) {
            synchronized (this.f84167a) {
                if (this.f84169c >= intValue) {
                    long j = this.f84170d;
                    return SystemClock.elapsedRealtime() - j <= 1000;
                }
            }
        }
    }
}
