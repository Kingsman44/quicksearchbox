package com.google.android.libraries.lens.view.p2113h.p2126h.p2127a;

import android.os.Process;

/* renamed from: com.google.android.libraries.lens.view.h.h.a.z */
/* compiled from: PG */
public final /* synthetic */ class C26883z implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Runnable f73290a;

    public /* synthetic */ C26883z(Runnable runnable) {
        this.f73290a = runnable;
    }

    public final void run() {
        Runnable runnable = this.f73290a;
        Thread.currentThread().setName("lens-opengl-thread");
        Process.setThreadPriority(-2);
        runnable.run();
    }
}
