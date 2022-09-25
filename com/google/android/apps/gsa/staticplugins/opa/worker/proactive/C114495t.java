package com.google.android.apps.gsa.staticplugins.opa.worker.proactive;

import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.proactive.t */
/* compiled from: PG */
final class C114495t implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ String f317465a;

    public C114495t(String str) {
        this.f317465a = str;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x c = C114496u.f317466a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "ContextFenceReg");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(28960)).mo56389s("Remove for fence key: %s failed.", this.f317465a);
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
        C59071e eVar = C114496u.f317466a;
        C58976aa aaVar = C58975e.f156826a;
    }
}
