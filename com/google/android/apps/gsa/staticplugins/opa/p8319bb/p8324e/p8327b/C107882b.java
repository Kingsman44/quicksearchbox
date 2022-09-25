package com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8324e.p8327b;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8583g.p8586b.C113449b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bb.e.b.b */
/* compiled from: PG */
public final /* synthetic */ class C107882b implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C107885e f300182a;

    /* renamed from: b */
    public final /* synthetic */ long f300183b;

    /* renamed from: c */
    public final /* synthetic */ C113449b f300184c;

    public /* synthetic */ C107882b(C107885e eVar, long j, C113449b bVar) {
        this.f300182a = eVar;
        this.f300183b = j;
        this.f300184c = bVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C107885e eVar = this.f300182a;
        long j = this.f300183b;
        C113449b bVar = this.f300184c;
        eVar.f300187a.f300193f.ifPresent(new C107883c(j));
        C59104x c = C107886f.f300188a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "HttpStreamingTapasSearchCon");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g((Exception) obj)).mo56372aa(26359)).mo56386p("Failed to get the stream pipeline");
        bVar.mo54589f(true);
    }
}
