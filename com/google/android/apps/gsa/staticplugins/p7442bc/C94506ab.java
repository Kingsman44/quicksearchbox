package com.google.android.apps.gsa.staticplugins.p7442bc;

import com.google.android.apps.gsa.search.core.p6519al.p6642ce.C85080a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90139r;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.C90918bo;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.bc.ab */
/* compiled from: PG */
public final class C94506ab extends C68247h {

    /* renamed from: a */
    private final C68283d f264221a;

    /* renamed from: c */
    private final C68283d f264222c;

    /* renamed from: d */
    private final C68283d f264223d;

    public C94506ab(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C94506ab.class), aVar);
        this.f264221a = C68236af.m98549d(dVar);
        this.f264222c = C68236af.m98549d(dVar2);
        this.f264223d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C85080a aVar = (C85080a) list.get(0);
        Query query = (Query) list.get(1);
        C86124t tVar = (C86124t) list.get(2);
        if ((!tVar.mo79746e(C90139r.f251854b) || !query.mo84388cU()) && (!tVar.mo79746e(C90139r.f251855c) || !query.mo84420dA())) {
            return C90918bo.m148514a(aVar.mo78692a(query));
        }
        return C60856cj.m92900i(C58836b.f156633a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f264221a.mo60297gq(), this.f264222c.mo60297gq(), this.f264223d.mo60297gq());
    }
}
