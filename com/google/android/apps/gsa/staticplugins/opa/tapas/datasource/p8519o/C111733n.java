package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8519o;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121492b;
import com.google.common.p4526f.C59052c;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.o.n */
/* compiled from: PG */
public final /* synthetic */ class C111733n implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C121492b f310580a;

    public /* synthetic */ C111733n(C121492b bVar) {
        this.f310580a = bVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C121492b bVar = this.f310580a;
        TimeoutException timeoutException = (TimeoutException) obj;
        ((C59052c) ((C59052c) C111739t.f310591a.mo56225c()).mo56372aa(27292)).mo56386p("Timeout getting response from Tapas Server");
        bVar.mo105192e();
    }
}
