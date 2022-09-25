package com.google.android.apps.gsa.staticplugins.p7773dc.p7776c;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.base.C58838bb;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.dc.c.e */
/* compiled from: PG */
public final class C99349e extends C68247h {

    /* renamed from: a */
    private final C68283d f277979a;

    /* renamed from: c */
    private final C68283d f277980c;

    /* renamed from: d */
    private final C68283d f277981d;

    public C99349e(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C99349e.class), aVar);
        this.f277979a = C68236af.m98549d(dVar);
        this.f277980c = C68236af.m98549d(dVar2);
        this.f277981d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C118826c cVar = (C118826c) list.get(2);
        C58838bb.m90884s(((SettableFuture) list.get(0)).mo57356n((Query) list.get(1)), "Prewarming query future is already set");
        return C60856cj.m92900i(C118826c.f331422a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f277979a.mo60297gq(), this.f277980c.mo60297gq(), this.f277981d.mo60297gq());
    }
}
