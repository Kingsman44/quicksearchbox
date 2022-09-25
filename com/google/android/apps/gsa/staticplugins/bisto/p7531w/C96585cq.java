package com.google.android.apps.gsa.staticplugins.bisto.p7531w;

import com.google.android.libraries.gsa.p1876k.C22870f;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.w.cq */
/* compiled from: PG */
public final /* synthetic */ class C96585cq implements C22870f {

    /* renamed from: a */
    public final /* synthetic */ C96586cr f270190a;

    public /* synthetic */ C96585cq(C96586cr crVar) {
        this.f270190a = crVar;
    }

    public final void run() {
        C96586cr crVar = this.f270190a;
        synchronized (crVar.f270192c) {
            C58976aa aaVar = C58975e.f156826a;
            crVar.f270192c.mo90262j(new TimeoutException("Timed out waiting for response"));
        }
    }
}
