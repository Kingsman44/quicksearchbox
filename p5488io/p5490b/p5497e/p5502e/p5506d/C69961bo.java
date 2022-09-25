package p5488io.p5490b.p5497e.p5502e.p5506d;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p5488io.p5490b.C70122n;
import p5488io.p5490b.C70123o;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5495c.C69813f;
import p5488io.p5490b.p5496d.C69822d;
import p5488io.p5490b.p5497e.p5498a.C69828d;
import p5488io.p5490b.p5497e.p5499b.C69841j;
import p5488io.p5490b.p5497e.p5500c.C69847f;
import p5488io.p5490b.p5497e.p5513j.C70081b;
import p5488io.p5490b.p5497e.p5513j.C70085f;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: io.b.e.e.d.bo */
/* compiled from: PG */
final class C69961bo extends AtomicInteger implements C70123o, C69803b {

    /* renamed from: a */
    static final C69959bm f186466a;
    private static final long serialVersionUID = -3491074160481096299L;

    /* renamed from: b */
    final C70123o f186467b;

    /* renamed from: c */
    final C69822d f186468c;

    /* renamed from: d */
    final int f186469d;

    /* renamed from: e */
    final C70081b f186470e;

    /* renamed from: f */
    volatile boolean f186471f;

    /* renamed from: g */
    volatile boolean f186472g;

    /* renamed from: h */
    C69803b f186473h;

    /* renamed from: i */
    final AtomicReference f186474i = new AtomicReference();

    /* renamed from: j */
    volatile long f186475j;

    static {
        C69959bm bmVar = new C69959bm((C69961bo) null, -1, 1);
        f186466a = bmVar;
        C69828d.m101309f(bmVar);
    }

    public C69961bo(C70123o oVar, C69822d dVar, int i) {
        this.f186467b = oVar;
        this.f186468c = dVar;
        this.f186469d = i;
        this.f186470e = new C70081b();
    }

    /* renamed from: a */
    public final void mo25986a() {
        if (!this.f186471f) {
            this.f186471f = true;
            mo61543g();
        }
    }

    /* renamed from: b */
    public final void mo25987b(Throwable th) {
        if (this.f186471f || !C70085f.m101987d(this.f186470e, th)) {
            C70101a.m102023e(th);
            return;
        }
        mo61542f();
        this.f186471f = true;
        mo61543g();
    }

    /* renamed from: d */
    public final void mo26850d(C69803b bVar) {
        if (C69828d.m101308d(this.f186473h, bVar)) {
            this.f186473h = bVar;
            this.f186467b.mo26850d(this);
        }
    }

    public final void dispose() {
        if (!this.f186472g) {
            this.f186472g = true;
            this.f186473h.dispose();
            mo61542f();
        }
    }

    /* renamed from: e */
    public final boolean mo25859e() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo61542f() {
        C69959bm bmVar;
        C69959bm bmVar2 = (C69959bm) this.f186474i.get();
        C69959bm bmVar3 = f186466a;
        if (bmVar2 != bmVar3 && (bmVar = (C69959bm) this.f186474i.getAndSet(bmVar3)) != bmVar3 && bmVar != null) {
            C69828d.m101309f(bmVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo61543g() {
        C69847f fVar;
        Object obj;
        if (getAndIncrement() == 0) {
            C70123o oVar = this.f186467b;
            AtomicReference atomicReference = this.f186474i;
            int i = 1;
            while (!this.f186472g) {
                if (this.f186471f) {
                    Object obj2 = atomicReference.get();
                    if (((Throwable) this.f186470e.get()) != null) {
                        oVar.mo25987b(C70085f.m101986c(this.f186470e));
                        return;
                    } else if (obj2 == null) {
                        oVar.mo25986a();
                        return;
                    }
                }
                C69959bm bmVar = (C69959bm) atomicReference.get();
                if (!(bmVar == null || (fVar = bmVar.f186464d) == null)) {
                    boolean z = false;
                    if (bmVar.f186465e) {
                        boolean i2 = fVar.mo61476i();
                        if (((Throwable) this.f186470e.get()) != null) {
                            oVar.mo25987b(C70085f.m101986c(this.f186470e));
                            return;
                        } else if (i2) {
                            C69960bn.m101672a(atomicReference, bmVar, (Object) null);
                        }
                    }
                    while (!this.f186472g) {
                        if (bmVar != atomicReference.get()) {
                            continue;
                        } else if (((Throwable) this.f186470e.get()) == null) {
                            boolean z2 = bmVar.f186465e;
                            try {
                                obj = fVar.mo61479lN();
                            } catch (Throwable th) {
                                C69813f.m101292a(th);
                                C70085f.m101987d(this.f186470e, th);
                                C69960bn.m101672a(atomicReference, bmVar, (Object) null);
                                mo61542f();
                                this.f186473h.dispose();
                                this.f186471f = true;
                                obj = null;
                                z = true;
                            }
                            if (z2) {
                                if (obj == null) {
                                    C69960bn.m101672a(atomicReference, bmVar, (Object) null);
                                }
                            } else if (obj == null) {
                                if (z) {
                                    continue;
                                }
                            }
                            oVar.mo25988lL(obj);
                        } else {
                            oVar.mo25987b(C70085f.m101986c(this.f186470e));
                            return;
                        }
                    }
                    return;
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }
    }

    /* renamed from: lL */
    public final void mo25988lL(Object obj) {
        C69959bm bmVar;
        long j = this.f186475j + 1;
        this.f186475j = j;
        C69959bm bmVar2 = (C69959bm) this.f186474i.get();
        if (bmVar2 != null) {
            C69828d.m101309f(bmVar2);
        }
        try {
            C70122n nVar = (C70122n) this.f186468c.mo25875a(obj);
            C69841j.m101337b(nVar, "The ObservableSource returned is null");
            C69959bm bmVar3 = new C69959bm(this, j, this.f186469d);
            do {
                bmVar = (C69959bm) this.f186474i.get();
                if (bmVar == f186466a) {
                    return;
                }
            } while (!C69960bn.m101672a(this.f186474i, bmVar, bmVar3));
            nVar.mo61539p(bmVar3);
        } catch (Throwable th) {
            C69813f.m101292a(th);
            this.f186473h.dispose();
            mo25987b(th);
        }
    }
}
