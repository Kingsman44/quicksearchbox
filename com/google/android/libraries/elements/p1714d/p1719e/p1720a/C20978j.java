package com.google.android.libraries.elements.p1714d.p1719e.p1720a;

import com.google.android.libraries.elements.interfaces.JSPromiseResolver;
import p5488io.grpc.Status;
import p5488io.p5490b.p5515g.C70095a;

/* renamed from: com.google.android.libraries.elements.d.e.a.j */
/* compiled from: PG */
final class C20978j extends C70095a {

    /* renamed from: a */
    final /* synthetic */ JSPromiseResolver f58802a;

    public C20978j(JSPromiseResolver jSPromiseResolver) {
        this.f58802a = jSPromiseResolver;
    }

    /* renamed from: a */
    public final void mo26090a() {
        this.f58802a.resolve();
    }

    /* renamed from: b */
    public final void mo26091b(Throwable th) {
        this.f58802a.reject(Status.f186905c.withDescription(th.getMessage() == null ? "error" : th.getMessage()));
    }
}
