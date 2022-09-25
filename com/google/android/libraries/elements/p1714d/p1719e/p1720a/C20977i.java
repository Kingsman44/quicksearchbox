package com.google.android.libraries.elements.p1714d.p1719e.p1720a;

import java.util.concurrent.atomic.AtomicReference;
import p5488io.grpc.Status;
import p5488io.p5490b.p5515g.C70095a;

/* renamed from: com.google.android.libraries.elements.d.e.a.i */
/* compiled from: PG */
final class C20977i extends C70095a {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f58801a;

    public C20977i(AtomicReference atomicReference) {
        this.f58801a = atomicReference;
    }

    /* renamed from: a */
    public final void mo26090a() {
        this.f58801a.set(Status.f186902OK);
    }

    /* renamed from: b */
    public final void mo26091b(Throwable th) {
        this.f58801a.set(Status.f186913k);
    }
}
