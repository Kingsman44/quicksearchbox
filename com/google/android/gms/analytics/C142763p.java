package com.google.android.gms.analytics;

import android.os.Process;

/* renamed from: com.google.android.gms.analytics.p */
/* compiled from: PG */
final class C142763p extends Thread {
    public C142763p(Runnable runnable, String str) {
        super(runnable, str);
    }

    public final void run() {
        Process.setThreadPriority(10);
        super.run();
    }
}
