package com.google.android.apps.gsa.p8889z.p8909e.p8910a.p8916f;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6723dr.C85422c;
import com.google.android.apps.gsa.search.core.service.p6842a.p6844b.C86603d;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.z.e.a.f.aa */
/* compiled from: PG */
public final class C118993aa extends C68247h {

    /* renamed from: a */
    private final C68283d f331935a;

    /* renamed from: c */
    private final C68283d f331936c;

    /* renamed from: d */
    private final C68283d f331937d;

    /* renamed from: e */
    private final C68283d f331938e;

    public C118993aa(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4) {
        super(aVar2, new C68277d(C118993aa.class), aVar);
        this.f331935a = C68236af.m98549d(dVar);
        this.f331936c = C68236af.m98549d(dVar2);
        this.f331937d = C68236af.m98549d(dVar3);
        this.f331938e = C68236af.m98549d(dVar4);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C58833ax axVar = (C58833ax) list.get(0);
        C85422c cVar = (C85422c) list.get(1);
        Query query = (Query) list.get(2);
        C86603d dVar = (C86603d) list.get(3);
        if (!query.mo84403cj() || !axVar.mo56113h()) {
            return C118826c.f331423b;
        }
        return dVar.mo54598b(new C119030f(cVar, query, axVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f331935a.mo60297gq(), this.f331936c.mo60297gq(), this.f331937d.mo60297gq(), this.f331938e.mo60297gq());
    }
}
