package com.google.android.apps.gsa.staticplugins.p8019j;

import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.j.h */
/* compiled from: PG */
public final class C102585h extends C68247h {

    /* renamed from: a */
    private final C68283d f286293a;

    /* renamed from: c */
    private final C68283d f286294c;

    /* renamed from: d */
    private final C68283d f286295d;

    public C102585h(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C102585h.class), aVar);
        this.f286293a = C68236af.m98549d(dVar);
        this.f286294c = C68236af.m98549d(dVar2);
        this.f286295d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        return ((C22871g) list.get(0)).mo28202b("build assistantRequest", new C102583f((C102588k) list.get(1), (Query) list.get(2)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f286293a.mo60297gq(), this.f286294c.mo60297gq(), this.f286295d.mo60297gq());
    }
}
