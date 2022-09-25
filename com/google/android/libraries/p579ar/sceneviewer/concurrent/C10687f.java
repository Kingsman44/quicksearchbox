package com.google.android.libraries.p579ar.sceneviewer.concurrent;

import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60856cj;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.ar.sceneviewer.concurrent.f */
/* compiled from: PG */
final class C10687f implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ Function f35618a;

    /* renamed from: b */
    final /* synthetic */ CompletableFuture f35619b;

    public C10687f(Function function, CompletableFuture completableFuture) {
        this.f35618a = function;
        this.f35619b = completableFuture;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        this.f35619b.completeExceptionally(th);
    }

    /* renamed from: gm */
    public final void mo17911gm(Object obj) {
        C60856cj.m92911t(((CompletionStage) this.f35618a.apply(obj)).toCompletableFuture().listenableFuture, new C10686e(this), C60826bg.f164896a);
    }
}
