package com.google.common.android.concurrent;

/* renamed from: com.google.common.android.concurrent.k */
/* compiled from: PG */
public final /* synthetic */ class C58286k implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C58281f f155828a;

    /* renamed from: b */
    public final /* synthetic */ ParcelableFuture f155829b;

    /* renamed from: c */
    public final /* synthetic */ Object f155830c;

    public /* synthetic */ C58286k(C58281f fVar, ParcelableFuture parcelableFuture, Object obj) {
        this.f155828a = fVar;
        this.f155829b = parcelableFuture;
        this.f155830c = obj;
    }

    public final void run() {
        C58281f fVar = this.f155828a;
        ParcelableFuture parcelableFuture = this.f155829b;
        fVar.mo29127b(parcelableFuture.f155816b, this.f155830c);
    }
}
