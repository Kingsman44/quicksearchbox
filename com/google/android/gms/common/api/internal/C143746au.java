package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C143839k;
import com.google.android.gms.common.api.C143841m;
import java.util.Collections;

/* renamed from: com.google.android.gms.common.api.internal.au */
/* compiled from: PG */
public final class C143746au implements C143751az {

    /* renamed from: a */
    private final C143755bc f389694a;

    public C143746au(C143755bc bcVar) {
        this.f389694a = bcVar;
    }

    /* renamed from: a */
    public final C143824m mo119136a(C143824m mVar) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    /* renamed from: b */
    public final void mo119137b() {
        for (C143839k n : this.f389694a.f389729f.values()) {
            n.mo118925n();
        }
        this.f389694a.f389736m.f389704h = Collections.emptySet();
    }

    /* renamed from: c */
    public final void mo119138c() {
        C143755bc bcVar = this.f389694a;
        bcVar.f389724a.lock();
        try {
            bcVar.f389734k = new C143745at(bcVar, bcVar.f389731h, bcVar.f389732i, bcVar.f389727d, bcVar.f389733j, bcVar.f389724a, bcVar.f389726c);
            bcVar.f389734k.mo119137b();
            bcVar.f389725b.signalAll();
        } finally {
            bcVar.f389724a.unlock();
        }
    }

    /* renamed from: d */
    public final void mo119139d(Bundle bundle) {
    }

    /* renamed from: e */
    public final void mo119140e(ConnectionResult connectionResult, C143841m mVar, boolean z) {
    }

    /* renamed from: f */
    public final void mo119141f(int i) {
    }

    /* renamed from: g */
    public final boolean mo119142g() {
        return true;
    }

    /* renamed from: h */
    public final void mo119143h(C143824m mVar) {
        this.f389694a.f389736m.f389701e.add(mVar);
    }
}
