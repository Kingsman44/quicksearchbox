package com.google.android.apps.gsa.staticplugins.p8019j.p8020a;

import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.staticplugins.p8019j.C102550al;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.p4460h.p4461a.C58009ae;
import dagger.p5294a.C68219e;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.j.a.ad */
/* compiled from: PG */
public final class C102506ad extends C68247h {

    /* renamed from: a */
    private final C68283d f286095a;

    /* renamed from: c */
    private final C68283d f286096c;

    /* renamed from: d */
    private final C68283d f286097d;

    /* renamed from: e */
    private final C69464a f286098e;

    /* renamed from: f */
    private final C69464a f286099f;

    public C102506ad(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C69464a aVar3, C69464a aVar4) {
        super(aVar2, new C68277d(C102506ad.class), aVar);
        this.f286095a = C68236af.m98549d(dVar);
        this.f286096c = C68236af.m98549d(dVar2);
        this.f286097d = C68236af.m98549d(dVar3);
        this.f286098e = aVar3;
        this.f286099f = aVar4;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C102550al alVar = (C102550al) list.get(2);
        return ((C58009ae) list.get(0)).mo54597a(new C102528p(C68219e.m98518a(this.f286098e), C68219e.m98518a(this.f286099f), (Query) list.get(1)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f286095a.mo60297gq(), this.f286096c.mo60297gq(), this.f286097d.mo60297gq());
    }
}
