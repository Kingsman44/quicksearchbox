package com.google.android.libraries.lens.sdk.p2045c;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.lens.sdk.c.f */
/* compiled from: PG */
public final /* synthetic */ class C24921f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C24922g f68041a;

    public /* synthetic */ C24921f(C24922g gVar) {
        this.f68041a = gVar;
    }

    public final void run() {
        C24922g gVar = this.f68041a;
        C59104x b = C24923h.f68044a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "LensServiceController");
        ((C59052c) ((C59052c) b).mo56372aa(48947)).mo56387q("Binder died for uid %d", gVar.f68042a.f68026a);
        gVar.f68043b.mo30141a(gVar.f68042a);
    }
}
