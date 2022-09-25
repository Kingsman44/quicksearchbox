package com.google.android.apps.gsa.staticplugins.p8025l.p8026a;

import com.google.android.apps.gsa.search.core.p6816p.C86227bj;
import com.google.android.apps.gsa.search.core.p6816p.C86246cb;
import com.google.android.apps.gsa.search.core.p6816p.C86261p;
import com.google.assistant.p3897e.p3910e.p3911a.C51195j;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.l.a.n */
/* compiled from: PG */
public final class C102620n extends C68247h {

    /* renamed from: a */
    private final C68283d f286402a;

    /* renamed from: c */
    private final C68283d f286403c;

    public C102620n(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C102620n.class), aVar);
        this.f286402a = C68236af.m98549d(dVar);
        this.f286403c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        Object obj2;
        List list = (List) obj;
        C58833ax axVar = (C58833ax) list.get(0);
        C86227bj bjVar = (C86227bj) list.get(1);
        if (axVar.mo56113h()) {
            C86246cb cbVar = bjVar.f233010k;
            if (cbVar instanceof C86261p) {
                ((C86261p) cbVar).mo79958g((C51195j) axVar.mo56107c());
                bjVar.mo79859L();
                bjVar.mo79858K(true);
                C58976aa aaVar = C58975e.f156826a;
                obj2 = C58833ax.m90834k(bjVar.f233010k);
                return C60856cj.m92900i(obj2);
            }
        }
        C58976aa aaVar2 = C58975e.f156826a;
        obj2 = C58836b.f156633a;
        return C60856cj.m92900i(obj2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f286402a.mo60297gq(), this.f286403c.mo60297gq());
    }
}
