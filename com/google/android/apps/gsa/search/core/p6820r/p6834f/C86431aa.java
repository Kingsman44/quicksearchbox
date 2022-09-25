package com.google.android.apps.gsa.search.core.p6820r.p6834f;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.corpora.C85753b;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.p4460h.C58003a;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.search.core.r.f.aa */
/* compiled from: PG */
public final class C86431aa extends C68247h {

    /* renamed from: a */
    private final C68283d f233592a;

    /* renamed from: c */
    private final C68283d f233593c;

    public C86431aa(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C86431aa.class), aVar);
        this.f233592a = C68236af.m98549d(dVar);
        this.f233593c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C85753b bVar = (C85753b) list.get(0);
        C58003a aVar = (C58003a) list.get(1);
        if (bVar.f231874a.isDone()) {
            return C118826c.f331423b;
        }
        return C60846c.m92879h(aVar.mo54593a(new C86455y(bVar), 5000, TimeUnit.MILLISECONDS), Exception.class, new C86456z(), C60826bg.f164896a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f233592a.mo60297gq(), this.f233593c.mo60297gq());
    }
}
