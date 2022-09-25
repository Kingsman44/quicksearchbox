package com.google.android.apps.gsa.staticplugins.fedass.ipc.service;

import com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100742h;
import com.google.android.apps.gsa.staticplugins.fedass.p7940b.C100773d;
import com.google.android.apps.gsa.staticplugins.fedass.p7940b.C100774e;
import com.google.android.apps.gsa.staticplugins.fedass.p7940b.C100777h;
import com.google.android.apps.gsa.staticplugins.fedass.p7940b.C100784o;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.ipc.service.j */
/* compiled from: PG */
public final /* synthetic */ class C100997j implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C101012y f282080a;

    /* renamed from: b */
    public final /* synthetic */ String f282081b;

    public /* synthetic */ C100997j(C101012y yVar, String str) {
        this.f282080a = yVar;
        this.f282081b = str;
    }

    public final C60870cx apply(Object obj) {
        C101012y yVar = this.f282080a;
        String str = this.f282081b;
        Void voidR = (Void) obj;
        C100777h hVar = yVar.f282111h;
        C59104x b = C100777h.f281682a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "EkhoMaintenance");
        ((C59052c) ((C59052c) b).mo56372aa(19528)).mo56386p("performCacheMaintenance");
        if (!hVar.mo92046b()) {
            return C60866ct.f164955a;
        }
        C100742h f = C100742h.m166944c(((C100784o) hVar.f281683b.mo17428b()).mo92047a(str)).mo92036f(new C100773d(hVar));
        f.mo92038i(C100774e.f281679a);
        return f.f281631a;
    }
}
