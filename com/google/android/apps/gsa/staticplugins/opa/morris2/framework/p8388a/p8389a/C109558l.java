package com.google.android.apps.gsa.staticplugins.opa.morris2.framework.p8388a.p8389a;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p870d.p871a.C12916am;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.morris2.framework.a.a.l */
/* compiled from: PG */
final class C109558l implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C109560n f305124a;

    public C109558l(C109560n nVar) {
        this.f305124a = nVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        if (!(th instanceof CancellationException)) {
            C59104x d = C109560n.f305126a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "Morris.AsstDataSrc");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(24918)).mo56386p("Session future failed.");
        }
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        this.f305124a.f305134i = null;
        C46459k.m82829b(((C12916am) obj).mo20849a(), "Failed to cancel session.", new Object[0]);
    }
}
