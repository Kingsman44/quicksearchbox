package com.google.android.apps.gsa.search.core.p6820r.p6834f;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.search.core.r.f.l */
/* compiled from: PG */
public final class C86442l extends C68247h {

    /* renamed from: a */
    private final C68283d f233613a;

    /* renamed from: c */
    private final C68283d f233614c;

    /* renamed from: d */
    private final C68283d f233615d;

    public C86442l(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C86442l.class), aVar);
        this.f233613a = C68236af.m98549d(dVar);
        this.f233614c = C68236af.m98549d(dVar2);
        this.f233615d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C118826c cVar = (C118826c) list.get(0);
        C89856f fVar = new C89856f();
        fVar.f246201a = C89849ae.SEARCH_RESULT_FETCH_COMPLETE;
        fVar.mo83701c("rId", Long.toString(((Query) list.get(2)).f252749G));
        ((C89859i) list.get(1)).mo74236a(fVar.mo83699a());
        return C60856cj.m92900i(C118826c.f331422a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f233613a.mo60297gq(), this.f233614c.mo60297gq(), this.f233615d.mo60297gq());
    }
}
