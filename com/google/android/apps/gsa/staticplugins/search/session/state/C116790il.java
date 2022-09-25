package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.p6505af.p6506a.C84466a;
import com.google.android.apps.gsa.search.core.p6519al.p6670cs.C85202a;
import com.google.android.apps.gsa.search.core.p6519al.p6705di.C85372a;
import com.google.android.apps.gsa.search.core.p6820r.p6821a.p6824c.C86361a;
import com.google.android.apps.gsa.search.core.p6820r.p6838j.C86498a;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.debug.C91030n;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.staticplugins.search.session.p8711c.p8712a.C116533b;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.il */
/* compiled from: PG */
public final class C116790il extends C116780ib {

    /* renamed from: a */
    public final C68214a f324008a;

    /* renamed from: b */
    public final C68214a f324009b;

    /* renamed from: c */
    public final C68214a f324010c;

    /* renamed from: d */
    public final C68214a f324011d;

    /* renamed from: e */
    public final C85372a f324012e;

    /* renamed from: f */
    public final C85202a f324013f;

    /* renamed from: g */
    public final C116533b f324014g;

    /* renamed from: h */
    public final C68214a f324015h;

    /* renamed from: i */
    public final AtomicBoolean f324016i = new AtomicBoolean(false);

    /* renamed from: j */
    private final C68214a f324017j;

    /* renamed from: k */
    private final C68214a f324018k;

    /* renamed from: l */
    private final C90476a f324019l;

    /* renamed from: m */
    private final C68214a f324020m;

    /* renamed from: n */
    private final C22871g f324021n;

    public C116790il(C68214a aVar, C90476a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5, C68214a aVar6, C68214a aVar7, C68214a aVar8, C116533b bVar, C22871g gVar, C68214a aVar9, C85372a aVar10, C85202a aVar11, C68214a aVar12) {
        super(aVar, 197);
        this.f324008a = aVar3;
        this.f324009b = aVar4;
        this.f324010c = aVar5;
        this.f324017j = aVar6;
        this.f324020m = aVar7;
        this.f324015h = aVar8;
        this.f324014g = bVar;
        this.f324021n = gVar;
        this.f324011d = aVar9;
        this.f324012e = aVar10;
        this.f324013f = aVar11;
        this.f324019l = aVar2;
        this.f324018k = aVar12;
    }

    /* renamed from: e */
    public final C89356b mo102944e() {
        C84466a aVar = (C84466a) this.f324018k.mo27525b();
        if (this.f324019l.mo84225b()) {
            C91030n.m148695a("SearchGraphFactory.create(...)", this.f324019l);
        }
        C89356b b = aVar.mo78026b("textSearch", C118575h.GRAPH_TEXT_SEARCH, C118575h.WORKER_TEXT_SEARCH);
        if (this.f324019l.mo84225b()) {
            C91030n.m148696b(this.f324019l);
        }
        return b;
    }

    /* renamed from: g */
    public final C60870cx mo102945g(C89356b bVar) {
        return this.f324021n.mo28202b("TextSearchState: create foreground renderer", new C116788ij(this, (C116642cz) this.f324020m.mo27525b(), bVar));
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
    }

    /* renamed from: i */
    public final void mo102946i(Query query, long j) {
        this.f324016i.set(false);
        C89356b e = mo102944e();
        this.f324012e.mo78898b(query, j, (C86498a) this.f324017j.mo27525b(), mo102945g(e), (C86361a) this.f324011d.mo27525b(), e);
    }
}
