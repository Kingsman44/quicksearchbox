package p5488io.p5490b.p5497e.p5511h;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.p5649d.C72639b;
import org.p5649d.C72640c;
import p5488io.p5490b.C70094g;
import p5488io.p5490b.p5497e.p5512i.C70079c;
import p5488io.p5490b.p5497e.p5513j.C70081b;
import p5488io.p5490b.p5497e.p5513j.C70085f;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: io.b.e.h.c */
/* compiled from: PG */
public final class C70076c extends AtomicInteger implements C70094g, C72640c {
    private static final long serialVersionUID = -4945028590049415624L;

    /* renamed from: a */
    final C72639b f186802a;

    /* renamed from: b */
    final C70081b f186803b = new C70081b();

    /* renamed from: c */
    final AtomicLong f186804c = new AtomicLong();

    /* renamed from: d */
    final AtomicReference f186805d = new AtomicReference();

    /* renamed from: e */
    final AtomicBoolean f186806e = new AtomicBoolean();

    /* renamed from: f */
    volatile boolean f186807f;

    public C70076c(C72639b bVar) {
        this.f186802a = bVar;
    }

    /* renamed from: a */
    public final void mo61494a(C72640c cVar) {
        if (this.f186806e.compareAndSet(false, true)) {
            this.f186802a.mo61494a(this);
            AtomicReference atomicReference = this.f186805d;
            AtomicLong atomicLong = this.f186804c;
            if (C70079c.m101975f(atomicReference, cVar)) {
                long andSet = atomicLong.getAndSet(0);
                if (andSet != 0) {
                    cVar.mo61489e(andSet);
                    return;
                }
                return;
            }
            return;
        }
        cVar.mo61490lP();
        mo61490lP();
        mo61497f(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
    }

    /* renamed from: e */
    public final void mo61489e(long j) {
        if (j <= 0) {
            mo61490lP();
            mo61497f(new IllegalArgumentException("§3.9 violated: positive request amount required but it was " + j));
            return;
        }
        C70079c.m101972a(this.f186805d, this.f186804c, j);
    }

    /* renamed from: f */
    public final void mo61497f(Throwable th) {
        this.f186807f = true;
        C72639b bVar = this.f186802a;
        C70081b bVar2 = this.f186803b;
        if (!C70085f.m101987d(bVar2, th)) {
            C70101a.m102023e(th);
        } else if (getAndIncrement() == 0) {
            bVar.mo61497f(C70085f.m101986c(bVar2));
        }
    }

    /* renamed from: g */
    public final void mo61498g(Object obj) {
        C72639b bVar = this.f186802a;
        C70081b bVar2 = this.f186803b;
        if (get() == 0 && compareAndSet(0, 1)) {
            bVar.mo61498g(obj);
            if (decrementAndGet() != 0) {
                Throwable c = C70085f.m101986c(bVar2);
                if (c != null) {
                    bVar.mo61497f(c);
                } else {
                    bVar.mo61499lK();
                }
            }
        }
    }

    /* renamed from: lK */
    public final void mo61499lK() {
        this.f186807f = true;
        C72639b bVar = this.f186802a;
        C70081b bVar2 = this.f186803b;
        if (getAndIncrement() == 0) {
            Throwable c = C70085f.m101986c(bVar2);
            if (c != null) {
                bVar.mo61497f(c);
            } else {
                bVar.mo61499lK();
            }
        }
    }

    /* renamed from: lP */
    public final void mo61490lP() {
        if (!this.f186807f) {
            C70079c.m101974c(this.f186805d);
        }
    }
}
