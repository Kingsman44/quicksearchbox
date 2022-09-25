package com.google.android.apps.gsa.staticplugins.webview;

import com.google.android.apps.gsa.search.core.p6816p.C86230bm;
import com.google.android.apps.gsa.search.core.p6816p.C86231bn;
import com.google.android.apps.gsa.search.core.p6820r.p6821a.p6829h.C86377b;
import com.google.android.apps.gsa.search.shared.api.C87504b;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.p4449cd.C57954d;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.webview.dh */
/* compiled from: PG */
final class C118201dh implements C60930r {

    /* renamed from: a */
    private final C57954d f328144a;

    /* renamed from: b */
    private final Query f328145b;

    /* renamed from: c */
    private final C58833ax f328146c;

    /* renamed from: d */
    private final C86231bn f328147d;

    /* renamed from: e */
    private final C86230bm f328148e;

    /* renamed from: f */
    private final C58833ax f328149f;

    /* renamed from: g */
    private final C86377b f328150g;

    /* renamed from: h */
    private final long f328151h;

    public C118201dh(C57954d dVar, Query query, C58833ax axVar, C86231bn bnVar, C86230bm bmVar, C58833ax axVar2, C86377b bVar, long j) {
        this.f328144a = dVar;
        this.f328145b = query;
        this.f328146c = axVar;
        this.f328147d = bnVar;
        this.f328148e = bmVar;
        this.f328149f = axVar2;
        this.f328150g = bVar;
        this.f328151h = j;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C60870cx cxVar = this.f328144a.f154993a;
        C58838bb.m90883r(cxVar.isDone());
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        C90476a aVar = C91018d.f254254a;
        cxVar.get(0, timeUnit);
        if (!this.f328146c.mo56113h()) {
            return C60856cj.m92900i(new C118153bp());
        }
        this.f328150g.mo80150b();
        return this.f328150g.mo80149a(this.f328151h, this.f328145b, (C87504b) this.f328146c.mo56107c(), this.f328147d, this.f328148e, this.f328149f);
    }
}
