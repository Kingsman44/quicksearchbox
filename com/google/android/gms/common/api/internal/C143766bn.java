package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C143839k;
import com.google.android.gms.common.internal.C143899ao;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.internal.C143933h;
import java.util.Set;

/* renamed from: com.google.android.gms.common.api.internal.bn */
/* compiled from: PG */
final class C143766bn implements C143933h {

    /* renamed from: a */
    public final C143839k f389764a;

    /* renamed from: b */
    public final C143820i f389765b;

    /* renamed from: c */
    public Set f389766c = null;

    /* renamed from: d */
    public boolean f389767d = false;

    /* renamed from: e */
    final /* synthetic */ C143767bo f389768e;

    /* renamed from: f */
    public C143899ao f389769f = null;

    public C143766bn(C143767bo boVar, C143839k kVar, C143820i iVar) {
        this.f389768e = boVar;
        this.f389764a = kVar;
        this.f389765b = iVar;
    }

    /* renamed from: a */
    public final void mo119145a(ConnectionResult connectionResult) {
        this.f389768e.f389784n.post(new C143765bm(this, connectionResult));
    }

    /* renamed from: b */
    public final void mo119205b(ConnectionResult connectionResult) {
        C143763bk bkVar = (C143763bk) this.f389768e.f389781k.get(this.f389765b);
        if (bkVar != null) {
            C143919bh.m233962e(bkVar.f389756j.f389784n);
            C143839k kVar = bkVar.f389748b;
            String name = kVar.getClass().getName();
            String valueOf = String.valueOf(connectionResult);
            kVar.mo117783f("onSignInFailed for " + name + " with " + valueOf);
            bkVar.mo119195j(connectionResult, (Exception) null);
        }
    }

    /* renamed from: c */
    public final void mo119206c() {
        C143899ao aoVar;
        if (this.f389767d && (aoVar = this.f389769f) != null) {
            this.f389764a.mo119241E(aoVar, this.f389766c);
        }
    }
}
