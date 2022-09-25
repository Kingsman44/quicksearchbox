package com.android.p271h.p272a;

import android.view.Choreographer;

/* renamed from: com.android.h.a.g */
/* compiled from: PG */
final class C5159g implements Choreographer.FrameCallback {

    /* renamed from: a */
    final /* synthetic */ C5162j f16403a;

    public C5159g(C5162j jVar) {
        this.f16403a = jVar;
    }

    public final void doFrame(long j) {
        C5162j jVar = this.f16403a;
        jVar.mInvalPending = false;
        jVar.mGLSurfaceView.requestRender();
    }
}
