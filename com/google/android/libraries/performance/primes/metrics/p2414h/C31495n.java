package com.google.android.libraries.performance.primes.metrics.p2414h;

import android.os.SystemClock;
import com.google.android.libraries.p1623at.p1632e.C19559g;

/* renamed from: com.google.android.libraries.performance.primes.metrics.h.n */
/* compiled from: PG */
public final /* synthetic */ class C31495n implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C31493m f84801a;

    public /* synthetic */ C31495n(C31493m mVar) {
        this.f84801a = mVar;
    }

    public final void run() {
        C31493m mVar = this.f84801a;
        C19559g.m37304c();
        if (mVar.f84798b.f84824i == 0) {
            mVar.f84798b.f84824i = SystemClock.elapsedRealtime();
            mVar.f84798b.f84827l.f84814j = true;
        }
    }
}
