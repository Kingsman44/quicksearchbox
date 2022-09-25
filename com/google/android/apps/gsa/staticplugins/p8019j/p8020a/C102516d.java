package com.google.android.apps.gsa.staticplugins.p8019j.p8020a;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.j.a.d */
/* compiled from: PG */
public final class C102516d extends C68247h {

    /* renamed from: a */
    private final C68283d f286118a;

    /* renamed from: c */
    private final C68283d f286119c;

    /* renamed from: d */
    private final C68283d f286120d;

    public C102516d(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C102516d.class), aVar);
        this.f286118a = C68236af.m98549d(dVar);
        this.f286119c = C68236af.m98549d(dVar2);
        this.f286120d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        Query query = (Query) list.get(1);
        int intValue = ((Integer) list.get(2)).intValue();
        if (((C86124t) list.get(0)).mo79746e(C90014bt.f247055T) && query.mo84403cj() && intValue == 0 && !query.mo84375cH()) {
            query = query.mo84278aO("opa-screenful-user-agent-suffix", "OpaScreenful/0");
        }
        return C60856cj.m92900i(query);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f286118a.mo60297gq(), this.f286119c.mo60297gq(), this.f286120d.mo60297gq());
    }
}
