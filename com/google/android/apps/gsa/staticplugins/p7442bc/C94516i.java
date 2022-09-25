package com.google.android.apps.gsa.staticplugins.p7442bc;

import com.google.android.apps.gsa.search.core.p6816p.C86246cb;
import com.google.android.apps.gsa.search.shared.api.UriRequest;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.logger.C89957y;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.bc.i */
/* compiled from: PG */
public final class C94516i extends C68247h {

    /* renamed from: a */
    private final C68283d f264337a;

    /* renamed from: c */
    private final C68283d f264338c;

    /* renamed from: d */
    private final C68283d f264339d;

    /* renamed from: e */
    private final C68283d f264340e;

    /* renamed from: f */
    private final C68283d f264341f;

    public C94516i(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5) {
        super(aVar2, new C68277d(C94516i.class), aVar);
        this.f264337a = C68236af.m98549d(dVar);
        this.f264338c = C68236af.m98549d(dVar2);
        this.f264339d = C68236af.m98549d(dVar3);
        this.f264340e = C68236af.m98549d(dVar4);
        this.f264341f = C68236af.m98549d(dVar5);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C68283d dVar = this.f264337a;
        UriRequest uriRequest = (UriRequest) list.get(3);
        ((C86246cb) list.get(0)).mo79931av(((C21370a) list.get(1)).mo26870b());
        C89949q.m146526k(C89957y.m146539b(C39191a.m68623b(((Query) list.get(2)).f252749G)));
        C89949q.m146526k(C89957y.m146540c(6));
        C89949q.m146523g(19);
        return dVar.mo60297gq();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f264338c.mo60297gq(), this.f264339d.mo60297gq(), this.f264340e.mo60297gq(), this.f264341f.mo60297gq());
    }
}
