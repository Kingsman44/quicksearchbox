package com.google.android.apps.gsa.staticplugins.opa.morris2.framework.p8388a.p8389a;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p870d.p871a.C12916am;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.morris2.framework.a.a.m */
/* compiled from: PG */
final class C109559m implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C109560n f305125a;

    public C109559m(C109560n nVar) {
        this.f305125a = nVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x d = C109560n.f305126a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "Morris.AsstDataSrc");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(24919)).mo56386p("Failed to execute request.");
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        C12916am amVar = (C12916am) obj;
        C109546am amVar2 = this.f305125a.f305133h;
        if (amVar2.f305084e) {
            C46459k.m82829b(amVar.f40209a.mo20440jJ(amVar2), "Failure while streaming to session data sink.", new Object[0]);
        }
    }
}
