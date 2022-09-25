package com.google.android.libraries.search.assistant.invocation.utils;

import p5488io.grpc.C70168bc;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70704ei;
import p5488io.grpc.C70761fa;
import p5488io.grpc.Status;

/* renamed from: com.google.android.libraries.search.assistant.invocation.utils.b */
/* compiled from: PG */
final class C34716b extends C70168bc {
    public C34716b(C70704ei eiVar) {
        super(eiVar);
    }

    /* renamed from: a */
    public final void mo39476a(Status status, C70334de deVar) {
        String str = this.f187017c.mo61741c().f187497b;
        Throwable th = status.f186920q;
        if (Status.Code.UNKNOWN.equals(status.getCode()) && status.getDescription() == null && th != null) {
            C70761fa a = C34722f.m63458a(th, this.f187017c.mo61741c().f187497b);
            Status status2 = a.f188571a;
            C70334de deVar2 = a.f188572b;
            if (deVar2 != null) {
                deVar.mo62032g(deVar2);
            }
            status = status2;
        }
        this.f187017c.mo39476a(status, deVar);
    }
}
