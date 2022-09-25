package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8080a;

import com.google.android.apps.gsa.search.core.p6519al.p6737i.C85494a;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.C90918bo;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.a.x */
/* compiled from: PG */
public final class C103644x extends C68247h {

    /* renamed from: a */
    private final C68283d f288704a;

    /* renamed from: c */
    private final C68283d f288705c;

    /* renamed from: d */
    private final C68283d f288706d;

    /* renamed from: e */
    private final C69464a f288707e;

    public C103644x(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C69464a aVar3) {
        super(aVar2, new C68277d(C103644x.class), aVar);
        this.f288704a = C68236af.m98549d(dVar);
        this.f288705c = C68236af.m98549d(dVar2);
        this.f288706d = C68236af.m98549d(dVar3);
        this.f288707e = aVar3;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C85494a aVar = (C85494a) list.get(0);
        Query query = (Query) list.get(1);
        C89356b bVar = (C89356b) list.get(2);
        if (((C90021c) this.f288707e.mo17428b()).mo79746e(C90126fx.f251737oU)) {
            return C90918bo.m148514a(aVar.mo79016a(query));
        }
        return C90918bo.m148514a(aVar.mo79017b(query, bVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f288704a.mo60297gq(), this.f288705c.mo60297gq(), this.f288706d.mo60297gq());
    }
}
