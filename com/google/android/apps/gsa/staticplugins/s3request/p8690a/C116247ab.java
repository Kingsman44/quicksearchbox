package com.google.android.apps.gsa.staticplugins.s3request.p8690a;

import com.google.android.apps.gsa.search.core.google.C85929cw;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.p7142d.C90536a;
import com.google.android.apps.gsa.speech.p7298l.C92473f;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.p4460h.p4461a.C58009ae;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.s3request.a.ab */
/* compiled from: PG */
public final class C116247ab extends C68247h {

    /* renamed from: a */
    private final C68283d f322337a;

    /* renamed from: c */
    private final C68283d f322338c;

    /* renamed from: d */
    private final C68283d f322339d;

    /* renamed from: e */
    private final C68283d f322340e;

    /* renamed from: f */
    private final C68283d f322341f;

    public C116247ab(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5) {
        super(aVar2, new C68277d(C116247ab.class), aVar);
        this.f322337a = C68236af.m98549d(dVar);
        this.f322338c = C68236af.m98549d(dVar2);
        this.f322339d = C68236af.m98549d(dVar3);
        this.f322340e = C68236af.m98549d(dVar4);
        this.f322341f = C68236af.m98549d(dVar5);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        Query query = (Query) list.get(1);
        C90021c cVar = (C90021c) list.get(2);
        C85929cw cwVar = (C85929cw) list.get(3);
        C58009ae aeVar = (C58009ae) list.get(4);
        if (((C92473f) list.get(0)).f258014b != C90536a.CLOCKWORK || (query.mo84399cf() && query.mo84364bx("android.opa.extra.CONVERSATION_DELTA"))) {
            return C60856cj.m92900i(C58836b.f156633a);
        }
        return aeVar.mo54597a(new C116330z(cwVar, query));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f322337a.mo60297gq(), this.f322338c.mo60297gq(), this.f322339d.mo60297gq(), this.f322340e.mo60297gq(), this.f322341f.mo60297gq());
    }
}
