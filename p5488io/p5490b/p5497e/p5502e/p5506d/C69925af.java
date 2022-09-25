package p5488io.p5490b.p5497e.p5502e.p5506d;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p5488io.p5490b.C70123o;
import p5488io.p5490b.C70131w;
import p5488io.p5490b.p5494b.C69802a;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5495c.C69813f;
import p5488io.p5490b.p5496d.C69822d;
import p5488io.p5490b.p5497e.p5498a.C69828d;
import p5488io.p5490b.p5497e.p5499b.C69841j;
import p5488io.p5490b.p5497e.p5509f.C70038d;
import p5488io.p5490b.p5497e.p5513j.C70081b;
import p5488io.p5490b.p5497e.p5513j.C70085f;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: io.b.e.e.d.af */
/* compiled from: PG */
final class C69925af extends AtomicInteger implements C70123o, C69803b {
    private static final long serialVersionUID = 8600231336733376951L;

    /* renamed from: a */
    final C70123o f186375a;

    /* renamed from: b */
    final C69802a f186376b = new C69802a();

    /* renamed from: c */
    final AtomicInteger f186377c = new AtomicInteger(1);

    /* renamed from: d */
    final C70081b f186378d = new C70081b();

    /* renamed from: e */
    final C69822d f186379e;

    /* renamed from: f */
    final AtomicReference f186380f = new AtomicReference();

    /* renamed from: g */
    C69803b f186381g;

    /* renamed from: h */
    volatile boolean f186382h;

    public C69925af(C70123o oVar, C69822d dVar) {
        this.f186375a = oVar;
        this.f186379e = dVar;
    }

    /* renamed from: a */
    public final void mo25986a() {
        this.f186377c.decrementAndGet();
        mo61521g();
    }

    /* renamed from: b */
    public final void mo25987b(Throwable th) {
        this.f186377c.decrementAndGet();
        if (C70085f.m101987d(this.f186378d, th)) {
            this.f186376b.dispose();
            mo61521g();
            return;
        }
        C70101a.m102023e(th);
    }

    /* renamed from: d */
    public final void mo26850d(C69803b bVar) {
        if (C69828d.m101308d(this.f186381g, bVar)) {
            this.f186381g = bVar;
            this.f186375a.mo26850d(this);
        }
    }

    public final void dispose() {
        this.f186382h = true;
        this.f186381g.dispose();
        this.f186376b.dispose();
    }

    /* renamed from: e */
    public final boolean mo25859e() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo61520f() {
        C70038d dVar = (C70038d) this.f186380f.get();
        if (dVar != null) {
            dVar.mo61475c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo61521g() {
        if (getAndIncrement() == 0) {
            mo61522h();
        }
    }

    /* renamed from: lL */
    public final void mo25988lL(Object obj) {
        try {
            C70131w wVar = (C70131w) this.f186379e.mo25875a(obj);
            C69841j.m101337b(wVar, "The mapper returned a null SingleSource");
            this.f186377c.getAndIncrement();
            C69924ae aeVar = new C69924ae(this);
            if (!this.f186382h && this.f186376b.mo61462b(aeVar)) {
                wVar.mo61675o(aeVar);
            }
        } catch (Throwable th) {
            C69813f.m101292a(th);
            this.f186381g.dispose();
            mo25987b(th);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo61522h() {
        C70123o oVar = this.f186375a;
        AtomicInteger atomicInteger = this.f186377c;
        AtomicReference atomicReference = this.f186380f;
        int i = 1;
        while (!this.f186382h) {
            if (((Throwable) this.f186378d.get()) == null) {
                int i2 = atomicInteger.get();
                C70038d dVar = (C70038d) atomicReference.get();
                Object lN = dVar != null ? dVar.mo61479lN() : null;
                if (i2 == 0) {
                    if (lN == null) {
                        Throwable c = C70085f.m101986c(this.f186378d);
                        if (c != null) {
                            oVar.mo25987b(c);
                            return;
                        } else {
                            oVar.mo25986a();
                            return;
                        }
                    }
                } else if (lN == null) {
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
                oVar.mo25988lL(lN);
            } else {
                Throwable c2 = C70085f.m101986c(this.f186378d);
                mo61520f();
                oVar.mo25987b(c2);
                return;
            }
        }
        mo61520f();
    }
}
