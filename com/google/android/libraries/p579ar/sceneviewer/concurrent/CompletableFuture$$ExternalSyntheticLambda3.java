package com.google.android.libraries.p579ar.sceneviewer.concurrent;

import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.libraries.ar.sceneviewer.concurrent.CompletableFuture$$ExternalSyntheticLambda3 */
/* compiled from: PG */
public final /* synthetic */ class CompletableFuture$$ExternalSyntheticLambda3 implements Runnable {
    public /* synthetic */ CompletableFuture f$0;
    public /* synthetic */ Supplier f$1;

    public /* synthetic */ CompletableFuture$$ExternalSyntheticLambda3(CompletableFuture completableFuture, Supplier supplier) {
        this.f$0 = completableFuture;
        this.f$1 = supplier;
    }

    public final void run() {
        CompletableFuture.lambda$supplyAsync$0(this.f$0, this.f$1);
    }
}
