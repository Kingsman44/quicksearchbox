package com.google.android.libraries.lens.view.p2054ae;

import androidx.p104d.p105a.C2164c;

/* renamed from: com.google.android.libraries.lens.view.ae.n */
/* compiled from: PG */
public final /* synthetic */ class C25015n implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C25021t f68213a;

    /* renamed from: b */
    public final /* synthetic */ Throwable f68214b;

    public /* synthetic */ C25015n(C25021t tVar, Throwable th) {
        this.f68213a = tVar;
        this.f68214b = th;
    }

    public final void run() {
        C25021t tVar = this.f68213a;
        Throwable th = this.f68214b;
        for (C2164c d : tVar.f68227e.values()) {
            d.mo5439d(th);
        }
        tVar.f68227e.clear();
    }
}
