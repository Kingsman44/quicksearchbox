package p5488io.p5490b.p5497e.p5502e.p5508f;

import java.util.concurrent.atomic.AtomicReference;
import p5488io.p5490b.C70130v;
import p5488io.p5490b.C70131w;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5495c.C69813f;
import p5488io.p5490b.p5496d.C69822d;
import p5488io.p5490b.p5497e.p5498a.C69828d;
import p5488io.p5490b.p5497e.p5499b.C69841j;

/* renamed from: io.b.e.e.f.o */
/* compiled from: PG */
final class C70024o extends AtomicReference implements C70130v, C69803b {
    private static final long serialVersionUID = 3258103020495908596L;

    /* renamed from: a */
    final C70130v f186657a;

    /* renamed from: b */
    final C69822d f186658b;

    public C70024o(C70130v vVar, C69822d dVar) {
        this.f186657a = vVar;
        this.f186658b = dVar;
    }

    /* renamed from: b */
    public final void mo26091b(Throwable th) {
        this.f186657a.mo26091b(th);
    }

    /* renamed from: d */
    public final void mo61488d(Object obj) {
        try {
            C70131w wVar = (C70131w) this.f186658b.mo25875a(obj);
            C69841j.m101337b(wVar, "The single returned by the mapper is null");
            if (!C69828d.m101306b((C69803b) get())) {
                wVar.mo61675o(new C70023n(this, this.f186657a));
            }
        } catch (Throwable th) {
            C69813f.m101292a(th);
            this.f186657a.mo26091b(th);
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
        if (C69828d.m101307c(this, bVar)) {
            this.f186657a.mo61460lO(this);
        }
    }
}
