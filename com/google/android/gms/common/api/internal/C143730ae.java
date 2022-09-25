package com.google.android.gms.common.api.internal;

import androidx.p060c.C0979i;
import com.google.android.gms.common.C143875g;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: com.google.android.gms.common.api.internal.ae */
/* compiled from: PG */
public final class C143730ae extends C143829r {

    /* renamed from: e */
    public final C0979i f389652e = new C0979i(0);

    /* renamed from: g */
    private final C143767bo f389653g;

    public C143730ae(C143777by byVar, C143767bo boVar, C143875g gVar) {
        super(byVar, gVar);
        this.f389653g = boVar;
        this.f389645f.mo119219b(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo119126e(ConnectionResult connectionResult, int i) {
        this.f389653g.mo119210f(connectionResult, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo119127f() {
        this.f389653g.mo119211g();
    }

    /* renamed from: h */
    public final void mo119118h() {
        mo119128k();
    }

    /* renamed from: i */
    public final void mo119119i() {
        this.f389893a = true;
        mo119128k();
    }

    /* renamed from: j */
    public final void mo119120j() {
        this.f389893a = false;
        C143767bo boVar = this.f389653g;
        synchronized (C143767bo.f389772c) {
            if (boVar.f389782l == this) {
                boVar.f389782l = null;
                boVar.f389783m.clear();
            }
        }
    }

    /* renamed from: k */
    public final void mo119128k() {
        if (!this.f389652e.isEmpty()) {
            this.f389653g.mo119212h(this);
        }
    }
}
