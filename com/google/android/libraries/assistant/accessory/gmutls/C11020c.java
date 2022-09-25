package com.google.android.libraries.assistant.accessory.gmutls;

import android.os.Looper;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.assistant.accessory.gmutls.c */
/* compiled from: PG */
final class C11020c extends C11025h {

    /* renamed from: a */
    final /* synthetic */ C11022e f36209a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11020c(C11022e eVar, Looper looper, long j) {
        super(looper, j, 500);
        this.f36209a = eVar;
    }

    /* renamed from: a */
    public final void mo19470a() {
        int a = this.f36209a.f36214e.mo19426a();
        C59104x b = C11022e.f36211b.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GmuTls");
        ((C59052c) ((C59052c) b).mo56372aa(42401)).mo56387q("Time to retransmit, notifying listeners, tls timer: %dms", a);
        this.f36209a.f36217h.set(true);
        this.f36209a.mo19482g();
    }

    /* renamed from: b */
    public final void mo19471b() {
        long j = C11022e.f36210a;
        C58976aa aaVar = C58975e.f156826a;
        this.f36209a.f36214e.mo19426a();
    }
}
