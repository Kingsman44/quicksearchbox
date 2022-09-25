package p5488io.p5490b.p5497e.p5502e.p5508f;

import java.util.concurrent.atomic.AtomicReference;
import p5488io.p5490b.C69801b;
import p5488io.p5490b.C69818d;
import p5488io.p5490b.C70130v;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5495c.C69813f;
import p5488io.p5490b.p5496d.C69822d;
import p5488io.p5490b.p5497e.p5498a.C69828d;
import p5488io.p5490b.p5497e.p5499b.C69841j;

/* renamed from: io.b.e.e.f.q */
/* compiled from: PG */
final class C70026q extends AtomicReference implements C70130v, C69801b, C69803b {
    private static final long serialVersionUID = -2177128922851101253L;

    /* renamed from: a */
    final C69801b f186661a;

    /* renamed from: b */
    final C69822d f186662b;

    public C70026q(C69801b bVar, C69822d dVar) {
        this.f186661a = bVar;
        this.f186662b = dVar;
    }

    /* renamed from: a */
    public final void mo26090a() {
        this.f186661a.mo26090a();
    }

    /* renamed from: b */
    public final void mo26091b(Throwable th) {
        this.f186661a.mo26091b(th);
    }

    /* renamed from: d */
    public final void mo61488d(Object obj) {
        try {
            C69818d dVar = (C69818d) this.f186662b.mo25875a(obj);
            C69841j.m101337b(dVar, "The mapper returned a null CompletableSource");
            if (!C69828d.m101306b((C69803b) get())) {
                dVar.mo42459a(this);
            }
        } catch (Throwable th) {
            C69813f.m101292a(th);
            mo26091b(th);
        }
    }

    public final void dispose() {
        C69828d.m101309f(this);
    }

    /* renamed from: e */
    public final boolean mo25859e() {
        throw null;
    }

    /* renamed from: lO */
    public final void mo61460lO(C69803b bVar) {
        C69828d.m101310g(this, bVar);
    }
}
