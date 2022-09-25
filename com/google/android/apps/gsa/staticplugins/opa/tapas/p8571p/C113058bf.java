package com.google.android.apps.gsa.staticplugins.opa.tapas.p8571p;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111255r;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.p.bf */
/* compiled from: PG */
public final /* synthetic */ class C113058bf implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C113071bs f313268a;

    public /* synthetic */ C113058bf(C113071bs bsVar) {
        this.f313268a = bsVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        Exception exc = (Exception) obj;
        this.f313268a.f313292g.mo99076a(C111255r.USER_PROFILE, String.format("User profile write failed: %s.", new Object[]{exc}));
        C59104x c = C113071bs.f313286a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "TapasUserProfileBuilder");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(exc)).mo56372aa(27934)).mo56386p("writeUserProfile failed");
    }
}
