package com.google.android.libraries.p579ar.sceneviewer.concurrent;

import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.ar.sceneviewer.concurrent.e */
/* compiled from: PG */
final class C10686e implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C10687f f35617a;

    public C10686e(C10687f fVar) {
        this.f35617a = fVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        this.f35617a.f35619b.completeExceptionally(th);
    }

    /* renamed from: gm */
    public final void mo17911gm(Object obj) {
        this.f35617a.f35619b.complete(obj);
    }
}
