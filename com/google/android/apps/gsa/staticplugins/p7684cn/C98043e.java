package com.google.android.apps.gsa.staticplugins.p7684cn;

import com.google.android.libraries.performance.primes.C31167ax;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.gsa.staticplugins.cn.e */
/* compiled from: PG */
public final class C98043e {

    /* renamed from: a */
    public final C31167ax f273769a;

    /* renamed from: b */
    public final AtomicBoolean f273770b = new AtomicBoolean(false);

    public C98043e(C31167ax axVar) {
        this.f273769a = axVar;
    }

    /* renamed from: a */
    public final void mo90897a() {
        if (!this.f273770b.getAndSet(true)) {
            this.f273769a.f84035a.mo36904i();
        }
    }
}
