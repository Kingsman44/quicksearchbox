package com.google.android.libraries.performance.primes.metrics.p2416j;

import com.google.common.base.C58838bb;

/* renamed from: com.google.android.libraries.performance.primes.metrics.j.q */
/* compiled from: PG */
public abstract class C31549q {
    /* renamed from: a */
    public abstract C31550r mo37230a();

    /* renamed from: b */
    public final C31550r mo37242b() {
        C31550r a = mo37230a();
        boolean z = false;
        if (a.mo37231c() >= 0.0f && a.mo37231c() <= 1.0f) {
            z = true;
        }
        C58838bb.m90884s(z, "Probability shall be between 0 and 1.");
        return a;
    }
}
