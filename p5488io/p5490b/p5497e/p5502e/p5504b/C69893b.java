package p5488io.p5490b.p5497e.p5502e.p5504b;

import java.util.concurrent.atomic.AtomicReference;
import org.p5649d.C72640c;
import p5488io.p5490b.C70094g;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5495c.C69814g;
import p5488io.p5490b.p5497e.p5500c.C69845d;
import p5488io.p5490b.p5497e.p5500c.C69847f;
import p5488io.p5490b.p5497e.p5509f.C70037c;
import p5488io.p5490b.p5497e.p5512i.C70079c;
import p5488io.p5490b.p5497e.p5513j.C70085f;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: io.b.e.e.b.b */
/* compiled from: PG */
final class C69893b extends AtomicReference implements C70094g, C69803b {
    private static final long serialVersionUID = -4606175640614850599L;

    /* renamed from: a */
    final long f186301a;

    /* renamed from: b */
    final C69895d f186302b;

    /* renamed from: c */
    final int f186303c;

    /* renamed from: d */
    final int f186304d;

    /* renamed from: e */
    volatile boolean f186305e;

    /* renamed from: f */
    volatile C69847f f186306f;

    /* renamed from: g */
    long f186307g;

    /* renamed from: h */
    int f186308h;

    public C69893b(C69895d dVar, long j) {
        this.f186301a = j;
        this.f186302b = dVar;
        int i = dVar.f186314f;
        this.f186304d = i;
        this.f186303c = i >> 2;
    }

    /* renamed from: a */
    public final void mo61494a(C72640c cVar) {
        if (C70079c.m101975f(this, cVar)) {
            if (cVar instanceof C69845d) {
                C69845d dVar = (C69845d) cVar;
                int lM = dVar.mo61478lM(7);
                if (lM == 1) {
                    this.f186308h = 1;
                    this.f186306f = dVar;
                    this.f186305e = true;
                    this.f186302b.mo61510h();
                    return;
                } else if (lM == 2) {
                    this.f186308h = 2;
                    this.f186306f = dVar;
                }
            }
            cVar.mo61489e((long) this.f186304d);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo61507b(long j) {
        if (this.f186308h != 1) {
            long j2 = this.f186307g + j;
            if (j2 >= ((long) this.f186303c)) {
                this.f186307g = 0;
                ((C72640c) get()).mo61489e(j2);
                return;
            }
            this.f186307g = j2;
        }
    }

    public final void dispose() {
        C70079c.m101974c(this);
    }

    /* renamed from: e */
    public final boolean mo25859e() {
        throw null;
    }

    /* renamed from: f */
    public final void mo61497f(Throwable th) {
        lazySet(C70079c.f186810a);
        C69895d dVar = this.f186302b;
        if (C70085f.m101987d(dVar.f186317i, th)) {
            this.f186305e = true;
            dVar.f186321m.mo61490lP();
            for (C69893b c : (C69893b[]) dVar.f186319k.getAndSet(C69895d.f186310b)) {
                C70079c.m101974c(c);
            }
            dVar.mo61510h();
            return;
        }
        C70101a.m102023e(th);
    }

    /* renamed from: g */
    public final void mo61498g(Object obj) {
        if (this.f186308h != 2) {
            C69895d dVar = this.f186302b;
            if (dVar.get() != 0 || !dVar.compareAndSet(0, 1)) {
                C69847f fVar = this.f186306f;
                if (fVar == null) {
                    fVar = new C70037c(dVar.f186314f);
                    this.f186306f = fVar;
                }
                if (!fVar.mo61477j(obj)) {
                    dVar.mo61497f(new C69814g("Inner queue full?!"));
                    return;
                } else if (dVar.getAndIncrement() != 0) {
                    return;
                }
            } else {
                long j = dVar.f186320l.get();
                C69847f fVar2 = this.f186306f;
                if (j == 0 || (fVar2 != null && !fVar2.mo61476i())) {
                    if (fVar2 == null && (fVar2 = this.f186306f) == null) {
                        fVar2 = new C70037c(dVar.f186314f);
                        this.f186306f = fVar2;
                    }
                    if (!fVar2.mo61477j(obj)) {
                        dVar.mo61497f(new C69814g("Inner queue full?!"));
                        return;
                    }
                } else {
                    dVar.f186311c.mo61498g(obj);
                    if (j != Long.MAX_VALUE) {
                        dVar.f186320l.decrementAndGet();
                    }
                    mo61507b(1);
                }
                if (dVar.decrementAndGet() == 0) {
                    return;
                }
            }
            dVar.mo61511i();
            return;
        }
        this.f186302b.mo61510h();
    }

    /* renamed from: lK */
    public final void mo61499lK() {
        this.f186305e = true;
        this.f186302b.mo61510h();
    }
}
