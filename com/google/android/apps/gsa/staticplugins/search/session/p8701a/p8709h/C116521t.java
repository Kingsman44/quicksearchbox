package com.google.android.apps.gsa.staticplugins.search.session.p8701a.p8709h;

import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.staticplugins.search.session.state.C116735gk;
import com.google.android.apps.gsa.staticplugins.search.session.state.C116819jn;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.a.h.t */
/* compiled from: PG */
public final /* synthetic */ class C116521t implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C116502ad f323088a;

    /* renamed from: b */
    public final /* synthetic */ long f323089b;

    /* renamed from: c */
    public final /* synthetic */ double f323090c;

    public /* synthetic */ C116521t(C116502ad adVar, long j, double d) {
        this.f323088a = adVar;
        this.f323089b = j;
        this.f323090c = d;
    }

    public final void run() {
        C116502ad adVar = this.f323088a;
        long j = this.f323089b;
        double d = this.f323090c;
        Query query = adVar.f323012c.f323784p;
        if (query.f252749G == j && query.mo84436dQ()) {
            C116819jn jnVar = adVar.f323019j;
            if (((C116735gk) jnVar.f324168d.mo27525b()).f323784p.mo84416cw() && Math.abs(jnVar.f324159V - d) > 0.01d) {
                jnVar.f324159V = d;
                jnVar.mo80591ar();
            }
        }
    }
}
