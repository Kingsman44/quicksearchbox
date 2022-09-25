package p5488io.p5490b.p5497e.p5502e.p5506d;

import java.util.concurrent.atomic.AtomicReference;
import p5488io.p5490b.C70123o;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5497e.p5498a.C69828d;
import p5488io.p5490b.p5497e.p5498a.C69829e;

/* renamed from: io.b.e.e.d.bv */
/* compiled from: PG */
final class C69968bv extends AtomicReference implements Runnable, C69803b {
    private static final long serialVersionUID = -2809475196591179431L;

    /* renamed from: a */
    final C70123o f186492a;

    public C69968bv(C70123o oVar) {
        this.f186492a = oVar;
    }

    public final void dispose() {
        C69828d.m101309f(this);
    }

    /* renamed from: e */
    public final boolean mo25859e() {
        throw null;
    }

    public final void run() {
        if (get() != C69828d.f186198a) {
            this.f186492a.mo25988lL(0L);
            lazySet(C69829e.INSTANCE);
            this.f186492a.mo25986a();
        }
    }
}
