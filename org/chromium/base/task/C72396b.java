package org.chromium.base.task;

import android.view.Choreographer;

/* renamed from: org.chromium.base.task.b */
/* compiled from: PG */
final class C72396b implements Choreographer.FrameCallback {

    /* renamed from: a */
    final /* synthetic */ Runnable f192548a;

    public C72396b(Runnable runnable) {
        this.f192548a = runnable;
    }

    public final void doFrame(long j) {
        this.f192548a.run();
    }
}
