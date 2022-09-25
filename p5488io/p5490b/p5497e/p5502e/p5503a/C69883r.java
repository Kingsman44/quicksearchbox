package p5488io.p5490b.p5497e.p5502e.p5503a;

import java.util.concurrent.atomic.AtomicInteger;
import org.p5649d.C72640c;
import p5488io.p5490b.C69801b;
import p5488io.p5490b.C69818d;
import p5488io.p5490b.C70094g;
import p5488io.p5490b.p5494b.C69802a;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5497e.p5512i.C70079c;
import p5488io.p5490b.p5497e.p5513j.C70081b;
import p5488io.p5490b.p5497e.p5513j.C70085f;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: io.b.e.e.a.r */
/* compiled from: PG */
final class C69883r extends AtomicInteger implements C70094g, C69803b {
    private static final long serialVersionUID = -2108443387387077490L;

    /* renamed from: a */
    final C69801b f186276a;

    /* renamed from: b */
    final int f186277b = Integer.MAX_VALUE;

    /* renamed from: c */
    final boolean f186278c = true;

    /* renamed from: d */
    final C70081b f186279d = new C70081b();

    /* renamed from: e */
    final C69802a f186280e = new C69802a();

    /* renamed from: f */
    C72640c f186281f;

    public C69883r(C69801b bVar) {
        this.f186276a = bVar;
        lazySet(1);
    }

    /* renamed from: a */
    public final void mo61494a(C72640c cVar) {
        if (C70079c.m101977h(this.f186281f, cVar)) {
            this.f186281f = cVar;
            this.f186276a.mo61460lO(this);
            int i = this.f186277b;
            if (i == Integer.MAX_VALUE) {
                cVar.mo61489e(Long.MAX_VALUE);
            } else {
                cVar.mo61489e((long) i);
            }
        }
    }

    public final void dispose() {
        this.f186281f.mo61490lP();
        this.f186280e.dispose();
    }

    /* renamed from: e */
    public final boolean mo25859e() {
        throw null;
    }

    /* renamed from: f */
    public final void mo61497f(Throwable th) {
        if (!this.f186278c) {
            this.f186280e.dispose();
            if (!C70085f.m101987d(this.f186279d, th)) {
                C70101a.m102023e(th);
            } else if (getAndSet(0) > 0) {
                this.f186276a.mo26091b(C70085f.m101986c(this.f186279d));
            }
        } else if (!C70085f.m101987d(this.f186279d, th)) {
            C70101a.m102023e(th);
        } else if (decrementAndGet() == 0) {
            this.f186276a.mo26091b(C70085f.m101986c(this.f186279d));
        }
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ void mo61498g(Object obj) {
        getAndIncrement();
        C69882q qVar = new C69882q(this);
        this.f186280e.mo61462b(qVar);
        ((C69818d) obj).mo42459a(qVar);
    }

    /* renamed from: lK */
    public final void mo61499lK() {
        if (decrementAndGet() != 0) {
            return;
        }
        if (((Throwable) this.f186279d.get()) != null) {
            this.f186276a.mo26091b(C70085f.m101986c(this.f186279d));
        } else {
            this.f186276a.mo26090a();
        }
    }
}
