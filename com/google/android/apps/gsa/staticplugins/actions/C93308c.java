package com.google.android.apps.gsa.staticplugins.actions;

import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.p6519al.p6574b.C84809b;
import com.google.android.apps.gsa.search.core.p6519al.p6632c.C85048a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6820r.p6821a.p6822a.C86355a;
import com.google.android.apps.gsa.search.core.p6820r.p6821a.p6822a.C86357c;
import com.google.android.apps.gsa.search.core.p6820r.p6821a.p6822a.C86359e;
import com.google.android.apps.gsa.search.core.p6820r.p6821a.p6826e.C86372a;
import com.google.android.apps.gsa.search.core.service.p6842a.p6844b.C86602c;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90851k;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.actions.c */
/* compiled from: PG */
public final class C93308c extends C86734a implements C85048a {

    /* renamed from: a */
    private final C93427w f260208a;

    public C93308c(C93427w wVar) {
        super(C118575h.WORKER_ACTION, "actionrenderer");
        this.f260208a = wVar;
    }

    /* renamed from: a */
    public final C60870cx mo78670a(C58833ax axVar, C86355a aVar, C86357c cVar, C86372a aVar2, C86359e eVar, C89356b bVar) {
        C93427w wVar = this.f260208a;
        C84809b bVar2 = (C84809b) wVar.f260612a.mo17428b();
        bVar2.getClass();
        C86602c cVar2 = (C86602c) wVar.f260613b.mo17428b();
        cVar2.getClass();
        C86124t tVar = (C86124t) wVar.f260614c.mo17428b();
        tVar.getClass();
        bm bmVar = (bm) wVar.f260615d.mo17428b();
        bmVar.getClass();
        C90851k kVar = (C90851k) wVar.f260616e.mo17428b();
        kVar.getClass();
        return C60856cj.m92900i(new C93426v(bVar, axVar, aVar, cVar, aVar2, eVar, bVar2, cVar2, tVar, bmVar, kVar));
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("ActionWorker");
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return true;
    }
}
