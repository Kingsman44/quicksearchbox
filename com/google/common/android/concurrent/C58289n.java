package com.google.common.android.concurrent;

/* renamed from: com.google.common.android.concurrent.n */
/* compiled from: PG */
public final /* synthetic */ class C58289n implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C58281f f155833a;

    /* renamed from: b */
    public final /* synthetic */ ParcelableFuture f155834b;

    /* renamed from: c */
    public final /* synthetic */ Throwable f155835c;

    public /* synthetic */ C58289n(C58281f fVar, ParcelableFuture parcelableFuture, Throwable th) {
        this.f155833a = fVar;
        this.f155834b = parcelableFuture;
        this.f155835c = th;
    }

    public final void run() {
        C58281f fVar = this.f155833a;
        ParcelableFuture parcelableFuture = this.f155834b;
        fVar.mo29126a(parcelableFuture.f155816b, this.f155835c);
    }
}
