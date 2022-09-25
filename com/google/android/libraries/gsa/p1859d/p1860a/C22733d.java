package com.google.android.libraries.gsa.p1859d.p1860a;

import android.os.Parcel;
import android.util.Log;
import com.google.android.p445a.C8850c;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.libraries.gsa.d.a.d */
/* compiled from: PG */
public final class C22733d extends C22739j {

    /* renamed from: a */
    final /* synthetic */ C22744o f62552a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22733d(C22744o oVar, SettableFuture settableFuture) {
        super(settableFuture);
        this.f62552a = oVar;
    }

    /* renamed from: a */
    public final void mo27887a(C22730a aVar) {
        C22742m mVar = new C22742m(this.f62552a, this);
        Parcel gA = aVar.mo17260gA();
        C8850c.m23499h(gA, mVar);
        aVar.mo17263hf(1, gA);
        Log.d("PomoConnector", "Request provider app to send content.");
    }
}
