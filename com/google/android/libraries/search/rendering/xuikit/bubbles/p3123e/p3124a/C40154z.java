package com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.p3124a;

import android.view.Choreographer;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.bubbles.e.a.z */
/* compiled from: PG */
final class C40154z implements Choreographer.FrameCallback {

    /* renamed from: a */
    final /* synthetic */ C40129aa f105476a;

    /* renamed from: b */
    private final Runnable f105477b;

    public C40154z(C40129aa aaVar, Runnable runnable) {
        this.f105476a = aaVar;
        this.f105477b = runnable;
    }

    public final void doFrame(long j) {
        this.f105477b.run();
        this.f105476a.f105399a.remove(this);
    }
}
