package com.google.apps.tiktok.concurrent.futuresmixin;

import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.apps.tiktok.concurrent.futuresmixin.q */
/* compiled from: PG */
final class C46451q implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ ParcelableFuture f121553a;

    public C46451q(ParcelableFuture parcelableFuture) {
        this.f121553a = parcelableFuture;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        this.f121553a.mo50433b(th);
    }

    /* renamed from: gm */
    public final void mo17911gm(Object obj) {
        ParcelableFuture parcelableFuture = this.f121553a;
        parcelableFuture.f121532e = obj;
        parcelableFuture.f121529b = true;
        parcelableFuture.mo50432a();
    }
}
