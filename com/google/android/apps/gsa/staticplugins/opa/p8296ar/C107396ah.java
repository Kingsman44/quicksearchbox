package com.google.android.apps.gsa.staticplugins.opa.p8296ar;

import com.google.android.apps.gsa.search.core.p6519al.p6735h.C85493j;
import com.google.assistant.p3803ag.p3804a.p3805a.C48787g;
import com.google.assistant.p3803ag.p3804a.p3805a.C48791k;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ar.ah */
/* compiled from: PG */
final class C107396ah extends C85493j {

    /* renamed from: a */
    private final C107389aa f298900a;

    public C107396ah(C107389aa aaVar) {
        this.f298900a = aaVar;
    }

    /* renamed from: a */
    private static void m178295a(C60870cx cxVar, String str) {
        C60856cj.m92911t(cxVar, new C107395ag(str), C60826bg.f164896a);
    }

    /* renamed from: j */
    public final void mo79011j(C48787g gVar) {
        C59104x b = C107397ai.f298901a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "PAPIclient");
        ((C59052c) ((C59052c) b).mo56372aa(25377)).mo56386p("#onProactiveContentResponse");
        m178295a(this.f298900a.mo96000a(gVar), "onProactiveContentResponse");
    }

    /* renamed from: k */
    public final void mo79012k(C48791k kVar) {
        C59104x b = C107397ai.f298901a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "PAPIclient");
        ((C59052c) ((C59052c) b).mo56372aa(25378)).mo56386p("#onProactiveSyncResponse");
        m178295a(this.f298900a.mo96001b(kVar), "onProactiveSyncResponse");
    }
}
