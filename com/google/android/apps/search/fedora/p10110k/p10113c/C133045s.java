package com.google.android.apps.search.fedora.p10110k.p10113c;

import com.google.android.libraries.assistant.trainingcache.p1615a.p1616a.C19414r;
import com.google.android.libraries.assistant.trainingcache.p1615a.p1616a.C19417u;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.search.fedora.k.c.s */
/* compiled from: PG */
final class C133045s implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C19417u f362772a;

    /* renamed from: b */
    final /* synthetic */ C19414r f362773b;

    public C133045s(C19417u uVar, C19414r rVar) {
        this.f362772a = uVar;
        this.f362773b = rVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        try {
            this.f362772a.mo24609d(this.f362773b, false);
        } catch (Throwable th2) {
            C59104x d = C133046t.f362774a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "FedoraTrngRegServ");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th2)).mo56372aa(39974)).mo56389s("Failed to log p13n training scheduling failure for session %s.", this.f362773b.mo24572g());
        }
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
        try {
            this.f362772a.mo24609d(this.f362773b, true);
        } catch (Throwable th) {
            C59104x d = C133046t.f362774a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "FedoraTrngRegServ");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(39975)).mo56389s("Failed to log p13n training scheduling success for session %s.", this.f362773b.mo24572g());
        }
    }
}
