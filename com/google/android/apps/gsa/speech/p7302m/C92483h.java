package com.google.android.apps.gsa.speech.p7302m;

import android.accounts.Account;
import com.google.android.apps.gsa.p6487s3.C84335x;
import com.google.android.apps.gsa.p6487s3.producers.C84310i;
import com.google.android.apps.gsa.search.core.p6519al.p6656cl.C85133a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.gsa.speech.helper.C92302a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.speech.p5208h.C66595bu;

/* renamed from: com.google.android.apps.gsa.speech.m.h */
/* compiled from: PG */
public final class C92483h {

    /* renamed from: a */
    private final C92478c f258078a;

    /* renamed from: b */
    private final C92480e f258079b;

    /* renamed from: c */
    private final C85133a f258080c;

    public C92483h(C92478c cVar, C92480e eVar, C85133a aVar) {
        this.f258078a = cVar;
        this.f258079b = eVar;
        this.f258080c = aVar;
    }

    /* renamed from: a */
    public final void mo87226a(C92485j jVar, Account account, C66595bu buVar) {
        C84310i iVar;
        C92478c cVar = this.f258078a;
        C92480e eVar = this.f258079b;
        C92485j jVar2 = C92485j.MULTI_DEVICE_SELECTION_REQUEST;
        int ordinal = jVar.ordinal();
        if (ordinal == 0) {
            iVar = (C84310i) eVar.f258066e.mo27525b();
        } else if (ordinal != 1) {
            C59104x d = C92480e.f258062a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "SpeechS3ReqUtils");
            ((C59052c) ((C59052c) d).mo56372aa(12823)).mo56389s("Request mutator not found for type: %s", jVar);
            iVar = (C84310i) eVar.f258066e.mo27525b();
        } else {
            iVar = (C92477b) eVar.f258067f.mo27525b();
        }
        C84310i iVar2 = iVar;
        C90931ca caVar = (C90931ca) cVar.f258057a.mo17428b();
        caVar.getClass();
        C92302a aVar = (C92302a) cVar.f258058b.mo17428b();
        aVar.getClass();
        C89994f fVar = (C89994f) cVar.f258059c.mo17428b();
        fVar.getClass();
        C86124t tVar = (C86124t) cVar.f258060d.mo17428b();
        tVar.getClass();
        C92480e eVar2 = (C92480e) cVar.f258061e.mo17428b();
        eVar2.getClass();
        jVar.getClass();
        iVar2.getClass();
        C92481f fVar2 = new C92481f(caVar, aVar, fVar, tVar, eVar2, jVar, iVar2, account, buVar);
        C85133a aVar2 = this.f258080c;
        C58976aa aaVar = C58975e.f156826a;
        aVar2.mo78729c(new C92482g(), fVar2, new C84335x());
    }
}
