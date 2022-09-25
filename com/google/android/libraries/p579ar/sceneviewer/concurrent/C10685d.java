package com.google.android.libraries.p579ar.sceneviewer.concurrent;

import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.ar.sceneviewer.concurrent.d */
/* compiled from: PG */
final class C10685d implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ Runnable f35615a;

    /* renamed from: b */
    final /* synthetic */ CompletableFuture f35616b;

    public C10685d(Runnable runnable, CompletableFuture completableFuture) {
        this.f35615a = runnable;
        this.f35616b = completableFuture;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        this.f35616b.completeExceptionally(th);
    }

    /* renamed from: gm */
    public final void mo17911gm(Object obj) {
        try {
            this.f35615a.run();
            this.f35616b.complete((Object) null);
        } catch (Exception e) {
            this.f35616b.completeExceptionally(e);
        }
    }
}
