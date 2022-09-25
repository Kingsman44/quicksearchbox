package com.google.frameworks.client.data.android.server;

import java.util.HashMap;
import java.util.concurrent.Executor;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70703eh;
import p5488io.grpc.C70704ei;
import p5488io.grpc.C70710eo;
import p5488io.grpc.C70711ep;
import p5488io.grpc.C70716eu;
import p5488io.grpc.Status;

/* renamed from: com.google.frameworks.client.data.android.server.af */
/* compiled from: PG */
public final class C61551af {

    /* renamed from: a */
    public static final C70711ep f166360a = C70710eo.m103393a("failed", (C70716eu) null, new HashMap());

    /* renamed from: b */
    public final C61572t f166361b;

    /* renamed from: c */
    public final Executor f166362c;

    public C61551af(C61572t tVar, Executor executor) {
        this.f166361b = tVar;
        this.f166362c = executor;
    }

    /* renamed from: a */
    public static C70703eh m94300a(C70704ei eiVar, Status status) {
        eiVar.mo39476a(status, new C70334de());
        return new C61571s();
    }
}
