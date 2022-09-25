package com.google.android.apps.gsa.staticplugins.fedass.p7953k;

import android.accounts.Account;
import com.google.android.apps.gsa.shared.p7066m.C89978aq;
import com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100742h;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.k.ak */
/* compiled from: PG */
public final /* synthetic */ class C101087ak implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C101092ap f282269a;

    public /* synthetic */ C101087ak(C101092ap apVar) {
        this.f282269a = apVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C101092ap apVar = this.f282269a;
        if (!apVar.f282278b.mo79746e(C89978aq.f246606e)) {
            ((C59052c) ((C59052c) C101092ap.f282277a.mo56224b()).mo56372aa(19797)).mo56386p("unified opt in is not enabled. no-op()");
            return C60866ct.f164955a;
        }
        ((C59052c) ((C59052c) C101092ap.f282277a.mo56224b()).mo56372aa(19796)).mo56386p("syncServerSettings");
        C100742h c = C100742h.m166944c(C60866ct.f164955a);
        for (Account account : apVar.f282281e.mo79684r()) {
            c = c.mo92035e(new C101091ao(apVar, account)).mo92035e(new C101080ad(apVar, account));
        }
        return c.f281631a;
    }
}
