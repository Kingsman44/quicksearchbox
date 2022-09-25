package com.google.android.apps.gsa.staticplugins.opa.p8369hq;

import com.google.android.apps.gsa.shared.util.p7159c.C90891ay;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.hq.al */
/* compiled from: PG */
public final class C109224al extends C90891ay {

    /* renamed from: a */
    final /* synthetic */ OpaHqActivity f304136a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109224al(OpaHqActivity opaHqActivity) {
        super("Assistant Directory - Process Caller Signature");
        this.f304136a = opaHqActivity;
    }

    /* renamed from: c */
    public final void mo17911gm(Boolean bool) {
        C58976aa aaVar = C58975e.f156826a;
        if (bool == null || !bool.booleanValue()) {
            C59104x d = OpaHqActivity.f304069j.mo56226d();
            d.mo56378ag(C58975e.f156826a, "OpaHQActivity");
            ((C59052c) ((C59052c) d).mo56372aa(24619)).mo56386p("Invalid caller. Finishing Activity.");
            this.f304136a.finish();
            return;
        }
        OpaHqActivity opaHqActivity = this.f304136a;
        opaHqActivity.mo97668v(opaHqActivity.getIntent());
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x c = OpaHqActivity.f304069j.mo56225c();
        c.mo56378ag(C58975e.f156826a, "OpaHQActivity");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(24617)).mo56386p("Failed to check if caller was Google Signed - finishing");
        this.f304136a.finish();
    }
}
