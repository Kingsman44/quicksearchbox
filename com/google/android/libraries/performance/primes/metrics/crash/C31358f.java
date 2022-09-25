package com.google.android.libraries.performance.primes.metrics.crash;

import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.libraries.performance.primes.metrics.crash.f */
/* compiled from: PG */
public final /* synthetic */ class C31358f implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C31360h f84423a;

    /* renamed from: b */
    public final /* synthetic */ AtomicInteger f84424b;

    /* renamed from: c */
    public final /* synthetic */ int f84425c;

    public /* synthetic */ C31358f(C31360h hVar, AtomicInteger atomicInteger, int i) {
        this.f84423a = hVar;
        this.f84424b = atomicInteger;
        this.f84425c = i;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C31360h hVar = this.f84423a;
        AtomicInteger atomicInteger = this.f84424b;
        int i = this.f84425c;
        if (atomicInteger.getAndDecrement() <= 0) {
            return C60866ct.f164955a;
        }
        return hVar.mo37072h(i, (C31356d) hVar.f84430c.mo27525b());
    }
}
