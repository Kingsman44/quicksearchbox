package com.google.android.apps.gsa.staticplugins.p7714cv.p7725i.p7727b.p7728a.p7731b;

import com.google.android.apps.gsa.p8889z.p8909e.p8910a.p8912b.C118979t;
import com.google.android.apps.gsa.search.core.p6816p.C86246cb;
import com.google.android.apps.gsa.search.core.p6816p.C86261p;
import com.google.android.apps.gsa.search.shared.actions.ActionData;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.p7139a.C90523o;
import com.google.common.base.C58833ax;
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

/* renamed from: com.google.android.apps.gsa.staticplugins.cv.i.b.a.b.q */
/* compiled from: PG */
public final class C98861q extends C68247h {

    /* renamed from: a */
    private final C68283d f276231a;

    /* renamed from: c */
    private final C68283d f276232c;

    /* renamed from: d */
    private final C68283d f276233d;

    /* renamed from: e */
    private final C68283d f276234e;

    /* renamed from: f */
    private final C68283d f276235f;

    public C98861q(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5) {
        super(aVar2, new C68277d(C98861q.class), aVar);
        this.f276231a = C68236af.m98549d(dVar);
        this.f276232c = C68236af.m98549d(dVar2);
        this.f276233d = C68236af.m98549d(dVar3);
        this.f276234e = C68236af.m98549d(dVar4);
        this.f276235f = C68236af.m98549d(dVar5);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        Query query = (Query) list.get(0);
        C118979t tVar = (C118979t) list.get(1);
        C58833ax axVar = (C58833ax) list.get(2);
        C58833ax axVar2 = (C58833ax) list.get(3);
        C86246cb cbVar = (C86246cb) list.get(4);
        C58976aa aaVar = C58975e.f156826a;
        if (axVar2.mo56113h()) {
            C86261p pVar = (C86261p) axVar2.mo56107c();
            pVar.mo79914ae();
            tVar.mo91311h(2, query, pVar);
        } else if (axVar.mo56113h()) {
            cbVar.mo79912ac((ActionData) axVar.mo56107c());
            cbVar.mo79914ae();
            tVar.mo91311h(2, query, cbVar);
        } else {
            tVar.mo91307d(2, true, new C90523o(0));
        }
        return C60856cj.m92900i(axVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f276231a.mo60297gq(), this.f276232c.mo60297gq(), this.f276233d.mo60297gq(), this.f276234e.mo60297gq(), this.f276235f.mo60297gq());
    }
}
