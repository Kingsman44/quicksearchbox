package com.google.android.apps.gsa.staticplugins.paymentsauth.p8670c;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.paymentsauth.c.o */
/* compiled from: PG */
public final /* synthetic */ class C115972o implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C115973p f321586a;

    public /* synthetic */ C115972o(C115973p pVar) {
        this.f321586a = pVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C115973p pVar = this.f321586a;
        Exception exc = (Exception) obj;
        if (!pVar.f321593g) {
            ((C59052c) ((C59052c) ((C59052c) C115973p.f321587a.mo56225c()).mo56382g(exc)).mo56372aa(30215)).mo56386p("Exception retrieving auth token, can't do reauth");
            pVar.mo102387e();
        }
    }
}
