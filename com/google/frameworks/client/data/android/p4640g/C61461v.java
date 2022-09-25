package com.google.frameworks.client.data.android.p4640g;

import p5488io.grpc.C70334de;
import p5488io.grpc.Status;

/* renamed from: com.google.frameworks.client.data.android.g.v */
/* compiled from: PG */
public final /* synthetic */ class C61461v implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C61464y f166158a;

    /* renamed from: b */
    public final /* synthetic */ Runnable f166159b;

    public /* synthetic */ C61461v(C61464y yVar, Runnable runnable) {
        this.f166158a = yVar;
        this.f166159b = runnable;
    }

    public final void run() {
        C61464y yVar = this.f166158a;
        Runnable runnable = this.f166159b;
        if (yVar.f166168d) {
            return;
        }
        if (yVar.f166166b != null) {
            try {
                runnable.run();
            } catch (Throwable th) {
                yVar.f166167c.mo27484b(Status.m102100d(th), new C70334de());
            }
        } else {
            yVar.f166165a.add(runnable);
        }
    }
}
