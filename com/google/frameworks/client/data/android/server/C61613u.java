package com.google.frameworks.client.data.android.server;

import p5488io.grpc.C70334de;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70703eh;
import p5488io.grpc.C70704ei;
import p5488io.grpc.C70705ej;
import p5488io.grpc.Status;

/* renamed from: com.google.frameworks.client.data.android.server.u */
/* compiled from: PG */
public final /* synthetic */ class C61613u implements C70705ej {

    /* renamed from: a */
    public final /* synthetic */ C70338di f166483a;

    public /* synthetic */ C61613u(C70338di diVar) {
        this.f166483a = diVar;
    }

    /* renamed from: a */
    public final C70703eh mo39514a(C70704ei eiVar, C70334de deVar) {
        C70338di diVar = this.f166483a;
        Status status = Status.f186915m;
        String str = diVar.f187497b;
        return C61551af.m94300a(eiVar, status.withDescription("Method " + str + " missing from scoped instance!"));
    }
}
