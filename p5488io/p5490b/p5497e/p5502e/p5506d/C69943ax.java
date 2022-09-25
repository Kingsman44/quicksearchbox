package p5488io.p5490b.p5497e.p5502e.p5506d;

import java.util.concurrent.atomic.AtomicReference;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5496d.C69821c;
import p5488io.p5490b.p5497e.p5498a.C69828d;

/* renamed from: io.b.e.e.d.ax */
/* compiled from: PG */
final class C69943ax extends AtomicReference implements Runnable, C69821c {
    private static final long serialVersionUID = -4552101107598366241L;

    /* renamed from: a */
    final C69945az f186425a;

    /* renamed from: b */
    C69803b f186426b;

    /* renamed from: c */
    long f186427c;

    /* renamed from: d */
    boolean f186428d;

    /* renamed from: e */
    boolean f186429e;

    public C69943ax(C69945az azVar) {
        this.f186425a = azVar;
    }

    /* renamed from: b */
    public final void mo25818a(C69803b bVar) {
        C69828d.m101310g(this, bVar);
        synchronized (this.f186425a) {
            if (this.f186429e) {
                ((C69956bj) this.f186425a.f186434a).mo61540a(bVar);
            }
        }
    }

    public final void run() {
        this.f186425a.mo61531b(this);
    }
}
