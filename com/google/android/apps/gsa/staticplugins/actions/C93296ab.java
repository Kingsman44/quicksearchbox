package com.google.android.apps.gsa.staticplugins.actions;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6816p.C86247cc;
import com.google.android.apps.gsa.search.core.p6820r.p6821a.p6826e.C86372a;
import com.google.android.apps.gsa.search.shared.actions.ActionData;
import com.google.android.apps.gsa.shared.search.Query;
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

/* renamed from: com.google.android.apps.gsa.staticplugins.actions.ab */
/* compiled from: PG */
public final class C93296ab extends C68247h {

    /* renamed from: a */
    private final C68283d f260181a;

    /* renamed from: c */
    private final C68283d f260182c;

    /* renamed from: d */
    private final C68283d f260183d;

    /* renamed from: e */
    private final C68283d f260184e;

    public C93296ab(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4) {
        super(aVar2, new C68277d(C93296ab.class), aVar);
        this.f260181a = C68236af.m98549d(dVar);
        this.f260182c = C68236af.m98549d(dVar2);
        this.f260183d = C68236af.m98549d(dVar3);
        this.f260184e = C68236af.m98549d(dVar4);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        Query query = (Query) list.get(0);
        ActionData actionData = (ActionData) list.get(1);
        C58833ax axVar = (C58833ax) list.get(2);
        C86372a aVar = (C86372a) list.get(3);
        if ((!axVar.mo56113h() || ((C86247cc) axVar.mo56107c()).f233136e == null) && !query.mo84426dG() && query.mo84321bF() && query.mo84425dF() && actionData != null && !actionData.mo81094f()) {
            C58976aa aaVar = C58975e.f156826a;
            aVar.mo80144a(query);
        }
        return C60856cj.m92900i(C118826c.f331422a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f260181a.mo60297gq(), this.f260182c.mo60297gq(), this.f260183d.mo60297gq(), this.f260184e.mo60297gq());
    }
}
