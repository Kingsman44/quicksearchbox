package com.google.android.apps.gsa.staticplugins.search.session.p8715e;

import com.google.android.apps.gsa.search.core.state.C87116hk;
import com.google.android.apps.gsa.search.core.state.C87135ic;
import com.google.android.apps.gsa.search.core.state.C87138if;
import com.google.android.apps.gsa.staticplugins.p7855dr.p7857b.C100005d;
import com.google.android.apps.gsa.staticplugins.p7855dr.p7857b.C100026y;
import com.google.android.apps.gsa.staticplugins.search.session.state.C116780ib;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.e.b */
/* compiled from: PG */
final class C116539b implements C87138if {

    /* renamed from: a */
    final /* synthetic */ C116540c f323176a;

    /* renamed from: b */
    private boolean f323177b;

    /* renamed from: c */
    private final C100026y f323178c;

    public C116539b(C116540c cVar, C100026y yVar) {
        this.f323176a = cVar;
        this.f323177b = cVar.f323179a.mo102804g();
        this.f323178c = yVar;
    }

    /* renamed from: a */
    public final C87116hk mo80220a() {
        return C116780ib.m193928ay(158);
    }

    /* renamed from: d */
    public final void mo80223d(C87135ic icVar) {
        boolean g = this.f323176a.f323179a.mo102804g();
        if (this.f323177b != g) {
            this.f323177b = g;
            ((C100005d) this.f323178c.f279757a.f279667a).f279695d.mo28730f(Boolean.valueOf(g), false);
        }
    }
}
