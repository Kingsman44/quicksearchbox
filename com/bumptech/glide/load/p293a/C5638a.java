package com.bumptech.glide.load.p293a;

import android.os.Process;

/* renamed from: com.bumptech.glide.load.a.a */
/* compiled from: PG */
final class C5638a implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Runnable f17010a;

    public C5638a(Runnable runnable) {
        this.f17010a = runnable;
    }

    public final void run() {
        Process.setThreadPriority(10);
        this.f17010a.run();
    }
}
