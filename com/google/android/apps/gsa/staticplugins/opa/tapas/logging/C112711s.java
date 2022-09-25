package com.google.android.apps.gsa.staticplugins.opa.tapas.logging;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111255r;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.logging.s */
/* compiled from: PG */
public final /* synthetic */ class C112711s implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C112665ac f312452a;

    public /* synthetic */ C112711s(C112665ac acVar) {
        this.f312452a = acVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C112665ac acVar = this.f312452a;
        Exception exc = (Exception) obj;
        C112665ac.f312274b.mo105240i("logging_request_failed");
        ((C59052c) ((C59052c) ((C59052c) C112665ac.f312273a.mo56224b()).mo56382g(exc)).mo56372aa(27508)).mo56386p("Server-side logging request failed");
        acVar.f312283k.mo99076a(C111255r.CORTEX_LOG, String.format("Server-side logging request failed: %s", new Object[]{exc}));
    }
}
