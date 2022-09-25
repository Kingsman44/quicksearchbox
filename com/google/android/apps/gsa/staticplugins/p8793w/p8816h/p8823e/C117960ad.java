package com.google.android.apps.gsa.staticplugins.p8793w.p8816h.p8823e;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6606bp.C85005h;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.assistant.p3897e.p3910e.p3911a.C51195j;
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

/* renamed from: com.google.android.apps.gsa.staticplugins.w.h.e.ad */
/* compiled from: PG */
public final class C117960ad extends C68247h {

    /* renamed from: a */
    private final C68283d f327387a;

    /* renamed from: c */
    private final C68283d f327388c;

    /* renamed from: d */
    private final C68283d f327389d;

    public C117960ad(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C117960ad.class), aVar);
        this.f327387a = C68236af.m98549d(dVar);
        this.f327388c = C68236af.m98549d(dVar2);
        this.f327389d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        Query query = (Query) list.get(0);
        C68282c cVar = (C68282c) list.get(1);
        C85005h hVar = (C85005h) list.get(2);
        if (C57940c.m88583j(cVar)) {
            C58976aa aaVar = C58975e.f156826a;
            hVar.mo78641z((C51195j) ((C58833ax) cVar.mo60292a()).mo56107c(), query);
        }
        return C60856cj.m92900i(C118826c.f331422a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f327387a.mo60297gq(), C68236af.m98546a(this.f327388c.mo60297gq()), this.f327389d.mo60297gq());
    }
}
