package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: com.google.android.gms.common.internal.m */
/* compiled from: PG */
public final class C143938m extends C143928c {

    /* renamed from: g */
    final /* synthetic */ C143939n f390132g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C143938m(C143939n nVar, int i) {
        super(nVar, i, (Bundle) null);
        this.f390132g = nVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo119437a(ConnectionResult connectionResult) {
        this.f390132g.f390161y.mo119145a(connectionResult);
        this.f390132g.mo118926o(connectionResult);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo119439c() {
        this.f390132g.f390161y.mo119145a(ConnectionResult.f389572a);
        return true;
    }
}
