package com.google.android.apps.gsa.staticplugins.p7441bb;

import com.google.android.apps.gsa.shared.p6968aa.p6969a.C89002b;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70897l;

/* renamed from: com.google.android.apps.gsa.staticplugins.bb.i */
/* compiled from: PG */
final class C94492i implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C70334de f264190a;

    /* renamed from: b */
    final /* synthetic */ C70897l f264191b;

    /* renamed from: c */
    final /* synthetic */ C94493j f264192c;

    public C94492i(C94493j jVar, C70334de deVar, C70897l lVar) {
        this.f264192c = jVar;
        this.f264190a = deVar;
        this.f264191b = lVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x d = C94494k.f264194a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "GusAgsaClient");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(20137)).mo56386p("Failed getting android cert header");
        this.f264192c.mo88488e(this.f264191b, this.f264190a);
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            C58976aa aaVar = C58975e.f156826a;
            C89002b.m144698a(this.f264190a, "X-Android-Cert", (String) axVar.mo56107c());
        } else {
            C58976aa aaVar2 = C58975e.f156826a;
        }
        this.f264192c.mo88488e(this.f264191b, this.f264190a);
    }
}
