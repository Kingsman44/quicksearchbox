package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C143839k;

/* renamed from: com.google.android.gms.common.api.internal.bi */
/* compiled from: PG */
public final class C143761bi implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C143762bj f389745a;

    public C143761bi(C143762bj bjVar) {
        this.f389745a = bjVar;
    }

    public final void run() {
        C143839k kVar = this.f389745a.f389746a.f389748b;
        kVar.mo117783f(String.valueOf(kVar.getClass().getName()).concat(" disconnecting because it was signed out."));
    }
}
