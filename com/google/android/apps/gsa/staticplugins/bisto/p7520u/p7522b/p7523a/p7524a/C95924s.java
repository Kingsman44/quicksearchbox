package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7523a.p7524a;

import android.content.Intent;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.a.a.s */
/* compiled from: PG */
public final /* synthetic */ class C95924s implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C95927v f268585a;

    public /* synthetic */ C95924s(C95927v vVar) {
        this.f268585a = vVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C95927v vVar = this.f268585a;
        C59104x c = C95927v.f268588c.mo56225c();
        c.mo56378ag(C58975e.f156826a, "HotwordInitState");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g((Exception) obj)).mo56372aa(15856)).mo56386p("Failed to activate hotword model on the device");
        vVar.f268589d.f267193d = true;
        vVar.mo89847j("ReadyNoAudClassicState", (Intent) null);
    }
}
