package com.google.android.apps.gsa.staticplugins.opa.translator.offline;

import com.google.android.apps.gsa.shared.p6968aa.C89062r;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.translator.offline.d */
/* compiled from: PG */
public final /* synthetic */ class C113625d implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C113628g f314629a;

    public /* synthetic */ C113625d(C113628g gVar) {
        this.f314629a = gVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C113628g gVar = this.f314629a;
        C89062r rVar = (C89062r) obj;
        C58976aa aaVar = C58975e.f156826a;
        rVar.mo83040a();
        if (rVar.mo83040a()) {
            gVar.mo100357b();
        } else if (gVar.f314636c.mo56113h()) {
            new C90873ag(((C42876ab) gVar.f314636c.mo56107c()).mo46042d(), gVar.f314635b, "check offline availability", new C113623b(gVar)).mo85223a(C113624c.f314628a);
        }
    }
}
