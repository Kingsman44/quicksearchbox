package com.google.android.libraries.performance.primes.metrics.p2414h;

import android.os.SystemClock;
import com.google.android.libraries.p1623at.p1632e.C19559g;

/* renamed from: com.google.android.libraries.performance.primes.metrics.h.o */
/* compiled from: PG */
public final /* synthetic */ class C31496o implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C31493m f84802a;

    public /* synthetic */ C31496o(C31493m mVar) {
        this.f84802a = mVar;
    }

    public final void run() {
        C31493m mVar = this.f84802a;
        C19559g.m37304c();
        if (mVar.f84798b.f84823h == 0) {
            mVar.f84798b.f84823h = SystemClock.elapsedRealtime();
            mVar.f84798b.f84827l.f84813i = true;
        }
    }
}
