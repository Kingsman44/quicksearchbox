package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C143839k;
import com.google.android.gms.common.api.C143841m;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C143919bh;

/* renamed from: com.google.android.gms.common.api.internal.ai */
/* compiled from: PG */
public final class C143734ai implements C143751az {

    /* renamed from: a */
    public final C143755bc f389656a;

    public C143734ai(C143755bc bcVar) {
        this.f389656a = bcVar;
    }

    /* renamed from: a */
    public final C143824m mo119136a(C143824m mVar) {
        try {
            this.f389656a.f389736m.f389709m.mo119261a(mVar);
            C143750ay ayVar = this.f389656a.f389736m;
            C143839k kVar = (C143839k) ayVar.f389703g.get(mVar.f389885b);
            C143919bh.m233971n(kVar, "Appropriate Api was not requested.");
            if (kVar.mo119248w() || !this.f389656a.f389730g.containsKey(mVar.f389885b)) {
                mVar.mo119275k(kVar);
            } else {
                mVar.mo119276l(new Status(1, 17, (String) null, (PendingIntent) null, (ConnectionResult) null));
            }
        } catch (DeadObjectException unused) {
            this.f389656a.mo119183j(new C143733ah(this, this));
        }
        return mVar;
    }

    /* renamed from: b */
    public final void mo119137b() {
    }

    /* renamed from: c */
    public final void mo119138c() {
    }

    /* renamed from: d */
    public final void mo119139d(Bundle bundle) {
    }

    /* renamed from: e */
    public final void mo119140e(ConnectionResult connectionResult, C143841m mVar, boolean z) {
    }

    /* renamed from: f */
    public final void mo119141f(int i) {
        this.f389656a.mo119180g((ConnectionResult) null);
        this.f389656a.f389737n.mo119167s(i);
    }

    /* renamed from: g */
    public final boolean mo119142g() {
        this.f389656a.mo119180g((ConnectionResult) null);
        return true;
    }

    /* renamed from: h */
    public final void mo119143h(C143824m mVar) {
        mo119136a(mVar);
    }
}
