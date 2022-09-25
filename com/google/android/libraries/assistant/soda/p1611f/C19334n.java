package com.google.android.libraries.assistant.soda.p1611f;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import p5488io.grpc.Status;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.assistant.soda.f.n */
/* compiled from: PG */
final class C19334n implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C70862aj f54104a;

    public C19334n(C70862aj ajVar) {
        this.f54104a = ajVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x c = C19336p.f54108a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "SodaService");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(47781)).mo56386p("Exception when pushing audio to Soda");
        this.f54104a.mo20122b(Status.m102100d(th).withDescription(th.getMessage()).asException());
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
    }
}
