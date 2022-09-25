package org.chromium.base.task;

import android.view.Choreographer;

/* renamed from: org.chromium.base.task.c */
/* compiled from: PG */
final class C72397c implements C72403i {

    /* renamed from: a */
    private final Choreographer f192549a;

    public C72397c(Choreographer choreographer) {
        this.f192549a = choreographer;
    }

    /* renamed from: a */
    public final void mo63859a(Runnable runnable) {
        this.f192549a.postFrameCallbackDelayed(new C72396b(runnable), 0);
    }
}
