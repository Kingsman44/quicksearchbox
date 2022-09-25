package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7468b;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.Callable;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.b.p */
/* compiled from: PG */
public final /* synthetic */ class C94918p implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C94925w f265522a;

    public /* synthetic */ C94918p(C94925w wVar) {
        this.f265522a = wVar;
    }

    public final Object call() {
        C94925w wVar = this.f265522a;
        C59104x b = C94925w.f265529a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoProxyHandler");
        ((C59052c) ((C59052c) b).mo56372aa(17603)).mo56386p("Ending connection");
        synchronized (wVar) {
            C70862aj ajVar = wVar.f265531c;
            if (ajVar != null) {
                ajVar.mo20121a();
                wVar.f265531c = null;
            }
        }
        wVar.f265532d.set(false);
        return C118826c.f331422a;
    }
}
