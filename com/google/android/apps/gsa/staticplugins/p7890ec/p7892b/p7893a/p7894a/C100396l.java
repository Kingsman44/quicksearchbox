package com.google.android.apps.gsa.staticplugins.p7890ec.p7892b.p7893a.p7894a;

import com.google.android.apps.gsa.p8889z.p8893c.p8901h.C118928k;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.speech.p5208h.C66668eh;
import com.google.speech.p5208h.C66669ei;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.ec.b.a.a.l */
/* compiled from: PG */
public final class C100396l extends C68247h {

    /* renamed from: a */
    private final C68283d f280698a;

    public C100396l(C69464a aVar, C69464a aVar2, C68283d dVar) {
        super(aVar2, new C68277d(C100396l.class), aVar);
        this.f280698a = C68236af.m98549d(dVar);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        C118928k kVar;
        String bf;
        Query query = (Query) obj;
        if (!query.mo84446da() || (bf = query.mo84347bf("expected-query")) == null) {
            kVar = new C118928k(C58836b.f156633a, C66669ei.f181357d);
        } else {
            C66668eh ehVar = (C66668eh) C66669ei.f181356c.createBuilder();
            ehVar.copyOnWrite();
            C66669ei eiVar = (C66669ei) ehVar.instance;
            eiVar.f181359a |= 1;
            eiVar.f181360b = bf;
            C58976aa aaVar = C58975e.f156826a;
            kVar = new C118928k(C58833ax.m90834k((C66669ei) ehVar.build()), C66669ei.f181357d);
        }
        return C60856cj.m92900i(kVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return this.f280698a.mo60297gq();
    }
}
