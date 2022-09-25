package com.google.android.gms.common.util.p10784a;

import android.os.Process;

/* renamed from: com.google.android.gms.common.util.a.d */
/* compiled from: PG */
final class C144001d implements Runnable {

    /* renamed from: a */
    private final Runnable f390243a;

    public C144001d(Runnable runnable) {
        this.f390243a = runnable;
    }

    public final void run() {
        Process.setThreadPriority(0);
        this.f390243a.run();
    }
}
