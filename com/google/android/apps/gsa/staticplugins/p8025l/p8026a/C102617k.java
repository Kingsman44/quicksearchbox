package com.google.android.apps.gsa.staticplugins.p8025l.p8026a;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6816p.C86232bo;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.p4449cd.C57940c;
import com.google.p4449cd.C57954d;
import dagger.p5295b.C68282c;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.l.a.k */
/* compiled from: PG */
public final class C102617k extends C68247h {

    /* renamed from: a */
    private final C68283d f286393a;

    /* renamed from: c */
    private final C68283d f286394c;

    /* renamed from: d */
    private final C68283d f286395d;

    /* renamed from: e */
    private final C68283d f286396e;

    /* renamed from: f */
    private final C68283d f286397f;

    public C102617k(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5) {
        super(aVar2, new C68277d(C102617k.class), aVar);
        this.f286393a = C68236af.m98549d(dVar);
        this.f286394c = C68236af.m98549d(dVar2);
        this.f286395d = C68236af.m98549d(dVar3);
        this.f286396e = C68236af.m98549d(dVar4);
        this.f286397f = C68236af.m98549d(dVar5);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C68282c cVar = (C68282c) list.get(0);
        C86124t tVar = (C86124t) list.get(1);
        C57954d dVar = (C57954d) list.get(2);
        C58833ax axVar = (C58833ax) list.get(3);
        Query query = (Query) list.get(4);
        if (C57940c.m88582i(cVar)) {
            return C60856cj.m92900i((C86232bo) cVar.mo60292a());
        }
        C58976aa aaVar = C58975e.f156826a;
        if (tVar.mo79746e(C90086ek.f250327az)) {
            C102613g.m170158a(axVar, query);
        }
        return C60846c.m92879h(C60922j.m93045h(C60838bs.m92859i(dVar.f154993a), C102611e.f286380a, C60826bg.f164896a), Exception.class, new C102612f(cVar), C60826bg.f164896a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(C68236af.m98546a(this.f286393a.mo60297gq()), this.f286394c.mo60297gq(), this.f286395d.mo60297gq(), this.f286396e.mo60297gq(), this.f286397f.mo60297gq());
    }
}
