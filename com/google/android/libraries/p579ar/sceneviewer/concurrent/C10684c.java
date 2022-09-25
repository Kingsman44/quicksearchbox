package com.google.android.libraries.p579ar.sceneviewer.concurrent;

import com.google.common.util.concurrent.C60845bz;
import p3186j$.util.function.BiFunction;

/* renamed from: com.google.android.libraries.ar.sceneviewer.concurrent.c */
/* compiled from: PG */
final class C10684c implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ CompletableFuture f35613a;

    /* renamed from: b */
    final /* synthetic */ BiFunction f35614b;

    public C10684c(CompletableFuture completableFuture, BiFunction biFunction) {
        this.f35613a = completableFuture;
        this.f35614b = biFunction;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        this.f35613a.complete(this.f35614b.apply(null, th));
    }

    /* renamed from: gm */
    public final void mo17911gm(Object obj) {
        this.f35613a.complete(this.f35614b.apply(obj, null));
    }
}
