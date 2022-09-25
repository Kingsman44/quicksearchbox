package com.google.android.apps.gsa.staticplugins.p8793w;

import com.google.android.apps.gsa.search.shared.service.C87673aa;
import com.google.android.apps.gsa.shared.p6968aa.C89062r;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.aq */
/* compiled from: PG */
final class C117729aq implements C22868d {

    /* renamed from: a */
    final /* synthetic */ Query f326784a;

    /* renamed from: b */
    final /* synthetic */ C117730ar f326785b;

    public C117729aq(C117730ar arVar, Query query) {
        this.f326785b = arVar;
        this.f326784a = query;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        C59104x c = C117730ar.f326786a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "SearchSvcQueryCommitter");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(18563)).mo56386p("Failed to get connectivity info; defaulting to online path");
        ((C87673aa) this.f326785b.f326787b.mo27525b()).mo81931b(this.f326784a);
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17702gm(Object obj) {
        if (((C89062r) obj).mo83040a()) {
            C58976aa aaVar = C58975e.f156826a;
            ((C87673aa) this.f326785b.f326787b.mo27525b()).mo81931b(this.f326784a);
            return;
        }
        C58976aa aaVar2 = C58975e.f156826a;
        ((C87673aa) this.f326785b.f326787b.mo27525b()).mo81931b(this.f326784a.mo84238A());
    }
}
