package com.google.android.apps.gsa.search.core.p6820r.p6836h;

import com.google.common.base.C58833ax;
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

/* renamed from: com.google.android.apps.gsa.search.core.r.h.j */
/* compiled from: PG */
public final class C86470j extends C68247h {

    /* renamed from: a */
    private final C68283d f233700a;

    /* renamed from: c */
    private final C68283d f233701c;

    /* renamed from: d */
    private final C68283d f233702d;

    /* renamed from: e */
    private final C68283d f233703e;

    public C86470j(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4) {
        super(aVar2, new C68277d(C86470j.class), aVar);
        this.f233700a = C68236af.m98549d(dVar);
        this.f233701c = C68236af.m98549d(dVar2);
        this.f233702d = C68236af.m98549d(dVar3);
        this.f233703e = C68236af.m98549d(dVar4);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        C58833ax axVar;
        List list = (List) obj;
        SettableFuture settableFuture = (SettableFuture) list.get(0);
        C68282c cVar = (C68282c) list.get(1);
        C68283d dVar = this.f233702d;
        C58833ax axVar2 = (C58833ax) list.get(2);
        if (C57940c.m88583j(cVar)) {
            axVar = C58833ax.m90834k(new C86465e(settableFuture, dVar));
        } else {
            axVar = (C58833ax) cVar.mo60292a();
        }
        return C60856cj.m92900i(axVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f233700a.mo60297gq(), C68236af.m98546a(this.f233701c.mo60297gq()), this.f233703e.mo60297gq());
    }
}
