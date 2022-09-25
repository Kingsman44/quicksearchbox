package com.google.android.apps.gsa.store;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.p4460h.p4461a.C58009ae;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import java.util.Set;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.store.n */
/* compiled from: PG */
public final class C118323n extends C68247h {

    /* renamed from: a */
    private final C68283d f328445a;

    /* renamed from: c */
    private final C68283d f328446c;

    /* renamed from: d */
    private final C68283d f328447d;

    /* renamed from: e */
    private final C68283d f328448e;

    /* renamed from: f */
    private final C68283d f328449f;

    public C118323n(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5) {
        super(aVar2, new C68277d(C118323n.class), aVar);
        this.f328445a = C68236af.m98549d(dVar);
        this.f328446c = C68236af.m98549d(dVar2);
        this.f328447d = C68236af.m98549d(dVar3);
        this.f328448e = C68236af.m98549d(dVar4);
        this.f328449f = C68236af.m98549d(dVar5);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C118312c cVar = (C118312c) list.get(1);
        List list2 = (List) list.get(2);
        Set set = (Set) list.get(3);
        C58009ae aeVar = (C58009ae) list.get(4);
        if (!((Boolean) list.get(0)).booleanValue() || list2.isEmpty() || set.isEmpty()) {
            return C60856cj.m92900i(C118826c.f331422a);
        }
        return aeVar.mo54598b(new C118317h(set));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f328445a.mo60297gq(), this.f328446c.mo60297gq(), this.f328447d.mo60297gq(), this.f328448e.mo60297gq(), this.f328449f.mo60297gq());
    }
}
