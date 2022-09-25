package com.google.frameworks.client.data.android.p4641h;

import p5488io.grpc.C70334de;
import p5488io.grpc.C70897l;
import p5488io.grpc.Status;

/* renamed from: com.google.frameworks.client.data.android.h.z */
/* compiled from: PG */
final class C61505z extends C70897l {

    /* renamed from: a */
    public final C70897l f166276a;

    /* renamed from: b */
    boolean f166277b = false;

    /* renamed from: c */
    final /* synthetic */ C61471ad f166278c;

    public C61505z(C61471ad adVar, C70897l lVar) {
        this.f166278c = adVar;
        this.f166276a = lVar;
    }

    /* renamed from: b */
    public final void mo27484b(Status status, C70334de deVar) {
        this.f166278c.f166185a.execute(new C61504y(this, status, deVar));
    }

    /* renamed from: c */
    public final void mo27485c(C70334de deVar) {
        this.f166278c.f166185a.execute(new C61502w(this, deVar));
    }

    /* renamed from: d */
    public final void mo27486d() {
        this.f166278c.f166185a.execute(new C61501v(this));
    }

    /* renamed from: i */
    public final void mo27487i(Object obj) {
        this.f166278c.f166185a.execute(new C61503x(this, obj));
    }
}
