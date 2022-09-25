package com.google.android.apps.gsa.staticplugins.opa.morris2.p8395h.p8396a;

import com.google.android.apps.gsa.assistant.shared.c;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p881b.C13009a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.morris2.h.a.f */
/* compiled from: PG */
final class C109653f implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C109654g f305371a;

    public C109653f(C109654g gVar) {
        this.f305371a = gVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x c = C109654g.f305372a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "Morris.AppIntegHelper");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(25106)).mo56386p("Failed to poll foreground app");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        c cVar;
        C109654g gVar = this.f305371a;
        if (C13009a.f40419b.contains((String) obj)) {
            cVar = c.b;
        } else {
            cVar = c.a;
        }
        if (!gVar.f305374c) {
            gVar.f305373b.g(cVar);
        }
    }
}
