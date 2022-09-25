package p5488io.p5490b.p5497e.p5502e.p5506d;

import java.util.concurrent.atomic.AtomicInteger;
import p5488io.p5490b.C70123o;
import p5488io.p5490b.p5494b.C69803b;

/* renamed from: io.b.e.e.d.bc */
/* compiled from: PG */
final class C69949bc extends AtomicInteger implements C69803b {
    private static final long serialVersionUID = 2728361546769921047L;

    /* renamed from: a */
    final C69953bg f186443a;

    /* renamed from: b */
    final C70123o f186444b;

    /* renamed from: c */
    Object f186445c;

    /* renamed from: d */
    volatile boolean f186446d;

    public C69949bc(C69953bg bgVar, C70123o oVar) {
        this.f186443a = bgVar;
        this.f186444b = oVar;
    }

    public final void dispose() {
        if (!this.f186446d) {
            this.f186446d = true;
            this.f186443a.mo61536f(this);
            this.f186445c = null;
        }
    }

    /* renamed from: e */
    public final boolean mo25859e() {
        throw null;
    }
}
