package com.google.apps.tiktok.p3644h;

import com.google.common.util.concurrent.SettableFuture;
import p5488io.grpc.C70162az;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70897l;
import p5488io.grpc.Status;

/* renamed from: com.google.apps.tiktok.h.ab */
/* compiled from: PG */
final class C47107ab extends C70162az {

    /* renamed from: a */
    private final SettableFuture f122709a;

    public C47107ab(C70897l lVar, SettableFuture settableFuture) {
        super(lVar);
        this.f122709a = settableFuture;
    }

    /* renamed from: b */
    public final void mo27484b(Status status, C70334de deVar) {
        try {
            this.f187015b.mo27484b(status, deVar);
        } finally {
            this.f122709a.mo57356n((Object) null);
        }
    }
}
