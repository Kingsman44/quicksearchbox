package com.google.android.libraries.performance.primes.metrics.crash;

import com.google.common.base.C58838bb;

/* renamed from: com.google.android.libraries.performance.primes.metrics.crash.c */
/* compiled from: PG */
public abstract class C31355c {
    /* renamed from: a */
    public abstract C31356d mo37045a();

    /* renamed from: b */
    public final C31356d mo37067b() {
        C31356d a = mo37045a();
        float c = a.mo37060c();
        boolean z = false;
        if (c > 0.0f && c <= 100.0f) {
            z = true;
        }
        C58838bb.m90869d(z, "StartupSamplePercentage should be a floating number > 0 and <= 100.");
        return a;
    }
}
