package com.google.android.apps.gsa.staticplugins.actions.p7360f;

import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.search.core.p6519al.p6574b.C84809b;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6820r.p6821a.p6822a.C86355a;
import com.google.android.apps.gsa.search.core.p6820r.p6821a.p6826e.C86372a;
import com.google.android.apps.gsa.search.shared.actions.ActionData;
import com.google.android.apps.gsa.search.shared.media.PlaybackStatus;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.p7066m.C90139r;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.C90918bo;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90851k;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4152bb.p4153a.C55421x;
import com.google.p4449cd.C57940c;
import dagger.p5295b.C68282c;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.actions.f.f */
/* compiled from: PG */
public final class C93366f extends C68247h {

    /* renamed from: a */
    private final C68283d f260400a;

    /* renamed from: c */
    private final C68283d f260401c;

    /* renamed from: d */
    private final C68283d f260402d;

    /* renamed from: e */
    private final C68283d f260403e;

    /* renamed from: f */
    private final C68283d f260404f;

    /* renamed from: g */
    private final C68283d f260405g;

    /* renamed from: h */
    private final C68283d f260406h;

    /* renamed from: i */
    private final C68283d f260407i;

    /* renamed from: j */
    private final C68283d f260408j;

    /* renamed from: k */
    private final C68283d f260409k;

    /* renamed from: l */
    private final C68283d f260410l;

    public C93366f(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5, C68283d dVar6, C68283d dVar7, C68283d dVar8, C68283d dVar9, C68283d dVar10, C68283d dVar11) {
        super(aVar2, new C68277d(C93366f.class), aVar);
        this.f260400a = C68236af.m98549d(dVar);
        this.f260401c = C68236af.m98549d(dVar2);
        this.f260402d = C68236af.m98549d(dVar3);
        this.f260403e = C68236af.m98549d(dVar4);
        this.f260404f = C68236af.m98549d(dVar5);
        this.f260405g = C68236af.m98549d(dVar6);
        this.f260406h = C68236af.m98549d(dVar7);
        this.f260407i = C68236af.m98549d(dVar8);
        this.f260408j = C68236af.m98549d(dVar9);
        this.f260409k = C68236af.m98549d(dVar10);
        this.f260410l = C68236af.m98549d(dVar11);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        C58833ax axVar;
        List list = (List) obj;
        boolean z = false;
        C86124t tVar = (C86124t) list.get(0);
        C84809b bVar = (C84809b) list.get(1);
        C89356b bVar2 = (C89356b) list.get(2);
        Query query = (Query) list.get(3);
        C58833ax axVar2 = (C58833ax) list.get(4);
        C68282c cVar = (C68282c) list.get(5);
        C58833ax axVar3 = (C58833ax) list.get(6);
        C86355a aVar = (C86355a) list.get(7);
        C86372a aVar2 = (C86372a) list.get(8);
        bm bmVar = (bm) list.get(9);
        C90851k kVar = (C90851k) list.get(10);
        if (C57940c.m88583j(cVar)) {
            axVar = (C58833ax) C57940c.m88577d(cVar);
        } else {
            axVar = C58836b.f156633a;
        }
        C58833ax axVar4 = axVar;
        if (!axVar2.mo56113h()) {
            return C60856cj.m92900i(C58836b.f156633a);
        }
        C58485gu o = tVar.mo79749o(C90139r.f251860h);
        boolean z2 = ((ActionData) axVar2.mo56107c()).f235998h != null && o.contains(Integer.valueOf(((ActionData) axVar2.mo56107c()).f235998h.f146230cP));
        C55421x xVar = ((ActionData) axVar2.mo56107c()).f235998h;
        o.size();
        boolean z3 = ((ActionData) axVar2.mo56107c()).mo81101l() && !z2 && bmVar.u();
        if ((query.mo84420dA() && tVar.mo79746e(C90139r.f251862j)) || (query.mo84392cY() && tVar.mo79746e(C90139r.f251861i))) {
            z = true;
        }
        if (!z3 || !z) {
            long a = tVar.mo79743a(C90139r.f251864l);
            if (a <= 0 || !z3 || !query.mo84420dA()) {
                return C90918bo.m148514a(bVar.mo78484a(bVar2, query, (ActionData) axVar2.mo56107c(), axVar4, (PlaybackStatus) axVar3.mo56111f(), aVar, aVar2));
            }
            return C60856cj.m92902k(new C93362b(bVar, bVar2, query, axVar2, axVar4, axVar3, aVar, aVar2), a, TimeUnit.MILLISECONDS, kVar.mo85209b("Blocking executor for actionProducer Module"));
        }
        bVar.mo78477E((ActionData) axVar2.mo56107c(), query);
        return C60856cj.m92900i(C58836b.f156633a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f260400a.mo60297gq(), this.f260401c.mo60297gq(), this.f260402d.mo60297gq(), this.f260403e.mo60297gq(), this.f260404f.mo60297gq(), C68236af.m98546a(this.f260405g.mo60297gq()), this.f260406h.mo60297gq(), this.f260407i.mo60297gq(), this.f260408j.mo60297gq(), this.f260409k.mo60297gq(), this.f260410l.mo60297gq());
    }
}
