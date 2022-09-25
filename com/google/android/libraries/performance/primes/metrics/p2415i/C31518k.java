package com.google.android.libraries.performance.primes.metrics.p2415i;

import com.google.common.base.C58838bb;

/* renamed from: com.google.android.libraries.performance.primes.metrics.i.k */
/* compiled from: PG */
public abstract class C31518k {
    /* renamed from: a */
    public abstract C31519l mo37200a();

    /* renamed from: b */
    public final C31519l mo37213b() {
        C31519l a = mo37200a();
        boolean z = true;
        C58838bb.m90884s(a.mo36979a() >= 0, "Rate limit per second must be >= 0");
        if (a.mo37201c() <= 0.0f || a.mo37201c() > 1.0f) {
            z = false;
        }
        C58838bb.m90884s(z, "Sampling Probability shall be > 0 and <= 1");
        return a;
    }
}
