package com.google.android.apps.gsa.staticplugins.p7773dc.p7774a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.base.C58833ax;
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

/* renamed from: com.google.android.apps.gsa.staticplugins.dc.a.m */
/* compiled from: PG */
public final class C99339m extends C68247h {

    /* renamed from: a */
    private final C68283d f277963a;

    /* renamed from: c */
    private final C68283d f277964c;

    /* renamed from: d */
    private final C68283d f277965d;

    public C99339m(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C99339m.class), aVar);
        this.f277963a = C68236af.m98549d(dVar);
        this.f277964c = C68236af.m98549d(dVar2);
        this.f277965d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        Query query = (Query) list.get(0);
        C99327a aVar = (C99327a) list.get(2);
        C58833ax b = C57940c.m88575b((C68282c) list.get(1));
        if (b.mo56113h()) {
            return aVar.mo91413a((Throwable) b.mo56107c());
        }
        return C118826c.f331423b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f277963a.mo60297gq(), C68236af.m98546a(this.f277964c.mo60297gq()), this.f277965d.mo60297gq());
    }
}
