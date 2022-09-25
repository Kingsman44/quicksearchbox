package p5488io.p5490b.p5519k;

import java.util.concurrent.atomic.AtomicBoolean;
import p5488io.p5490b.C70123o;
import p5488io.p5490b.p5494b.C69803b;

/* renamed from: io.b.k.e */
/* compiled from: PG */
final class C70117e extends AtomicBoolean implements C69803b {
    private static final long serialVersionUID = 3562861878281475070L;

    /* renamed from: a */
    final C70123o f186882a;

    /* renamed from: b */
    final C70118f f186883b;

    public C70117e(C70123o oVar, C70118f fVar) {
        this.f186882a = oVar;
        this.f186883b = fVar;
    }

    public final void dispose() {
        if (compareAndSet(false, true)) {
            this.f186883b.mo61649u(this);
        }
    }

    /* renamed from: e */
    public final boolean mo25859e() {
        throw null;
    }
}
