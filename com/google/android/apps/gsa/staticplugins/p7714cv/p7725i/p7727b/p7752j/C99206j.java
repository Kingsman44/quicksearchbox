package com.google.android.apps.gsa.staticplugins.p7714cv.p7725i.p7727b.p7752j;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.cv.i.b.j.j */
/* compiled from: PG */
public final class C99206j extends C68247h {

    /* renamed from: a */
    private final C68283d f277543a;

    /* renamed from: c */
    private final C68283d f277544c;

    /* renamed from: d */
    private final C68283d f277545d;

    /* renamed from: e */
    private final C68283d f277546e;

    public C99206j(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4) {
        super(aVar2, new C68277d(C99206j.class), aVar);
        this.f277543a = C68236af.m98549d(dVar);
        this.f277544c = C68236af.m98549d(dVar2);
        this.f277545d = C68236af.m98549d(dVar3);
        this.f277546e = C68236af.m98549d(dVar4);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        Query query = (Query) list.get(0);
        C68283d dVar = this.f277544c;
        C68283d dVar2 = this.f277545d;
        if (!((C86124t) list.get(1)).mo79746e(C90086ek.f250337bI) || !query.mo84412cs()) {
            return dVar2.mo60297gq();
        }
        return dVar.mo60297gq();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f277543a.mo60297gq(), this.f277546e.mo60297gq());
    }
}
