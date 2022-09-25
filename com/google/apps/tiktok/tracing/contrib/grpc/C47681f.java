package com.google.apps.tiktok.tracing.contrib.grpc;

import com.google.apps.tiktok.tracing.C47558bi;
import com.google.common.util.concurrent.SettableFuture;
import p5488io.grpc.C70168bc;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70704ei;
import p5488io.grpc.Status;

/* renamed from: com.google.apps.tiktok.tracing.contrib.grpc.f */
/* compiled from: PG */
final class C47681f extends C70168bc {

    /* renamed from: a */
    private final SettableFuture f123634a;

    public C47681f(C70704ei eiVar, C47558bi biVar) {
        super(eiVar);
        SettableFuture settableFuture = new SettableFuture();
        biVar.mo51417a(settableFuture);
        this.f123634a = settableFuture;
    }

    /* renamed from: a */
    public final void mo39476a(Status status, C70334de deVar) {
        this.f187017c.mo39476a(status, deVar);
        this.f123634a.mo57356n((Object) null);
    }
}
