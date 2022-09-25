package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8563g;

import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48635bx;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.g.cl */
/* compiled from: PG */
public final /* synthetic */ class C112521cl implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C112548dl f312086a;

    public /* synthetic */ C112521cl(C112548dl dlVar) {
        this.f312086a = dlVar;
    }

    public final void run() {
        C112548dl dlVar = this.f312086a;
        C58976aa aaVar = C58975e.f156826a;
        C58800sl lA = dlVar.f312132d.entrySet().iterator();
        while (lA.hasNext()) {
            C112547dk dkVar = (C112547dk) ((Map.Entry) lA.next()).getValue();
            synchronized (dkVar) {
                dkVar.mo99573c();
                dkVar.f312124c = C48635bx.f125704d;
            }
        }
    }
}
