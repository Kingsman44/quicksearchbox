package com.google.android.apps.gsa.search.core.p6820r.p6834f;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.search.core.r.f.n */
/* compiled from: PG */
public final class C86444n extends C68247h {

    /* renamed from: a */
    private final C68283d f233617a;

    /* renamed from: c */
    private final C68283d f233618c;

    public C86444n(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C86444n.class), aVar);
        this.f233617a = C68236af.m98549d(dVar);
        this.f233618c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C118826c cVar = (C118826c) list.get(0);
        ((C89859i) list.get(1)).mo83702b(C89849ae.SEARCH_NETWORK_REQUEST_SENT);
        return C118826c.f331423b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f233617a.mo60297gq(), this.f233618c.mo60297gq());
    }
}
