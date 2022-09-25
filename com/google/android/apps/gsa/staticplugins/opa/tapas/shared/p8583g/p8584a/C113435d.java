package com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8583g.p8584a;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8583g.p8586b.C113449b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.g.a.d */
/* compiled from: PG */
public final /* synthetic */ class C113435d implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C113436e f314100a;

    /* renamed from: b */
    public final /* synthetic */ long f314101b;

    /* renamed from: c */
    public final /* synthetic */ C113449b f314102c;

    public /* synthetic */ C113435d(C113436e eVar, long j, C113449b bVar) {
        this.f314100a = eVar;
        this.f314101b = j;
        this.f314102c = bVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C113436e eVar = this.f314100a;
        long j = this.f314101b;
        C113449b bVar = this.f314102c;
        eVar.f314107e.ifPresent(new C113433b(j));
        C59104x c = C113437f.f314109a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "GrpcTapasSearchCtrl");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g((Exception) obj)).mo56372aa(27879)).mo56386p("Failed to get the stream pipeline");
        bVar.mo54589f(true);
    }
}
