package com.google.android.libraries.p579ar.sceneviewer.concurrent;

/* renamed from: com.google.android.libraries.ar.sceneviewer.concurrent.CompletableFuture$$ExternalSyntheticLambda0 */
/* compiled from: PG */
public final /* synthetic */ class CompletableFuture$$ExternalSyntheticLambda0 implements Runnable {
    public /* synthetic */ Runnable f$0;
    public /* synthetic */ CompletableFuture f$1;

    public /* synthetic */ CompletableFuture$$ExternalSyntheticLambda0(Runnable runnable, CompletableFuture completableFuture) {
        this.f$0 = runnable;
        this.f$1 = completableFuture;
    }

    public final void run() {
        CompletableFuture.lambda$runAsync$1(this.f$0, this.f$1);
    }
}
