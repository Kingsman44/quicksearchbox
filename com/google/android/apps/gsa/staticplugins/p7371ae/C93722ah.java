package com.google.android.apps.gsa.staticplugins.p7371ae;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.C57940c;
import dagger.p5295b.C68282c;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.ae.ah */
/* compiled from: PG */
public final class C93722ah extends C68247h {

    /* renamed from: a */
    private final C68283d f261556a;

    /* renamed from: c */
    private final C68283d f261557c;

    /* renamed from: d */
    private final C68283d f261558d;

    public C93722ah(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C93722ah.class), aVar);
        this.f261556a = C68236af.m98549d(dVar);
        this.f261557c = C68236af.m98549d(dVar2);
        this.f261558d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C68282c cVar = (C68282c) list.get(1);
        C68283d dVar = this.f261558d;
        if (!((Query) list.get(0)).mo84392cY() || !C57940c.m88580g(cVar) || C57940c.m88581h(cVar)) {
            return C118826c.f331423b;
        }
        return dVar.mo60297gq();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f261556a.mo60297gq(), C68236af.m98546a(this.f261557c.mo60297gq()));
    }
}
