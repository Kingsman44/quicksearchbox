package com.google.android.apps.gsa.staticplugins.voiceaccess.session.p8789d;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6739j.C85504b;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.voiceaccess.session.d.h */
/* compiled from: PG */
public final class C117649h extends C68247h {

    /* renamed from: a */
    private final C68283d f326565a;

    /* renamed from: c */
    private final C68283d f326566c;

    /* renamed from: d */
    private final C68283d f326567d;

    /* renamed from: e */
    private final C68283d f326568e;

    public C117649h(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4) {
        super(aVar2, new C68277d(C117649h.class), aVar);
        this.f326565a = C68236af.m98549d(dVar);
        this.f326566c = C68236af.m98549d(dVar2);
        this.f326567d = C68236af.m98549d(dVar3);
        this.f326568e = C68236af.m98549d(dVar4);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C68283d dVar = this.f326565a;
        Query query = (Query) list.get(0);
        C85504b bVar = (C85504b) list.get(1);
        C117634ae aeVar = (C117634ae) list.get(2);
        C58976aa aaVar = C58975e.f156826a;
        if (query.equals(Query.f252741b)) {
            return C118826c.f331423b;
        }
        SettableFuture settableFuture = new SettableFuture();
        bVar.mo79025a(query, new C117645d(settableFuture, dVar, aeVar));
        return settableFuture;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f326566c.mo60297gq(), this.f326567d.mo60297gq(), this.f326568e.mo60297gq());
    }
}
