package com.google.common.android.concurrent;

/* renamed from: com.google.common.android.concurrent.q */
/* compiled from: PG */
public final /* synthetic */ class C58292q implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C58295t f155842a;

    /* renamed from: b */
    public final /* synthetic */ ParcelableFuture f155843b;

    /* renamed from: c */
    public final /* synthetic */ Object f155844c;

    public /* synthetic */ C58292q(C58295t tVar, ParcelableFuture parcelableFuture, Object obj) {
        this.f155842a = tVar;
        this.f155843b = parcelableFuture;
        this.f155844c = obj;
    }

    public final void run() {
        C58295t tVar = this.f155842a;
        ParcelableFuture parcelableFuture = this.f155843b;
        tVar.mo54860a(new C58286k((C58281f) tVar.f155847a.mo3726e(parcelableFuture.f155815a), parcelableFuture, this.f155844c));
    }
}
