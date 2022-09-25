package com.google.android.apps.gsa.store;

import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.store.l */
/* compiled from: PG */
public final class C118321l extends C68247h {

    /* renamed from: a */
    private final C68283d f328440a;

    /* renamed from: c */
    private final C68283d f328441c;

    public C118321l(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C118321l.class), aVar);
        this.f328440a = C68236af.m98549d(dVar);
        this.f328441c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C118312c cVar = (C118312c) list.get(0);
        List<C118332u> list2 = (List) list.get(1);
        if (list2.isEmpty()) {
            return C60856cj.m92900i(true);
        }
        C118316g c = cVar.mo91759c();
        for (C118332u uVar : list2) {
            c.mo103661b(uVar.f328461b);
        }
        return cVar.mo91762h(c.mo103660a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f328440a.mo60297gq(), this.f328441c.mo60297gq());
    }
}
