package com.google.android.apps.gsa.staticplugins.opa.tapas.framework;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8581e.C113389c;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121492b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.u */
/* compiled from: PG */
public final /* synthetic */ class C112013u implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C111825ap f311179a;

    /* renamed from: b */
    public final /* synthetic */ C113405ep f311180b;

    /* renamed from: c */
    public final /* synthetic */ C121492b f311181c;

    public /* synthetic */ C112013u(C111825ap apVar, C113405ep epVar, C121492b bVar) {
        this.f311179a = apVar;
        this.f311180b = epVar;
        this.f311181c = bVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C111825ap apVar = this.f311179a;
        C113405ep epVar = this.f311180b;
        C121492b bVar = this.f311181c;
        TimeoutException timeoutException = (TimeoutException) obj;
        C59104x c = C111825ap.f310763b.mo56225c();
        c.mo56378ag(C58975e.f156826a, "TapasEngine");
        ((C59052c) ((C59052c) c).mo56372aa(27404)).mo56386p("timeout loading sources");
        apVar.f310789w.mo99333b(epVar, 2);
        ((C113389c) apVar.f310790x.mo27525b()).mo99630e(epVar.mo100016a(), "Sources fetch timed out");
        bVar.mo105192e();
    }
}
