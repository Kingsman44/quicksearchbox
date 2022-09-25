package com.google.android.apps.gsa.staticplugins.bisto.p7459aa.p7461b;

import com.google.android.apps.gsa.search.core.p6816p.C86253h;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.staticplugins.bisto.p7459aa.C94785f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.aa.b.bm */
/* compiled from: PG */
public final class C94709bm extends C68247h {

    /* renamed from: a */
    private final C68283d f264876a;

    /* renamed from: c */
    private final C68283d f264877c;

    /* renamed from: d */
    private final C68283d f264878d;

    /* renamed from: e */
    private final C68283d f264879e;

    /* renamed from: f */
    private final C68283d f264880f;

    /* renamed from: g */
    private final C68283d f264881g;

    public C94709bm(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5, C68283d dVar6) {
        super(aVar2, new C68277d(C94709bm.class), aVar);
        this.f264876a = C68236af.m98549d(dVar);
        this.f264877c = C68236af.m98549d(dVar2);
        this.f264878d = C68236af.m98549d(dVar3);
        this.f264879e = C68236af.m98549d(dVar4);
        this.f264880f = C68236af.m98549d(dVar5);
        this.f264881g = C68236af.m98549d(dVar6);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C58833ax axVar = (C58833ax) list.get(0);
        C68283d dVar = this.f264877c;
        C58833ax axVar2 = (C58833ax) list.get(1);
        C94785f fVar = (C94785f) list.get(2);
        C22871g gVar = (C22871g) list.get(3);
        Query query = (Query) list.get(4);
        if (!C86253h.ACTION_V2.equals(axVar2.mo56111f()) && (!C86253h.CONVERSATION_DELTA.equals(axVar2.mo56111f()) || !axVar.mo56113h() || !query.mo84411cr())) {
            return C60856cj.m92900i(false);
        }
        if (!axVar.mo56113h()) {
            gVar.mo28212l("failed", new C94682am(fVar));
            return C60856cj.m92900i(false);
        }
        C59104x b = C94692aw.f264811a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoModularActionMod");
        ((C59052c) ((C59052c) b).mo56372aa(16866)).mo56386p("Handling action V2");
        return C60922j.m93044g(dVar.mo60297gq(), new C94683an(gVar, fVar), C60826bg.f164896a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f264876a.mo60297gq(), this.f264878d.mo60297gq(), this.f264879e.mo60297gq(), this.f264880f.mo60297gq(), this.f264881g.mo60297gq());
    }
}
