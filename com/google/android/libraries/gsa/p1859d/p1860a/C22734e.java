package com.google.android.libraries.gsa.p1859d.p1860a;

import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import com.google.android.p445a.C8850c;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.libraries.gsa.d.a.e */
/* compiled from: PG */
public final class C22734e extends C22739j {

    /* renamed from: a */
    final /* synthetic */ Bundle f62553a;

    /* renamed from: b */
    final /* synthetic */ Bundle f62554b;

    /* renamed from: c */
    final /* synthetic */ C22744o f62555c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22734e(C22744o oVar, SettableFuture settableFuture, Bundle bundle, Bundle bundle2) {
        super(settableFuture);
        this.f62555c = oVar;
        this.f62553a = bundle;
        this.f62554b = bundle2;
    }

    /* renamed from: a */
    public final void mo27887a(C22730a aVar) {
        C22742m mVar = new C22742m(this.f62555c, this);
        Bundle bundle = this.f62553a;
        Bundle bundle2 = this.f62554b;
        Parcel gA = aVar.mo17260gA();
        C8850c.m23499h(gA, mVar);
        C8850c.m23497f(gA, bundle);
        C8850c.m23497f(gA, bundle2);
        aVar.mo17263hf(2, gA);
        Log.d("PomoConnector", "Request provider app to update content.");
    }
}
