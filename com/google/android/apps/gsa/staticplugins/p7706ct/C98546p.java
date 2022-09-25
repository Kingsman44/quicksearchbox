package com.google.android.apps.gsa.staticplugins.p7706ct;

import com.google.android.apps.gsa.g.f.b;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.p4460h.p4461a.C58009ae;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.ct.p */
/* compiled from: PG */
public final class C98546p extends C68247h {

    /* renamed from: a */
    private final C68283d f275176a;

    /* renamed from: c */
    private final C68283d f275177c;

    /* renamed from: d */
    private final C68283d f275178d;

    /* renamed from: e */
    private final C68283d f275179e;

    /* renamed from: f */
    private final C68283d f275180f;

    /* renamed from: g */
    private final C68283d f275181g;

    /* renamed from: h */
    private final C68283d f275182h;

    public C98546p(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5, C68283d dVar6, C68283d dVar7) {
        super(aVar2, new C68277d(C98546p.class), aVar);
        this.f275176a = C68236af.m98549d(dVar);
        this.f275177c = C68236af.m98549d(dVar2);
        this.f275178d = C68236af.m98549d(dVar3);
        this.f275179e = C68236af.m98549d(dVar4);
        this.f275180f = C68236af.m98549d(dVar5);
        this.f275181g = C68236af.m98549d(dVar6);
        this.f275182h = C68236af.m98549d(dVar7);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C58009ae aeVar = (C58009ae) list.get(0);
        C98555y yVar = (C98555y) list.get(1);
        b bVar = (b) list.get(2);
        Query query = (Query) list.get(3);
        C58833ax axVar = (C58833ax) list.get(4);
        boolean booleanValue = ((Boolean) list.get(5)).booleanValue();
        C86124t tVar = (C86124t) list.get(6);
        if (bVar == b.a) {
            return C60856cj.m92900i(C58836b.f156633a);
        }
        return aeVar.mo54597a(new C98544n(yVar, query, bVar, axVar, booleanValue, tVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f275176a.mo60297gq(), this.f275177c.mo60297gq(), this.f275178d.mo60297gq(), this.f275179e.mo60297gq(), this.f275180f.mo60297gq(), this.f275181g.mo60297gq(), this.f275182h.mo60297gq());
    }
}
