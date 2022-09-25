package org.chromium.base.task;

import android.os.Process;

/* renamed from: org.chromium.base.task.d */
/* compiled from: PG */
public final /* synthetic */ class C72398d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Runnable f192550a;

    public /* synthetic */ C72398d(Runnable runnable) {
        this.f192550a = runnable;
    }

    public final void run() {
        Runnable runnable = this.f192550a;
        Process.setThreadPriority(10);
        runnable.run();
    }
}
