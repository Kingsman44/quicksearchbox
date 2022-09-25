package com.google.android.apps.gsa.staticplugins.opa.apa.p8284a.p8287c;

import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.p6519al.p6606bp.p6607a.C84921a;
import com.google.android.apps.gsa.search.core.p6519al.p6723dr.C85422c;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.staticplugins.opa.apa.p8284a.p8286b.C107164b;
import com.google.android.apps.gsa.staticplugins.opa.apa.p8284a.p8286b.C107165c;
import com.google.android.apps.gsa.staticplugins.opa.apa.p8284a.p8286b.C107166d;
import com.google.android.apps.gsa.staticplugins.opa.apa.p8284a.p8286b.C107167e;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.apa.a.c.f */
/* compiled from: PG */
public final class C107193f extends C86734a implements C84921a {

    /* renamed from: a */
    private static final C59071e f298370a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.apa.a.c.f");

    /* renamed from: b */
    private final Optional f298371b;

    public C107193f(Optional optional) {
        super(C118575h.WORKER_APA_HANDOVER, "apahandover");
        this.f298371b = optional;
    }

    /* renamed from: a */
    public final C60870cx mo78591a(Query query, C85422c cVar) {
        if (this.f298371b.isEmpty()) {
            RuntimeException runtimeException = new RuntimeException("Handover from APA is requested, but handover controller is not provided");
            ((C59052c) ((C59052c) ((C59052c) f298370a.mo56225c()).mo56382g(runtimeException)).mo56372aa(23520)).mo56386p("#startApaHandover failed");
            return C60856cj.m92899h(runtimeException);
        }
        C107167e eVar = (C107167e) this.f298371b.get();
        cVar.getClass();
        C69464a aVar = eVar.f298302a;
        C69464a aVar2 = eVar.f298303b;
        C22871g gVar = (C22871g) eVar.f298304c.mo17428b();
        gVar.getClass();
        C107166d dVar = new C107166d(query, cVar, aVar, aVar2, gVar);
        new C90873ag(dVar.f298300e.mo95819b(), dVar.f298299d, "[APA] Handover graph done", new C107164b(dVar)).mo85223a(new C107165c(dVar));
        return C60856cj.m92900i(dVar);
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return true;
    }
}
