package com.google.android.libraries.performance.primes.metrics.p2411f;

import com.google.common.base.C58838bb;

/* renamed from: com.google.android.libraries.performance.primes.metrics.f.d */
/* compiled from: PG */
public abstract class C31445d {
    /* renamed from: a */
    public abstract C31446e mo37132a();

    /* renamed from: b */
    public abstract void mo37133b(boolean z);

    /* renamed from: c */
    public final C31446e mo37142c() {
        C31446e a = mo37132a();
        boolean z = true;
        if (a.mo37135d() != null && a.mo37138f()) {
            z = false;
        }
        C58838bb.m90869d(z, "only one of auto url auto sanitization and custom url sanitizer can be enabled.");
        return a;
    }
}
