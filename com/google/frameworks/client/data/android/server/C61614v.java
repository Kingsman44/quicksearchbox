package com.google.frameworks.client.data.android.server;

import p5488io.grpc.C70334de;
import p5488io.grpc.C70703eh;
import p5488io.grpc.C70704ei;
import p5488io.grpc.C70705ej;
import p5488io.grpc.Status;

/* renamed from: com.google.frameworks.client.data.android.server.v */
/* compiled from: PG */
public final /* synthetic */ class C61614v implements C70705ej {

    /* renamed from: a */
    public final /* synthetic */ C61550ae f166484a;

    /* renamed from: b */
    public final /* synthetic */ Object f166485b;

    public /* synthetic */ C61614v(C61550ae aeVar, Object obj) {
        this.f166484a = aeVar;
        this.f166485b = obj;
    }

    /* renamed from: a */
    public final C70703eh mo39514a(C70704ei eiVar, C70334de deVar) {
        C61550ae aeVar = this.f166484a;
        Object obj = this.f166485b;
        Status status = Status.f186908f;
        String str = aeVar.f166357a.f188456a;
        String obj2 = obj.toString();
        return C61551af.m94300a(eiVar, status.withDescription("Service " + str + " unavailable in service instance with reference " + obj2));
    }
}
