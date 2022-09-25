package com.google.android.gms.usonia.p10879c;

import com.google.android.gms.usonia.metrics.internal.C146293a;
import p5488io.grpc.C70162az;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70897l;
import p5488io.grpc.Status;

/* renamed from: com.google.android.gms.usonia.c.e */
/* compiled from: PG */
final class C146169e extends C70162az {

    /* renamed from: a */
    final /* synthetic */ C146170f f394946a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C146169e(C146170f fVar, C70897l lVar) {
        super(lVar);
        this.f394946a = fVar;
    }

    /* renamed from: b */
    public final void mo27484b(Status status, C70334de deVar) {
        this.f394946a.f394948b.f394950a.mo122733d(C146293a.SERVICE_CLIENT_STATUS_CODE, C146171g.m238096b(this.f394946a.f394947a.f187498c), (long) status.getCode().value());
        this.f187015b.mo27484b(status, deVar);
    }

    /* renamed from: c */
    public final void mo27485c(C70334de deVar) {
        this.f394946a.f394948b.f394950a.mo122733d(C146293a.SERVICE_CLIENT_RESPONSE_COUNT, C146171g.m238096b(this.f394946a.f394947a.f187498c), 1);
        this.f187015b.mo27485c(deVar);
    }
}
