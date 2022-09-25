package com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.c.f */
/* compiled from: PG */
public final /* synthetic */ class C113309f implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ SettableFuture f313799a;

    public /* synthetic */ C113309f(SettableFuture settableFuture) {
        this.f313799a = settableFuture;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        SettableFuture settableFuture = this.f313799a;
        C58485gu guVar = (C58485gu) obj;
        C59071e eVar = C113318o.f313806a;
        try {
            if (!guVar.isEmpty()) {
                settableFuture.mo57356n(String.valueOf(guVar.get(0)));
            } else {
                settableFuture.mo57356n("unknown");
            }
        } catch (Exception e) {
            settableFuture.mo57357o(e);
            C58976aa aaVar = C58975e.f156826a;
        }
    }
}
