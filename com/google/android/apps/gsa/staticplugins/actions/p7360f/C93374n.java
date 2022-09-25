package com.google.android.apps.gsa.staticplugins.actions.p7360f;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6816p.C86231bn;
import com.google.android.apps.gsa.search.core.p6820r.p6821a.p6822a.C86359e;
import com.google.android.apps.gsa.search.core.service.p6842a.p6844b.C86603d;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.actions.f.n */
/* compiled from: PG */
public final class C93374n extends C68247h {

    /* renamed from: a */
    private final C68283d f260426a;

    /* renamed from: c */
    private final C68283d f260427c;

    /* renamed from: d */
    private final C68283d f260428d;

    /* renamed from: e */
    private final C68283d f260429e;

    public C93374n(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4) {
        super(aVar2, new C68277d(C93374n.class), aVar);
        this.f260426a = C68236af.m98549d(dVar);
        this.f260427c = C68236af.m98549d(dVar2);
        this.f260428d = C68236af.m98549d(dVar3);
        this.f260429e = C68236af.m98549d(dVar4);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C58833ax axVar = (C58833ax) list.get(0);
        C86231bn bnVar = (C86231bn) list.get(1);
        C86359e eVar = (C86359e) list.get(2);
        C86603d dVar = (C86603d) list.get(3);
        if (axVar.mo56113h()) {
            return dVar.mo54598b(new C93373m(eVar, axVar, bnVar));
        }
        return C118826c.f331423b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f260426a.mo60297gq(), this.f260427c.mo60297gq(), this.f260428d.mo60297gq(), this.f260429e.mo60297gq());
    }
}
