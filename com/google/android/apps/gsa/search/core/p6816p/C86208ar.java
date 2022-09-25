package com.google.android.apps.gsa.search.core.p6816p;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.google.C85915ci;
import com.google.android.apps.gsa.search.core.google.C85919cm;
import com.google.android.apps.gsa.search.core.google.C85929cw;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
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

/* renamed from: com.google.android.apps.gsa.search.core.p.ar */
/* compiled from: PG */
public final class C86208ar extends C68247h {

    /* renamed from: a */
    private final C68283d f232950a;

    /* renamed from: c */
    private final C68283d f232951c;

    /* renamed from: d */
    private final C68283d f232952d;

    /* renamed from: e */
    private final C68283d f232953e;

    /* renamed from: f */
    private final C68283d f232954f;

    /* renamed from: g */
    private final C68283d f232955g;

    public C86208ar(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5, C68283d dVar6) {
        super(aVar2, new C68277d(C86208ar.class), aVar);
        this.f232950a = C68236af.m98549d(dVar);
        this.f232951c = C68236af.m98549d(dVar2);
        this.f232952d = C68236af.m98549d(dVar3);
        this.f232953e = C68236af.m98549d(dVar4);
        this.f232954f = C68236af.m98549d(dVar5);
        this.f232955g = C68236af.m98549d(dVar6);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C68282c cVar = (C68282c) list.get(0);
        C68282c cVar2 = (C68282c) list.get(1);
        C85929cw cwVar = (C85929cw) list.get(2);
        C85919cm cmVar = (C85919cm) list.get(3);
        C68282c cVar3 = (C68282c) list.get(4);
        Query query = (Query) list.get(5);
        if (C57940c.m88583j(cVar)) {
            return C118826c.m197213c(cmVar.f232290d.mo85139d(new C85915ci(cmVar, query, cwVar, (Query) C57940c.m88578e(cVar3, query), ((Boolean) C57940c.m88578e(cVar2, false)).booleanValue(), (String) ((C58833ax) cVar.mo60292a()).mo56107c())));
        }
        ((C59052c) ((C59052c) C86202al.f232942a.mo56225c()).mo56372aa(7751)).mo56386p("Couldn't log prefetch via gen204 due to absent or failed event ID.");
        return C118826c.f331423b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(C68236af.m98546a(this.f232950a.mo60297gq()), C68236af.m98546a(this.f232951c.mo60297gq()), this.f232952d.mo60297gq(), this.f232953e.mo60297gq(), C68236af.m98546a(this.f232954f.mo60297gq()), this.f232955g.mo60297gq());
    }
}
