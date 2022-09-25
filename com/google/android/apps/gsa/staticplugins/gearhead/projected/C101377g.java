package com.google.android.apps.gsa.staticplugins.gearhead.projected;

import com.google.android.gms.car.C143195dl;
import com.google.android.gms.car.C143196dm;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.gearhead.projected.g */
/* compiled from: PG */
final class C101377g implements C143196dm {

    /* renamed from: a */
    final /* synthetic */ C60870cx f282898a;

    /* renamed from: b */
    final /* synthetic */ Runnable f282899b;

    /* renamed from: c */
    final /* synthetic */ C101378h f282900c;

    public C101377g(C101378h hVar, C60870cx cxVar, Runnable runnable) {
        this.f282900c = hVar;
        this.f282898a = cxVar;
        this.f282899b = runnable;
    }

    /* renamed from: a */
    public final void mo20041a() {
        C58976aa aaVar = C58975e.f156826a;
        ((C101394w) this.f282899b).f282925a.mo92259g();
    }

    /* renamed from: b */
    public final void mo20042b(C143195dl dlVar) {
        C59104x d = C101378h.f282901a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "CarClientTokenFctryImpl");
        ((C59052c) ((C59052c) d).mo56372aa(20090)).mo56389s("TokenConnectionCallbacks#onConnectionSuspended: %s", dlVar);
        this.f282900c.mo92272c(this.f282898a);
    }
}
