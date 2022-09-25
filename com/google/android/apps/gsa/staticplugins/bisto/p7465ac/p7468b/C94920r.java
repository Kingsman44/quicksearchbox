package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7468b;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124671cj;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124673cl;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.Callable;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.b.r */
/* compiled from: PG */
public final /* synthetic */ class C94920r implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C94925w f265525a;

    /* renamed from: b */
    public final /* synthetic */ long f265526b;

    public /* synthetic */ C94920r(C94925w wVar, long j) {
        this.f265525a = wVar;
        this.f265526b = j;
    }

    public final Object call() {
        C94925w wVar = this.f265525a;
        long j = this.f265526b;
        C59104x b = C94925w.f265529a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoProxyHandler");
        ((C59052c) ((C59052c) b).mo56372aa(17606)).mo56386p("StartConnection");
        synchronized (wVar) {
            C124671cj cjVar = wVar.f265530b;
            wVar.f265531c = C70876o.m103761b(cjVar.f189039a.mo39510a(C124673cl.m204370h(), cjVar.f189040b), new C94922t(wVar, j), true);
        }
        wVar.f265532d.set(true);
        return C118826c.f331422a;
    }
}
