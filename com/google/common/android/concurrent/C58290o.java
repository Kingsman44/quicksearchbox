package com.google.common.android.concurrent;

/* renamed from: com.google.common.android.concurrent.o */
/* compiled from: PG */
public final /* synthetic */ class C58290o implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C58295t f155836a;

    /* renamed from: b */
    public final /* synthetic */ ParcelableFuture f155837b;

    /* renamed from: c */
    public final /* synthetic */ Throwable f155838c;

    public /* synthetic */ C58290o(C58295t tVar, ParcelableFuture parcelableFuture, Throwable th) {
        this.f155836a = tVar;
        this.f155837b = parcelableFuture;
        this.f155838c = th;
    }

    public final void run() {
        C58295t tVar = this.f155836a;
        ParcelableFuture parcelableFuture = this.f155837b;
        tVar.mo54860a(new C58289n((C58281f) tVar.f155847a.mo3726e(parcelableFuture.f155815a), parcelableFuture, this.f155838c));
    }
}
