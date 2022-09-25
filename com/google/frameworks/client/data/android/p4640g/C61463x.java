package com.google.frameworks.client.data.android.p4640g;

import com.google.common.util.concurrent.C60845bz;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70897l;
import p5488io.grpc.C70898m;
import p5488io.grpc.Status;

/* renamed from: com.google.frameworks.client.data.android.g.x */
/* compiled from: PG */
final class C61463x implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C70897l f166163a;

    /* renamed from: b */
    final /* synthetic */ C61464y f166164b;

    public C61463x(C61464y yVar, C70897l lVar) {
        this.f166164b = yVar;
        this.f166163a = lVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        this.f166164b.f166168d = true;
        this.f166163a.mo27484b(Status.m102100d(th), new C70334de());
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C70898m mVar = (C70898m) obj;
        try {
            C61464y yVar = this.f166164b;
            yVar.f166166b = mVar;
            for (Runnable run : yVar.f166165a) {
                run.run();
            }
        } catch (Throwable th) {
            mo17910gl(th);
        }
    }
}
