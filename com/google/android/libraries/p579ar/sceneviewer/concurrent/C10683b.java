package com.google.android.libraries.p579ar.sceneviewer.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import p3186j$.util.function.BiConsumer;

/* renamed from: com.google.android.libraries.ar.sceneviewer.concurrent.b */
/* compiled from: PG */
final class C10683b implements Callable {

    /* renamed from: a */
    final /* synthetic */ BiConsumer f35610a;

    /* renamed from: b */
    final /* synthetic */ CompletionStage f35611b;

    /* renamed from: c */
    final /* synthetic */ CompletableFuture f35612c;

    public C10683b(CompletableFuture completableFuture, BiConsumer biConsumer, CompletionStage completionStage) {
        this.f35612c = completableFuture;
        this.f35610a = biConsumer;
        this.f35611b = completionStage;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        try {
            this.f35610a.accept(this.f35612c.get(), this.f35611b.toCompletableFuture().get());
            return null;
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
