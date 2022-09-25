package com.google.android.apps.gsa.staticplugins.p7714cv.p7725i.p7727b.p7728a.p7731b;

import com.google.android.apps.gsa.binaries.satin.app.C74377x;
import com.google.android.apps.gsa.binaries.satin.app.z;
import com.google.android.apps.gsa.p8889z.p8909e.p8910a.C118954ab;
import com.google.android.apps.gsa.p8889z.p8909e.p8910a.C118959b;
import com.google.android.apps.gsa.p8889z.p8909e.p8910a.C119062r;
import com.google.android.apps.gsa.p8889z.p8909e.p8910a.C119066v;
import com.google.android.apps.gsa.search.core.p6820r.C86497j;
import com.google.android.apps.gsa.search.core.p6820r.C86569o;
import com.google.android.apps.gsa.shared.p6968aa.C89061q;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.staticplugins.p7714cv.p7725i.p7727b.C98799a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.p5294a.C68225k;

/* renamed from: com.google.android.apps.gsa.staticplugins.cv.i.b.a.b.e */
/* compiled from: PG */
public final class C98849e extends C118959b implements C86569o {

    /* renamed from: a */
    private final C98799a f276211a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C98849e(C89356b bVar, C22871g gVar, Query query, C89061q qVar, C119066v vVar, C74377x xVar, C58833ax axVar) {
        super(bVar);
        C74377x xVar2 = xVar;
        C58976aa aaVar = C58975e.f156826a;
        xVar2.f208338c = axVar;
        xVar2.f208339d = gVar;
        xVar2.f208340e = qVar;
        xVar2.f208341f = bVar;
        xVar2.f208342g = query;
        xVar2.f208343h = vVar;
        C68225k.m98529a(xVar2.f208338c, C58833ax.class);
        C68225k.m98529a(xVar2.f208339d, C22871g.class);
        C68225k.m98529a(xVar2.f208340e, C89061q.class);
        C68225k.m98529a(xVar2.f208341f, C89356b.class);
        C68225k.m98529a(xVar2.f208342g, Query.class);
        C68225k.m98529a(xVar2.f208343h, C119066v.class);
        this.f276211a = new z(xVar2.f208336a, xVar2.f208337b, new C118954ab(), xVar2.f208338c, xVar2.f208339d, xVar2.f208340e, xVar2.f208341f, xVar2.f208342g, xVar2.f208343h);
    }

    /* renamed from: b */
    public final String mo79837b() {
        return "Hybrid SearchFetcher.";
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C86497j mo91280c(Query query) {
        return new C119062r(this.f276211a.g.mo60297gq());
    }
}
