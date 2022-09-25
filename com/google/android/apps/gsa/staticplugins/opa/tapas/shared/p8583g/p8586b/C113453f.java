package com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8583g.p8586b;

import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.g.b.f */
/* compiled from: PG */
public final class C113453f {

    /* renamed from: a */
    C60870cx f314139a;

    /* renamed from: b */
    final Object f314140b = new Object();

    /* renamed from: c */
    final /* synthetic */ C113454g f314141c;

    public C113453f(C113454g gVar) {
        this.f314141c = gVar;
    }

    /* renamed from: a */
    public final void mo100234a() {
        C58976aa aaVar = C58975e.f156826a;
        synchronized (this.f314140b) {
            C60870cx cxVar = this.f314139a;
            if (cxVar != null) {
                cxVar.cancel(false);
                this.f314139a = null;
            }
        }
    }
}
