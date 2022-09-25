package com.google.android.gms.common.internal;

import com.google.android.gms.common.ConnectionResult;

/* renamed from: com.google.android.gms.common.internal.k */
/* compiled from: PG */
public final class C143936k implements C143933h {

    /* renamed from: a */
    final /* synthetic */ C143939n f390129a;

    public C143936k(C143939n nVar) {
        this.f390129a = nVar;
    }

    /* renamed from: a */
    public final void mo119145a(ConnectionResult connectionResult) {
        if (connectionResult.mo119068b()) {
            C143939n nVar = this.f390129a;
            nVar.mo119450E((C143899ao) null, nVar.mo119393J());
            return;
        }
        C143930e eVar = this.f390129a.f390136C;
        if (eVar != null) {
            eVar.mo119391c(connectionResult);
        }
    }
}
