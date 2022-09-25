package com.google.android.libraries.assistant.auto.tng.media.p1040a.p1044c;

import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15481g;
import com.google.android.libraries.search.assistant.performer.p2757g.p2758a.C36029l;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37258g;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.media.a.c.e */
/* compiled from: PG */
public final class C13928e {

    /* renamed from: a */
    public static final C59071e f42401a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.media.a.c.e");

    /* renamed from: b */
    public final C15481g f42402b;

    /* renamed from: c */
    private final C36029l f42403c;

    /* renamed from: d */
    private final Executor f42404d;

    public C13928e(C15481g gVar, C36029l lVar, Executor executor) {
        this.f42402b = gVar;
        this.f42403c = lVar;
        this.f42404d = executor;
    }

    /* renamed from: a */
    public final void mo21357a(C37252a aVar, Optional optional, Optional optional2) {
        C59104x b = f42401a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "AAMediaAppFlowLogger");
        ((C59052c) ((C59052c) b).mo56372aa(45184)).mo56386p("creating mediaControllerFuture from mediaControllerAccessor#getExistingTopActiveMediaController");
        C60870cx a = this.f42403c.mo39945a();
        C13926c cVar = new C13926c(optional2, optional);
        C60870cx g = C60922j.m93044g(a, C47810es.m84963c(cVar), this.f42404d);
        C13927d dVar = new C13927d(this, aVar);
        C60856cj.m92911t(g, C47810es.m84974n(dVar), this.f42404d);
    }

    /* renamed from: b */
    public final void mo21358b(C37258g gVar) {
        mo21357a(gVar.mo40779c(), Optional.empty(), Optional.empty());
    }

    /* renamed from: c */
    public final void mo21359c(C37258g gVar) {
        mo21357a(gVar.mo40779c(), Optional.empty(), Optional.empty());
    }
}
