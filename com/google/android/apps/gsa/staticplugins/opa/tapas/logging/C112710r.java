package com.google.android.apps.gsa.staticplugins.opa.tapas.logging;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111255r;
import com.google.assistant.p3858ar.p3859a.C49728r;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.logging.r */
/* compiled from: PG */
public final /* synthetic */ class C112710r implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C112665ac f312451a;

    public /* synthetic */ C112710r(C112665ac acVar) {
        this.f312451a = acVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C112665ac acVar = this.f312451a;
        C49728r rVar = (C49728r) obj;
        C112665ac.f312274b.mo105240i("logging_request_succeeded");
        ((C59052c) ((C59052c) C112665ac.f312273a.mo56224b()).mo56372aa(27507)).mo56386p("Server-side logging request succeeded");
        acVar.f312283k.mo99076a(C111255r.CORTEX_LOG, "Server-side logging request succeeded");
    }
}
