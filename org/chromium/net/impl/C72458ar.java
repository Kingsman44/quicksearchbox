package org.chromium.net.impl;

import android.os.Process;

/* renamed from: org.chromium.net.impl.ar */
/* compiled from: PG */
final class C72458ar implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Runnable f192813a;

    /* renamed from: b */
    final /* synthetic */ C72459as f192814b;

    public C72458ar(C72459as asVar, Runnable runnable) {
        this.f192814b = asVar;
        this.f192813a = runnable;
    }

    public final void run() {
        Thread.currentThread().setName("JavaCronetEngine");
        Process.setThreadPriority(this.f192814b.f192815a);
        this.f192813a.run();
    }
}
