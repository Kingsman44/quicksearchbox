package com.google.android.apps.gsa.staticplugins.p7778dd.p7779a;

import com.google.android.apps.gsa.search.core.p6820r.C86383ae;
import com.google.android.apps.gsa.search.core.p6820r.C86384af;
import com.google.android.apps.gsa.search.core.p6820r.C86387ai;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7159c.C90913bj;
import com.google.android.apps.gsa.shared.util.p7159c.C90916bm;
import com.google.common.base.C58819aj;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.gsa.staticplugins.dd.a.a */
/* compiled from: PG */
public final class C99375a implements C86387ai {

    /* renamed from: a */
    private final C86387ai f278045a;

    /* renamed from: b */
    private final C86387ai f278046b;

    public C99375a(C86387ai aiVar, C86387ai aiVar2) {
        this.f278045a = aiVar;
        this.f278046b = aiVar2;
    }

    /* renamed from: a */
    public final C86384af mo80158a(C60870cx cxVar, C60870cx cxVar2) {
        C86384af a = this.f278045a.mo80158a(cxVar, cxVar2);
        C86384af a2 = this.f278046b.mo80158a(cxVar, cxVar2);
        C60870cx g = C60922j.m93044g(a.mo80161b(), new C90913bj(new C58819aj(a)), C60826bg.f164896a);
        C90476a aVar = C91018d.f254254a;
        C90916bm bmVar = new C90916bm(g, a2);
        C60856cj.m92911t(g, bmVar, C60826bg.f164896a);
        return C86383ae.m139162a(bmVar);
    }

    /* renamed from: b */
    public final void mo80159b(Query query) {
        this.f278045a.mo80159b(query);
        this.f278046b.mo80159b(query);
    }
}
