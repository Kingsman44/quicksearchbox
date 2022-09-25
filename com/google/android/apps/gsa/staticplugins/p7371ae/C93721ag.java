package com.google.android.apps.gsa.staticplugins.p7371ae;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6820r.p6821a.p6827f.C86374b;
import com.google.android.apps.gsa.search.core.service.p6842a.p6844b.C86603d;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.ae.ag */
/* compiled from: PG */
public final class C93721ag extends C68247h {

    /* renamed from: a */
    private final C68283d f261551a;

    /* renamed from: c */
    private final C68283d f261552c;

    /* renamed from: d */
    private final C68283d f261553d;

    /* renamed from: e */
    private final C68283d f261554e;

    /* renamed from: f */
    private final C68283d f261555f;

    public C93721ag(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5) {
        super(aVar2, new C68277d(C93721ag.class), aVar);
        this.f261551a = C68236af.m98549d(dVar);
        this.f261552c = C68236af.m98549d(dVar2);
        this.f261553d = C68236af.m98549d(dVar3);
        this.f261554e = C68236af.m98549d(dVar4);
        this.f261555f = C68236af.m98549d(dVar5);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        Query query = (Query) list.get(0);
        boolean booleanValue = ((Boolean) list.get(1)).booleanValue();
        boolean booleanValue2 = ((Boolean) list.get(2)).booleanValue();
        C86374b bVar = (C86374b) list.get(3);
        C86603d dVar = (C86603d) list.get(4);
        if (!booleanValue || !booleanValue2) {
            return C118826c.f331423b;
        }
        return dVar.mo54598b(new C93716ab(bVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f261551a.mo60297gq(), this.f261552c.mo60297gq(), this.f261553d.mo60297gq(), this.f261554e.mo60297gq(), this.f261555f.mo60297gq());
    }
}
