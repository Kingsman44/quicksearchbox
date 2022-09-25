package com.google.android.apps.search.transcription.p10670f;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60904dr;
import com.google.speech.p5208h.C66611ci;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.transcription.f.al */
/* compiled from: PG */
final class C141793al implements C70862aj {

    /* renamed from: a */
    final /* synthetic */ List f384797a;

    /* renamed from: b */
    final /* synthetic */ C141794am f384798b;

    /* renamed from: c */
    private final Executor f384799c;

    /* renamed from: d */
    private final AtomicBoolean f384800d = new AtomicBoolean();

    public C141793al(C141794am amVar, List list) {
        this.f384798b = amVar;
        this.f384797a = list;
        this.f384799c = new C60904dr(amVar.f384802b);
    }

    /* renamed from: a */
    public final void mo20121a() {
        this.f384800d.compareAndSet(false, true);
    }

    /* renamed from: b */
    public final void mo20122b(Throwable th) {
        if (this.f384800d.compareAndSet(false, true)) {
            this.f384799c.execute(C47810es.m84977q(new C141792ak(this, th)));
        }
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20123c(Object obj) {
        C66611ci ciVar = (C66611ci) obj;
        if (!this.f384800d.get()) {
            this.f384799c.execute(C47810es.m84977q(new C141791aj(this, ciVar)));
        }
    }
}
