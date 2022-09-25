package com.google.android.apps.gsa.search.core.p6820r.p6831c;

import com.google.android.apps.gsa.search.core.p6820r.p6821a.p6824c.C86362b;
import com.google.android.apps.gsa.search.core.service.p6842a.p6844b.C86603d;
import com.google.android.apps.gsa.search.shared.actions.SearchError;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60537to;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.C57954d;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import java.util.Set;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.search.core.r.c.m */
/* compiled from: PG */
public final class C86407m extends C68247h {

    /* renamed from: a */
    private final C68283d f233539a;

    /* renamed from: c */
    private final C68283d f233540c;

    /* renamed from: d */
    private final C68283d f233541d;

    /* renamed from: e */
    private final C68283d f233542e;

    /* renamed from: f */
    private final C68283d f233543f;

    /* renamed from: g */
    private final C68283d f233544g;

    public C86407m(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5, C68283d dVar6) {
        super(aVar2, new C68277d(C86407m.class), aVar);
        this.f233539a = C68236af.m98549d(dVar);
        this.f233540c = C68236af.m98549d(dVar2);
        this.f233541d = C68236af.m98549d(dVar3);
        this.f233542e = C68236af.m98549d(dVar4);
        this.f233543f = C68236af.m98549d(dVar5);
        this.f233544g = C68236af.m98549d(dVar6);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C57954d dVar = (C57954d) list.get(0);
        C57954d dVar2 = (C57954d) list.get(1);
        Set set = (Set) list.get(2);
        SearchError searchError = (SearchError) list.get(3);
        C86362b bVar = (C86362b) list.get(4);
        C86603d dVar3 = (C86603d) list.get(5);
        C60537to toVar = (C60537to) C58557jl.m90130k(set, C60537to.GENERIC_TASKGRAPH_FAILURE);
        if (set.size() > 1) {
            C59104x d = C86401g.f233526a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "EndstateLoggingModule");
            ((C59052c) ((C59052c) d).mo56372aa(8190)).mo56386p("More than one detailed endstate was reported. Only one will be used.");
        }
        return dVar3.mo54598b(new C86398d(bVar, toVar, searchError));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f233539a.mo60297gq(), this.f233540c.mo60297gq(), this.f233541d.mo60297gq(), this.f233542e.mo60297gq(), this.f233543f.mo60297gq(), this.f233544g.mo60297gq());
    }
}
