package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C143841m;
import com.google.android.gms.common.api.C143849u;
import com.google.android.gms.common.api.C143850v;
import com.google.android.gms.common.internal.C143919bh;

/* renamed from: com.google.android.gms.common.api.internal.v */
/* compiled from: PG */
public final class C143833v implements C143849u, C143850v {

    /* renamed from: a */
    public final C143841m f389898a;

    /* renamed from: b */
    public C143834w f389899b;

    /* renamed from: c */
    private final boolean f389900c;

    public C143833v(C143841m mVar, boolean z) {
        this.f389898a = mVar;
        this.f389900c = z;
    }

    /* renamed from: a */
    private final C143834w m233764a() {
        C143919bh.m233971n(this.f389899b, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        return this.f389899b;
    }

    /* renamed from: d */
    public final void mo26993d(ConnectionResult connectionResult) {
        C143834w a = m233764a();
        C143841m mVar = this.f389898a;
        boolean z = this.f389900c;
        C143755bc bcVar = (C143755bc) a;
        bcVar.f389724a.lock();
        try {
            ((C143755bc) a).f389734k.mo119140e(connectionResult, mVar, z);
        } finally {
            bcVar.f389724a.unlock();
        }
    }

    /* renamed from: kq */
    public final void mo26991kq(Bundle bundle) {
        m233764a().mo26991kq(bundle);
    }

    /* renamed from: kr */
    public final void mo26992kr(int i) {
        m233764a().mo26992kr(i);
    }
}
