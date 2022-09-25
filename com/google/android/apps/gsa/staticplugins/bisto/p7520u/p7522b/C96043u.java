package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b;

import com.google.android.apps.gsa.binaries.satin.app.fz;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.C94892p;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7470d.C94937e;
import com.google.android.apps.gsa.staticplugins.bisto.p7491i.C95463e;
import com.google.android.apps.gsa.staticplugins.bisto.p7491i.C95464f;
import com.google.android.apps.gsa.staticplugins.bisto.p7491i.C95465g;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.u */
/* compiled from: PG */
public final /* synthetic */ class C96043u implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C96017bm f268918a;

    /* renamed from: b */
    public final /* synthetic */ String f268919b;

    public /* synthetic */ C96043u(C96017bm bmVar, String str) {
        this.f268918a = bmVar;
        this.f268919b = str;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C96017bm bmVar = this.f268918a;
        String str = this.f268919b;
        C124548d dVar = (C124548d) obj;
        if (dVar.mo106485Z()) {
            C95465g gVar = bmVar.f268842l;
            new C90873ag(C60846c.m92878g(C60922j.m93045h(C60838bs.m92859i(gVar.f267137c.mo37974b()), new C95463e(gVar, dVar), gVar.f267136b), Exception.class, C95464f.f267134a, C60826bg.f164896a), bmVar.f268837g, "send-hotwordconfig-datalayer", C96013bi.f268822a).mo85223a(C96014bj.f268823a);
            return;
        }
        fz fzVar = (fz) bmVar.mo89877a().f265422g.get(str);
        if (fzVar == null) {
            C59104x d = C94892p.f265416a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "BistoBleConnManager");
            ((C59052c) ((C59052c) d).mo56372aa(17339)).mo56389s("No connection found for %s", str);
            return;
        }
        C94937e a = fzVar.b().mo88655a();
        if (a != null) {
            a.mo88807i(true);
        }
    }
}
