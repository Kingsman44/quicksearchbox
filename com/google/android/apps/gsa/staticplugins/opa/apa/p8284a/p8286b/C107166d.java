package com.google.android.apps.gsa.staticplugins.opa.apa.p8284a.p8286b;

import com.google.android.apps.gsa.binaries.satin.app.C73977cn;
import com.google.android.apps.gsa.binaries.satin.app.cp;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.p6505af.p6506a.C84466a;
import com.google.android.apps.gsa.search.core.p6519al.p6723dr.C85421b;
import com.google.android.apps.gsa.search.core.p6519al.p6723dr.C85422c;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.C60537to;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5294a.C68225k;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.apa.a.b.d */
/* compiled from: PG */
public final class C107166d implements C85421b {

    /* renamed from: a */
    public static final C59071e f298296a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.apa.a.b.d");

    /* renamed from: b */
    public final Query f298297b;

    /* renamed from: c */
    public final C85422c f298298c;

    /* renamed from: d */
    public final C22871g f298299d;

    /* renamed from: e */
    public final C107168f f298300e;

    /* renamed from: f */
    private final C89356b f298301f;

    public C107166d(Query query, C85422c cVar, C69464a aVar, C69464a aVar2, C22871g gVar) {
        this.f298297b = query;
        this.f298298c = cVar;
        this.f298299d = gVar;
        C89356b b = ((C84466a) aVar.mo17428b()).mo78026b("ApaHandoverGraph", C118575h.GRAPH_APA_HANDOVER, C118575h.GRAPH_APA_HANDOVER);
        this.f298301f = b;
        C73977cn cnVar = (C73977cn) aVar2.mo17428b();
        cVar.getClass();
        cnVar.f205865c = cVar;
        cnVar.f205866d = b;
        query.getClass();
        cnVar.f205867e = query;
        C68225k.m98529a(cnVar.f205865c, C85422c.class);
        C68225k.m98529a(cnVar.f205866d, C89356b.class);
        C68225k.m98529a(cnVar.f205867e, Query.class);
        this.f298300e = new cp(cnVar.f205863a, cnVar.f205864b, cnVar.f205865c, cnVar.f205866d, cnVar.f205867e);
    }

    /* renamed from: a */
    public final C60870cx mo78931a(C60537to toVar, boolean z) {
        this.f298300e.mo95819b().cancel(false);
        return this.f298301f.mo83286e().mo54566a();
    }

    /* renamed from: b */
    public final void mo78932b() {
    }

    /* renamed from: c */
    public final boolean mo78933c(Query query) {
        return this.f298297b.mo84383cP(query);
    }

    /* renamed from: d */
    public final boolean mo78934d() {
        return this.f298300e.mo95819b().isDone();
    }
}
