package p5488io.p5490b.p5497e.p5502e.p5503a;

import java.util.concurrent.atomic.AtomicReference;
import p5488io.p5490b.C69801b;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5497e.p5498a.C69828d;
import p5488io.p5490b.p5497e.p5513j.C70085f;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: io.b.e.e.a.q */
/* compiled from: PG */
final class C69882q extends AtomicReference implements C69801b, C69803b {
    private static final long serialVersionUID = 251330541679988317L;

    /* renamed from: a */
    final /* synthetic */ C69883r f186275a;

    public C69882q(C69883r rVar) {
        this.f186275a = rVar;
    }

    /* renamed from: a */
    public final void mo26090a() {
        C69883r rVar = this.f186275a;
        rVar.f186280e.mo61463c(this);
        if (rVar.decrementAndGet() == 0) {
            Throwable th = (Throwable) rVar.f186279d.get();
            if (th != null) {
                rVar.f186276a.mo26091b(th);
            } else {
                rVar.f186276a.mo26090a();
            }
        } else if (rVar.f186277b != Integer.MAX_VALUE) {
            rVar.f186281f.mo61489e(1);
        }
    }

    /* renamed from: b */
    public final void mo26091b(Throwable th) {
        C69883r rVar = this.f186275a;
        rVar.f186280e.mo61463c(this);
        if (!rVar.f186278c) {
            rVar.f186281f.mo61490lP();
            rVar.f186280e.dispose();
            if (!C70085f.m101987d(rVar.f186279d, th)) {
                C70101a.m102023e(th);
            } else if (rVar.getAndSet(0) > 0) {
                rVar.f186276a.mo26091b(C70085f.m101986c(rVar.f186279d));
            }
        } else if (!C70085f.m101987d(rVar.f186279d, th)) {
            C70101a.m102023e(th);
        } else if (rVar.decrementAndGet() == 0) {
            rVar.f186276a.mo26091b(C70085f.m101986c(rVar.f186279d));
        } else if (rVar.f186277b != Integer.MAX_VALUE) {
            rVar.f186281f.mo61489e(1);
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
        C69828d.m101307c(this, bVar);
    }
}
