package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.p9312g.p9313a.p9314a;

import com.google.common.util.concurrent.C60826bg;
import com.google.speech.p5208h.C66607ce;
import java.util.concurrent.atomic.AtomicBoolean;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.g.a.a.j */
/* compiled from: PG */
final class C123237j implements C70862aj {

    /* renamed from: a */
    final /* synthetic */ C70862aj f340950a;

    /* renamed from: b */
    final /* synthetic */ C70862aj f340951b;

    /* renamed from: c */
    final /* synthetic */ C123238k f340952c;

    /* renamed from: d */
    private final AtomicBoolean f340953d = new AtomicBoolean(false);

    public C123237j(C123238k kVar, C70862aj ajVar, C70862aj ajVar2) {
        this.f340952c = kVar;
        this.f340950a = ajVar;
        this.f340951b = ajVar2;
    }

    /* renamed from: a */
    public final void mo20121a() {
        this.f340952c.f340956c.mo51511a(new C123236i(this.f340950a), C60826bg.f164896a);
    }

    /* renamed from: b */
    public final void mo20122b(Throwable th) {
        this.f340952c.f340956c.mo51511a(new C123235h(th, this.f340950a), C60826bg.f164896a);
    }

    /* renamed from: d */
    public final synchronized void mo20123c(C66607ce ceVar) {
        if (!this.f340953d.getAndSet(true)) {
            this.f340952c.f340956c.mo51512b(new C123233f(this, ceVar, this.f340950a, this.f340951b), C60826bg.f164896a);
        } else {
            this.f340952c.f340956c.mo51511a(new C123234g(this.f340950a, ceVar), C60826bg.f164896a);
        }
    }
}
