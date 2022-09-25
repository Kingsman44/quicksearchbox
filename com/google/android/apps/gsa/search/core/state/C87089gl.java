package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.android.libraries.gsa.p1876k.C22871g;

/* renamed from: com.google.android.apps.gsa.search.core.state.gl */
/* compiled from: PG */
public final class C87089gl implements C22868d {

    /* renamed from: a */
    final /* synthetic */ C87091gn f235307a;

    /* renamed from: b */
    private final Query f235308b;

    public C87089gl(C87091gn gnVar, Query query) {
        this.f235307a = gnVar;
        this.f235308b = query;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17702gm(Object obj) {
        C118826c cVar = (C118826c) obj;
        if (((C87052fn) this.f235307a.f235312b.mo27525b()).f235177m.mo84383cP(this.f235308b)) {
            C22871g gVar = this.f235307a.f235314d;
            long j = this.f235308b.f252780s;
            gVar.mo28213m("Watchdog Task for commit: " + j, 86400000, new C87090gm(this.f235307a, this.f235308b));
        }
    }
}
