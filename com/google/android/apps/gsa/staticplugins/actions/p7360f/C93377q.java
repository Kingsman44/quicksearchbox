package com.google.android.apps.gsa.staticplugins.actions.p7360f;

import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.base.C58833ax;
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

/* renamed from: com.google.android.apps.gsa.staticplugins.actions.f.q */
/* compiled from: PG */
public final class C93377q extends C68247h {

    /* renamed from: a */
    private final C68283d f260434a;

    /* renamed from: c */
    private final C69464a f260435c;

    /* renamed from: d */
    private final C68283d f260436d;

    /* renamed from: e */
    private final C68283d f260437e;

    public C93377q(C69464a aVar, C69464a aVar2, C68283d dVar, C69464a aVar3, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C93377q.class), aVar);
        this.f260434a = C68236af.m98549d(dVar);
        this.f260435c = aVar3;
        this.f260436d = C68236af.m98549d(dVar2);
        this.f260437e = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        return ((C58009ae) list.get(0)).mo54597a(new C93376p((C58833ax) list.get(1), C68219e.m98518a(this.f260435c), (Query) list.get(2)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f260434a.mo60297gq(), this.f260436d.mo60297gq(), this.f260437e.mo60297gq());
    }
}
