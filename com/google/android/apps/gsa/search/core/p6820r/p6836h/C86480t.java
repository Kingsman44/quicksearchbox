package com.google.android.apps.gsa.search.core.p6820r.p6836h;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6820r.C86384af;
import com.google.android.apps.gsa.search.core.p6820r.C86386ah;
import com.google.android.apps.gsa.search.core.p6820r.C86387ai;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7159c.C90918bo;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.search.core.r.h.t */
/* compiled from: PG */
public final class C86480t implements C86387ai {

    /* renamed from: a */
    private final C58485gu f233716a;

    public C86480t(C58485gu guVar) {
        this.f233716a = guVar;
    }

    /* renamed from: a */
    public final C86384af mo80158a(C60870cx cxVar, C60870cx cxVar2) {
        ArrayList arrayList = new ArrayList(((C58724pq) this.f233716a).f156474d);
        ArrayList arrayList2 = new ArrayList(((C58724pq) this.f233716a).f156474d);
        C58485gu guVar = this.f233716a;
        int i = ((C58724pq) guVar).f156474d;
        for (int i2 = 0; i2 < i; i2++) {
            C86384af a = ((C86387ai) guVar.get(i2)).mo80158a(cxVar, cxVar2);
            arrayList.add(a.mo80161b());
            arrayList2.add(a.mo80160a());
        }
        C60870cx g = C60922j.m93044g(C90918bo.m148518e(arrayList), new C86477q(arrayList), C60826bg.f164896a);
        C90476a aVar = C91018d.f254254a;
        return new C86386ah(g, C118826c.m197212b(arrayList2));
    }

    /* renamed from: b */
    public final void mo80159b(Query query) {
        C58485gu guVar = this.f233716a;
        int i = ((C58724pq) guVar).f156474d;
        for (int i2 = 0; i2 < i; i2++) {
            ((C86387ai) guVar.get(i2)).mo80159b(query);
        }
    }
}
