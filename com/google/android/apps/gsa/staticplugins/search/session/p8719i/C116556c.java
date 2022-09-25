package com.google.android.apps.gsa.staticplugins.search.session.p8719i;

import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6902k.C87350a;
import com.google.android.apps.gsa.search.core.state.C87116hk;
import com.google.android.apps.gsa.search.core.state.C87135ic;
import com.google.android.apps.gsa.search.core.state.C87138if;
import com.google.android.apps.gsa.staticplugins.search.session.state.C116780ib;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.i.c */
/* compiled from: PG */
final class C116556c implements C87138if {

    /* renamed from: a */
    final /* synthetic */ C116557d f323200a;

    public C116556c(C116557d dVar) {
        this.f323200a = dVar;
    }

    /* renamed from: a */
    public final C87116hk mo80220a() {
        return C116780ib.m193928ay(156, 150, 155, 162);
    }

    /* renamed from: d */
    public final void mo80223d(C87135ic icVar) {
        boolean z = this.f323200a.f323201a.f323958k;
        if (icVar.mo80754a(156)) {
            for (C87350a b : this.f323200a.f323202b.keySet()) {
                b.mo81012b();
            }
        }
        if (this.f323200a.f323202b.isEmpty()) {
            if (z) {
                this.f323200a.f323204d = true;
            }
        } else if (z) {
            for (C87350a a : this.f323200a.f323202b.keySet()) {
                a.mo81011a();
            }
        }
    }
}
