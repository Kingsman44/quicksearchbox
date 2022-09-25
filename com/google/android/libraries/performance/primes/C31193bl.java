package com.google.android.libraries.performance.primes;

import android.os.Process;

/* renamed from: com.google.android.libraries.performance.primes.bl */
/* compiled from: PG */
public final /* synthetic */ class C31193bl implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C31194bm f84097a;

    /* renamed from: b */
    public final /* synthetic */ Runnable f84098b;

    public /* synthetic */ C31193bl(C31194bm bmVar, Runnable runnable) {
        this.f84097a = bmVar;
        this.f84098b = runnable;
    }

    public final void run() {
        C31194bm bmVar = this.f84097a;
        Runnable runnable = this.f84098b;
        int i = bmVar.f84099a;
        if (i != 0) {
            Process.setThreadPriority(i);
        }
        runnable.run();
    }
}
