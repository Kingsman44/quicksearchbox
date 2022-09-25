package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.android.libraries.gsa.p1876k.C22871g;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.hp */
/* compiled from: PG */
public final class C116767hp implements C22868d {

    /* renamed from: a */
    final /* synthetic */ C116769hr f323932a;

    /* renamed from: b */
    private final Query f323933b;

    public C116767hp(C116769hr hrVar, Query query) {
        this.f323932a = hrVar;
        this.f323933b = query;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17702gm(Object obj) {
        C118826c cVar = (C118826c) obj;
        if (((C116735gk) this.f323932a.f323937b.mo27525b()).f323784p.mo84383cP(this.f323933b)) {
            C22871g gVar = this.f323932a.f323939d;
            long j = this.f323933b.f252780s;
            gVar.mo28213m("Watchdog Task for commit: " + j, 86400000, new C116768hq(this.f323932a, this.f323933b));
        }
    }
}
