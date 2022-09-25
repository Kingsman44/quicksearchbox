package p5488io.p5490b.p5497e.p5502e.p5506d;

import java.util.concurrent.atomic.AtomicInteger;
import p5488io.p5490b.C69801b;
import p5488io.p5490b.C69818d;
import p5488io.p5490b.C70123o;
import p5488io.p5490b.p5494b.C69802a;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5495c.C69813f;
import p5488io.p5490b.p5496d.C69822d;
import p5488io.p5490b.p5497e.p5498a.C69828d;
import p5488io.p5490b.p5497e.p5499b.C69841j;
import p5488io.p5490b.p5497e.p5513j.C70081b;
import p5488io.p5490b.p5497e.p5513j.C70085f;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: io.b.e.e.d.ac */
/* compiled from: PG */
final class C69922ac extends AtomicInteger implements C69803b, C70123o {
    private static final long serialVersionUID = 8443155186132538303L;

    /* renamed from: a */
    final C69801b f186366a;

    /* renamed from: b */
    final C70081b f186367b = new C70081b();

    /* renamed from: c */
    final C69822d f186368c;

    /* renamed from: d */
    final C69802a f186369d = new C69802a();

    /* renamed from: e */
    C69803b f186370e;

    /* renamed from: f */
    volatile boolean f186371f;

    public C69922ac(C69801b bVar, C69822d dVar) {
        this.f186366a = bVar;
        this.f186368c = dVar;
        lazySet(1);
    }

    /* renamed from: a */
    public final void mo25986a() {
        if (decrementAndGet() == 0) {
            Throwable c = C70085f.m101986c(this.f186367b);
            if (c != null) {
                this.f186366a.mo26091b(c);
            } else {
                this.f186366a.mo26090a();
            }
        }
    }

    /* renamed from: b */
    public final void mo25987b(Throwable th) {
        if (C70085f.m101987d(this.f186367b, th)) {
            dispose();
            if (getAndSet(0) > 0) {
                this.f186366a.mo26091b(C70085f.m101986c(this.f186367b));
                return;
            }
            return;
        }
        C70101a.m102023e(th);
    }

    /* renamed from: d */
    public final void mo26850d(C69803b bVar) {
        if (C69828d.m101308d(this.f186370e, bVar)) {
            this.f186370e = bVar;
            this.f186366a.mo61460lO(this);
        }
    }

    public final void dispose() {
        this.f186371f = true;
        this.f186370e.dispose();
        this.f186369d.dispose();
    }

    /* renamed from: e */
    public final boolean mo25859e() {
        throw null;
    }

    /* renamed from: lL */
    public final void mo25988lL(Object obj) {
        try {
            C69818d dVar = (C69818d) this.f186368c.mo25875a(obj);
            C69841j.m101337b(dVar, "The mapper returned a null CompletableSource");
            getAndIncrement();
            C69921ab abVar = new C69921ab(this);
            if (!this.f186371f && this.f186369d.mo61462b(abVar)) {
                dVar.mo42459a(abVar);
            }
        } catch (Throwable th) {
            C69813f.m101292a(th);
            this.f186370e.dispose();
            mo25987b(th);
        }
    }
}
