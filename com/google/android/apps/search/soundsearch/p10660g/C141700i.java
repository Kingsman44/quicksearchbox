package com.google.android.apps.search.soundsearch.p10660g;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60904dr;
import com.google.speech.p5208h.C66611ci;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.soundsearch.g.i */
/* compiled from: PG */
final class C141700i implements C70862aj {

    /* renamed from: a */
    final /* synthetic */ C141701j f384574a;

    /* renamed from: b */
    private final AtomicBoolean f384575b = new AtomicBoolean();

    /* renamed from: c */
    private final Executor f384576c;

    public C141700i(C141701j jVar) {
        this.f384574a = jVar;
        this.f384576c = new C60904dr(jVar.f384578b);
    }

    /* renamed from: a */
    public final void mo20121a() {
        if (this.f384575b.compareAndSet(false, true)) {
            this.f384574a.mo116656a();
        }
    }

    /* renamed from: b */
    public final void mo20122b(Throwable th) {
        if (this.f384575b.compareAndSet(false, true)) {
            this.f384574a.mo116656a();
            this.f384576c.execute(C47810es.m84977q(new C141699h(this, th)));
        }
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20123c(Object obj) {
        C66611ci ciVar = (C66611ci) obj;
        if (!this.f384575b.get()) {
            this.f384576c.execute(C47810es.m84977q(new C141698g(this, ciVar)));
        }
    }
}
