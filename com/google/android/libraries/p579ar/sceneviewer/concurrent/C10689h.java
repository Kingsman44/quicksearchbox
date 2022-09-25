package com.google.android.libraries.p579ar.sceneviewer.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import p3186j$.util.function.BiFunction;

/* renamed from: com.google.android.libraries.ar.sceneviewer.concurrent.h */
/* compiled from: PG */
final class C10689h implements Callable {

    /* renamed from: a */
    final /* synthetic */ BiFunction f35621a;

    /* renamed from: b */
    final /* synthetic */ CompletionStage f35622b;

    /* renamed from: c */
    final /* synthetic */ CompletableFuture f35623c;

    public C10689h(CompletableFuture completableFuture, BiFunction biFunction, CompletionStage completionStage) {
        this.f35623c = completableFuture;
        this.f35621a = biFunction;
        this.f35622b = completionStage;
    }

    public final Object call() {
        try {
            return this.f35621a.apply(this.f35623c.listenableFuture.get(), this.f35622b.toCompletableFuture().get());
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }
}
