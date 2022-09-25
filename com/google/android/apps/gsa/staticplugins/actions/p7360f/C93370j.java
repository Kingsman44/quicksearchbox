package com.google.android.apps.gsa.staticplugins.actions.p7360f;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6820r.p6821a.p6822a.C86358d;
import com.google.android.apps.gsa.search.core.service.p6842a.p6844b.C86603d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.C57940c;
import com.google.p4449cd.C57954d;
import dagger.p5295b.C68282c;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.actions.f.j */
/* compiled from: PG */
public final class C93370j extends C68247h {

    /* renamed from: a */
    private final C68283d f260416a;

    /* renamed from: c */
    private final C68283d f260417c;

    /* renamed from: d */
    private final C68283d f260418d;

    /* renamed from: e */
    private final C68283d f260419e;

    public C93370j(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4) {
        super(aVar2, new C68277d(C93370j.class), aVar);
        this.f260416a = C68236af.m98549d(dVar);
        this.f260417c = C68236af.m98549d(dVar2);
        this.f260418d = C68236af.m98549d(dVar3);
        this.f260419e = C68236af.m98549d(dVar4);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        C57954d dVar;
        List list = (List) obj;
        C68282c cVar = (C68282c) list.get(0);
        C86603d dVar2 = (C86603d) list.get(1);
        C86358d dVar3 = (C86358d) list.get(2);
        C118826c cVar2 = (C118826c) list.get(3);
        if (C57940c.m88583j(cVar)) {
            dVar = new C57954d(dVar2.mo54598b(new C93363c(dVar3, cVar)));
        } else {
            dVar = new C57954d(dVar2.mo54598b(new C93364d(dVar3)));
        }
        return C60856cj.m92900i(dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(C68236af.m98546a(this.f260416a.mo60297gq()), this.f260417c.mo60297gq(), this.f260418d.mo60297gq(), this.f260419e.mo60297gq());
    }
}
