package com.google.p4651h;

import java.io.IOException;
import p5488io.grpc.Status;
import p5488io.grpc.p5520a.C70133a;

/* renamed from: com.google.h.a */
/* compiled from: PG */
public final class C61643a implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C61648b f166540a;

    /* renamed from: b */
    final /* synthetic */ C70133a f166541b;

    public C61643a(C61648b bVar, C70133a aVar) {
        this.f166540a = bVar;
        this.f166541b = aVar;
    }

    public final void run() {
        C61648b bVar = this.f166540a;
        C70133a aVar = this.f166541b;
        try {
            aVar.mo61689a(bVar.mo58162a());
        } catch (Throwable th) {
            if (th instanceof IOException) {
                aVar.f186948a.mo62072a(Status.f186916n.withDescription("Credentials failed to obtain metadata").mo61678e(th));
            } else {
                aVar.f186948a.mo62072a(Status.f186910h.withDescription("Failed computing credential metadata").mo61678e(th));
            }
        }
    }
}
