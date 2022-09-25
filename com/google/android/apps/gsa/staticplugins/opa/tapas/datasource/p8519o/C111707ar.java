package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8519o;

import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.assistant.p3858ar.p3859a.C49728r;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.o.ar */
/* compiled from: PG */
final class C111707ar implements C22868d {

    /* renamed from: a */
    final /* synthetic */ C49728r f310533a;

    /* renamed from: b */
    final /* synthetic */ C111708as f310534b;

    public C111707ar(C111708as asVar, C49728r rVar) {
        this.f310534b = asVar;
        this.f310533a = rVar;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        C59104x c = C111708as.f310535a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "TapasZPCacheControl");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(27325)).mo56386p("#saveCache - Failed to fetch personal response.");
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17702gm(Object obj) {
        C58976aa aaVar = C58975e.f156826a;
        this.f310534b.mo99214f(((Boolean) obj).booleanValue(), this.f310533a);
    }
}
