package com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8538c;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121492b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.c.u */
/* compiled from: PG */
public final /* synthetic */ class C111990u implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C111993x f311118a;

    /* renamed from: b */
    public final /* synthetic */ C113405ep f311119b;

    /* renamed from: c */
    public final /* synthetic */ C121492b f311120c;

    public /* synthetic */ C111990u(C111993x xVar, C113405ep epVar, C121492b bVar) {
        this.f311118a = xVar;
        this.f311119b = epVar;
        this.f311120c = bVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C111993x xVar = this.f311118a;
        C113405ep epVar = this.f311119b;
        C121492b bVar = this.f311120c;
        TimeoutException timeoutException = (TimeoutException) obj;
        C59104x c = C111993x.f311124a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "DataSourceManager");
        ((C59052c) ((C59052c) c).mo56372aa(27461)).mo56386p("timeout loading sources");
        xVar.f311139p.mo99333b(epVar, 2);
        bVar.mo105192e();
    }
}
