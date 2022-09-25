package com.google.android.apps.gsa.staticplugins.opa.errorui;

import com.google.android.apps.gsa.opaonboarding.C83956t;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84021p;
import com.google.android.apps.gsa.shared.util.p7159c.C90891ay;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.aa */
/* compiled from: PG */
final class C108817aa extends C90891ay {

    /* renamed from: a */
    final /* synthetic */ C84021p f302578a;

    /* renamed from: b */
    final /* synthetic */ C108818ab f302579b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C108817aa(C108818ab abVar, C84021p pVar) {
        super("SequenceDependencyCheck");
        this.f302579b = abVar;
        this.f302578a = pVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x d = C108818ab.f302580a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "DepCheckFragSeq");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(24364)).mo56386p("Check threw exception");
        this.f302578a.mo77485e();
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        C58976aa aaVar = C58975e.f156826a;
        if (((Boolean) obj).booleanValue()) {
            C108818ab abVar = this.f302579b;
            abVar.f302582c = (C83956t) abVar.f302581b.mo17428b();
        }
        this.f302578a.mo77485e();
    }
}
