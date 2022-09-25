package com.google.android.apps.gsa.staticplugins.paymentsauth.p8670c;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.paymentsauth.c.m */
/* compiled from: PG */
public final /* synthetic */ class C115970m implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C115973p f321582a;

    public /* synthetic */ C115970m(C115973p pVar) {
        this.f321582a = pVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C115973p pVar = this.f321582a;
        Exception exc = (Exception) obj;
        if (!pVar.f321593g) {
            ((C59052c) ((C59052c) ((C59052c) C115973p.f321587a.mo56225c()).mo56382g(exc)).mo56372aa(30218)).mo56386p("Reauth work failure");
            pVar.mo102387e();
        }
    }
}
