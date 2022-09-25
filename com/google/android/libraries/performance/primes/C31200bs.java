package com.google.android.libraries.performance.primes;

import com.google.common.base.C58838bb;

/* renamed from: com.google.android.libraries.performance.primes.bs */
/* compiled from: PG */
public abstract class C31200bs {
    /* renamed from: a */
    public abstract C31201bt mo36931a();

    /* renamed from: b */
    public final C31201bt mo36932b() {
        C31201bt a = mo36931a();
        boolean z = false;
        if (a.mo36933a() > 0 && a.mo36933a() <= 2) {
            z = true;
        }
        C58838bb.m90885t(z, "Thread pool size must be less than or equal to %s", 2);
        return a;
    }
}
