package com.bumptech.glide.load.p293a.p296c;

import android.os.Process;

/* renamed from: com.bumptech.glide.load.a.c.b */
/* compiled from: PG */
final class C5707b extends Thread {
    public C5707b(Runnable runnable) {
        super(runnable);
    }

    public final void run() {
        Process.setThreadPriority(9);
        super.run();
    }
}
