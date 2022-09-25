package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C143849u;
import com.google.android.gms.common.api.C143850v;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.signin.C145993e;

/* renamed from: com.google.android.gms.common.api.internal.ar */
/* compiled from: PG */
final class C143743ar implements C143849u, C143850v {

    /* renamed from: a */
    final /* synthetic */ C143745at f389671a;

    public C143743ar(C143745at atVar) {
        this.f389671a = atVar;
    }

    /* renamed from: d */
    public final void mo26993d(ConnectionResult connectionResult) {
        this.f389671a.f389674b.lock();
        try {
            if (this.f389671a.mo119155o(connectionResult)) {
                this.f389671a.mo119149i();
                this.f389671a.mo119152l();
            } else {
                this.f389671a.mo119150j(connectionResult);
            }
        } finally {
            this.f389671a.f389674b.unlock();
        }
    }

    /* renamed from: kq */
    public final void mo26991kq(Bundle bundle) {
        C143919bh.m233958a(this.f389671a.f389682j);
        C145993e eVar = this.f389671a.f389677e;
        C143919bh.m233958a(eVar);
        eVar.mo122464g(new C143742aq(this.f389671a));
    }

    /* renamed from: kr */
    public final void mo26992kr(int i) {
    }
}
