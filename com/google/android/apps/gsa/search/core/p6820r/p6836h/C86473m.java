package com.google.android.apps.gsa.search.core.p6820r.p6836h;

import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import com.google.p4449cd.C57940c;
import dagger.p5295b.C68282c;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.search.core.r.h.m */
/* compiled from: PG */
public final class C86473m extends C68247h {

    /* renamed from: a */
    private final C68283d f233707a;

    /* renamed from: c */
    private final C68283d f233708c;

    public C86473m(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C86473m.class), aVar);
        this.f233707a = C68236af.m98549d(dVar);
        this.f233708c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C68282c cVar = (C68282c) list.get(0);
        SettableFuture settableFuture = (SettableFuture) list.get(1);
        if (C57940c.m88583j(cVar)) {
            return settableFuture;
        }
        if (C57940c.m88582i(cVar)) {
            return C60856cj.m92900i(false);
        }
        throw C57940c.m88579f(cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(C68236af.m98546a(this.f233707a.mo60297gq()), this.f233708c.mo60297gq());
    }
}
