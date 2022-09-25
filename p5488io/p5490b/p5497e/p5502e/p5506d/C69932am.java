package p5488io.p5490b.p5497e.p5502e.p5506d;

import java.util.concurrent.atomic.AtomicReference;
import p5488io.p5490b.C70123o;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5497e.p5498a.C69828d;

/* renamed from: io.b.e.e.d.am */
/* compiled from: PG */
final class C69932am extends AtomicReference implements Runnable, C69803b {
    private static final long serialVersionUID = 346773832286157679L;

    /* renamed from: a */
    final C70123o f186398a;

    /* renamed from: b */
    long f186399b;

    public C69932am(C70123o oVar) {
        this.f186398a = oVar;
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
            C70123o oVar = this.f186398a;
            long j = this.f186399b;
            this.f186399b = 1 + j;
            oVar.mo25988lL(Long.valueOf(j));
        }
    }
}
