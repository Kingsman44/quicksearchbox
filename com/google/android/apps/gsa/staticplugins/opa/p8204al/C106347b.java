package com.google.android.apps.gsa.staticplugins.opa.p8204al;

import com.google.android.apps.gsa.search.core.p6519al.p6737i.C85494a;
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

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.al.b */
/* compiled from: PG */
public final class C106347b extends C68247h {

    /* renamed from: a */
    private final C68283d f296687a;

    /* renamed from: c */
    private final C68283d f296688c;

    public C106347b(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C106347b.class), aVar);
        this.f296687a = C68236af.m98549d(dVar);
        this.f296688c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        return C90918bo.m148514a(((C85494a) list.get(0)).mo79016a((Query) list.get(1)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f296687a.mo60297gq(), this.f296688c.mo60297gq());
    }
}
