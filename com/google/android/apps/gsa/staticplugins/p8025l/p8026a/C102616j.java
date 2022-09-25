package com.google.android.apps.gsa.staticplugins.p8025l.p8026a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6816p.C86232bo;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.assistant.auto.ondevice.p713e.C11897m;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
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

/* renamed from: com.google.android.apps.gsa.staticplugins.l.a.j */
/* compiled from: PG */
public final class C102616j extends C68247h {

    /* renamed from: a */
    private final C68283d f286386a;

    /* renamed from: c */
    private final C68283d f286387c;

    /* renamed from: d */
    private final C68283d f286388d;

    /* renamed from: e */
    private final C68283d f286389e;

    /* renamed from: f */
    private final C68283d f286390f;

    /* renamed from: g */
    private final C68283d f286391g;

    /* renamed from: h */
    private final C68283d f286392h;

    public C102616j(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5, C68283d dVar6, C68283d dVar7) {
        super(aVar2, new C68277d(C102616j.class), aVar);
        this.f286386a = C68236af.m98549d(dVar);
        this.f286387c = C68236af.m98549d(dVar2);
        this.f286388d = C68236af.m98549d(dVar3);
        this.f286389e = C68236af.m98549d(dVar4);
        this.f286390f = C68236af.m98549d(dVar5);
        this.f286391g = C68236af.m98549d(dVar6);
        this.f286392h = C68236af.m98549d(dVar7);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C68282c cVar = (C68282c) list.get(1);
        C86124t tVar = (C86124t) list.get(2);
        C86232bo boVar = (C86232bo) list.get(3);
        C68283d dVar = this.f286390f;
        C58833ax axVar = (C58833ax) list.get(4);
        Query query = (Query) list.get(5);
        if (((C58833ax) list.get(0)).mo56113h()) {
            C58976aa aaVar = C58975e.f156826a;
            return C118826c.f331423b;
        }
        boolean e = tVar.mo79746e(C90086ek.f250327az);
        if (C57940c.m88582i(cVar)) {
            if (e && query.mo84412cs() && axVar.mo56113h()) {
                C58976aa aaVar2 = C58975e.f156826a;
                String str = query.f252770i;
                ((C11897m) axVar.mo56107c()).mo20284e(query);
            }
            return dVar.mo60297gq();
        }
        if (e) {
            C102613g.m170158a(axVar, query);
        }
        return C118826c.f331423b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f286386a.mo60297gq(), C68236af.m98546a(this.f286387c.mo60297gq()), this.f286388d.mo60297gq(), this.f286389e.mo60297gq(), this.f286391g.mo60297gq(), this.f286392h.mo60297gq());
    }
}
