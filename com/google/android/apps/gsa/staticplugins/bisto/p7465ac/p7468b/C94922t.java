package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7468b;

import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.speech.p5208h.C66611ci;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.b.t */
/* compiled from: PG */
final class C94922t implements C70862aj {

    /* renamed from: a */
    final /* synthetic */ long f265527a;

    /* renamed from: b */
    final /* synthetic */ C94925w f265528b;

    public C94922t(C94925w wVar, long j) {
        this.f265528b = wVar;
        this.f265527a = j;
    }

    /* renamed from: a */
    public final void mo20121a() {
        C59104x b = C94925w.f265529a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoProxyHandler");
        ((C59052c) ((C59052c) b).mo56372aa(17596)).mo56386p("on completed");
    }

    /* renamed from: b */
    public final void mo20122b(Throwable th) {
        C59104x c = C94925w.f265529a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "BistoProxyHandler");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(17597)).mo56386p("S3Response error");
        this.f265528b.mo88834e(4);
    }

    /* renamed from: c */
    public final /* synthetic */ void mo20123c(Object obj) {
        C58976aa aaVar = C58975e.f156826a;
        this.f265528b.mo88833d(this.f265527a, ((C66611ci) obj).toByteString());
    }
}
