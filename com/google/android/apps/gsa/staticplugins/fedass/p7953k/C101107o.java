package com.google.android.apps.gsa.staticplugins.fedass.p7953k;

import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100742h;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.k.o */
/* compiled from: PG */
public final /* synthetic */ class C101107o implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C101077aa f282304a;

    public /* synthetic */ C101107o(C101077aa aaVar) {
        this.f282304a = aaVar;
    }

    public final C60870cx apply(Object obj) {
        Void voidR = (Void) obj;
        C101098f fVar = (C101098f) this.f282304a.f282249f.mo17428b();
        ((C59052c) ((C59052c) C101098f.f282291a.mo56224b()).mo56372aa(19765)).mo56386p("performLogging()");
        C100742h c = C100742h.m166944c(C60866ct.f164955a);
        for (String eVar : ((C86054o) fVar.f282292b.mo27525b()).mo79685s()) {
            c = c.mo92035e(new C101097e(fVar, eVar));
        }
        return c.f281631a;
    }
}
