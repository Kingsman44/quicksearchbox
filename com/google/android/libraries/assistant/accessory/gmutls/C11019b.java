package com.google.android.libraries.assistant.accessory.gmutls;

import android.os.Looper;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.assistant.accessory.gmutls.b */
/* compiled from: PG */
final class C11019b extends C11025h {

    /* renamed from: a */
    final /* synthetic */ C11022e f36208a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11019b(C11022e eVar, Looper looper, long j) {
        super(looper, j, 500);
        this.f36208a = eVar;
    }

    /* renamed from: a */
    public final void mo19470a() {
        C59104x b = C11022e.f36211b.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GmuTls");
        ((C59052c) ((C59052c) b).mo56372aa(42399)).mo56386p("Handshake timeout.");
        this.f36208a.f36214e.f36205d.getAndSet(-15);
        C11022e eVar = this.f36208a;
        eVar.mo19484i(new C11018a(eVar.f36214e.f36204c));
        this.f36208a.mo19481f();
    }

    /* renamed from: b */
    public final void mo19471b() {
        long j = C11022e.f36210a;
        C58976aa aaVar = C58975e.f156826a;
    }
}
