package com.google.android.apps.gsa.staticplugins.fedass.ipc.service;

import com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100742h;
import com.google.android.apps.gsa.staticplugins.fedass.p7940b.C100771b;
import com.google.android.apps.gsa.staticplugins.fedass.p7940b.C100772c;
import com.google.android.apps.gsa.staticplugins.fedass.p7940b.C100777h;
import com.google.android.apps.gsa.staticplugins.fedass.p7940b.C100784o;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.ipc.service.c */
/* compiled from: PG */
public final /* synthetic */ class C100990c implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C101012y f282065a;

    /* renamed from: b */
    public final /* synthetic */ String f282066b;

    public /* synthetic */ C100990c(C101012y yVar, String str) {
        this.f282065a = yVar;
        this.f282066b = str;
    }

    public final C60870cx apply(Object obj) {
        C101012y yVar = this.f282065a;
        String str = this.f282066b;
        Void voidR = (Void) obj;
        C100777h hVar = yVar.f282111h;
        if (!hVar.mo92046b()) {
            return C60866ct.f164955a;
        }
        C100742h f = C100742h.m166944c(((C100784o) hVar.f281683b.mo17428b()).mo92047a(str)).mo92036f(new C100771b(hVar));
        f.mo92038i(C100772c.f281677a);
        return f.f281631a;
    }
}
