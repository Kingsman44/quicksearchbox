package com.google.android.apps.gsa.staticplugins.p8019j.p8020a;

import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.staticplugins.p8019j.C102560av;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.j.a.aj */
/* compiled from: PG */
public final class C102512aj extends C68247h {

    /* renamed from: a */
    private final C68283d f286111a;

    /* renamed from: c */
    private final C68283d f286112c;

    public C102512aj(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C102512aj.class), aVar);
        this.f286111a = C68236af.m98549d(dVar);
        this.f286112c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        return ((C102560av) list.get(1)).mo93337a((Query) list.get(0));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f286111a.mo60297gq(), this.f286112c.mo60297gq());
    }
}
