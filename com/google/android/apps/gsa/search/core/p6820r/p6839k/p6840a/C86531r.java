package com.google.android.apps.gsa.search.core.p6820r.p6839k.p6840a;

import com.google.android.apps.gsa.search.core.google.p6796f.C85981c;
import com.google.android.apps.gsa.search.core.google.p6796f.C85983e;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90139r;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.search.core.r.k.a.r */
/* compiled from: PG */
public final class C86531r extends C68247h {

    /* renamed from: a */
    private final C68283d f233827a;

    /* renamed from: c */
    private final C68283d f233828c;

    /* renamed from: d */
    private final C68283d f233829d;

    public C86531r(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C86531r.class), aVar);
        this.f233827a = C68236af.m98549d(dVar);
        this.f233828c = C68236af.m98549d(dVar2);
        this.f233829d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        C85981c cVar;
        List list = (List) obj;
        C85983e eVar = (C85983e) list.get(0);
        Query query = (Query) list.get(1);
        if (!((C86124t) list.get(2)).mo79746e(C90139r.f251855c) || !query.mo84420dA()) {
            cVar = new C85981c();
        } else {
            cVar = C86524k.m139368a(eVar, query);
        }
        return C60856cj.m92900i(cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f233827a.mo60297gq(), this.f233828c.mo60297gq(), this.f233829d.mo60297gq());
    }
}
