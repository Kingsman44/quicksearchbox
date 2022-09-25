package p5488io.p5490b.p5497e.p5502e.p5507e;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.p5649d.C72640c;
import p5488io.p5490b.C70094g;
import p5488io.p5490b.C70127s;
import p5488io.p5490b.p5495c.C69814g;
import p5488io.p5490b.p5497e.p5509f.C70037c;
import p5488io.p5490b.p5497e.p5512i.C70079c;
import p5488io.p5490b.p5497e.p5513j.C70082c;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: io.b.e.e.e.i */
/* compiled from: PG */
abstract class C70005i extends AtomicInteger implements Runnable, C70094g, C72640c {
    private static final long serialVersionUID = 9222303586456402150L;

    /* renamed from: a */
    final int f186611a;

    /* renamed from: b */
    final int f186612b;

    /* renamed from: c */
    final C70037c f186613c;

    /* renamed from: d */
    final C70127s f186614d;

    /* renamed from: e */
    C72640c f186615e;

    /* renamed from: f */
    volatile boolean f186616f;

    /* renamed from: g */
    Throwable f186617g;

    /* renamed from: h */
    final AtomicLong f186618h = new AtomicLong();

    /* renamed from: i */
    volatile boolean f186619i;

    /* renamed from: j */
    int f186620j;

    public C70005i(int i, C70037c cVar, C70127s sVar) {
        this.f186611a = i;
        this.f186613c = cVar;
        this.f186612b = i - (i >> 2);
        this.f186614d = sVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo61573b() {
        if (getAndIncrement() == 0) {
            this.f186614d.mo61591a(this);
        }
    }

    /* renamed from: e */
    public final void mo61489e(long j) {
        if (C70079c.m101976g(j)) {
            C70082c.m101981a(this.f186618h, j);
            mo61573b();
        }
    }

    /* renamed from: f */
    public final void mo61497f(Throwable th) {
        if (this.f186616f) {
            C70101a.m102023e(th);
            return;
        }
        this.f186617g = th;
        this.f186616f = true;
        mo61573b();
    }

    /* renamed from: g */
    public final void mo61498g(Object obj) {
        if (!this.f186616f) {
            if (!this.f186613c.mo61477j(obj)) {
                this.f186615e.mo61490lP();
                mo61497f(new C69814g("Queue is full?!"));
                return;
            }
            mo61573b();
        }
    }

    /* renamed from: lK */
    public final void mo61499lK() {
        if (!this.f186616f) {
            this.f186616f = true;
            mo61573b();
        }
    }

    /* renamed from: lP */
    public final void mo61490lP() {
        if (!this.f186619i) {
            this.f186619i = true;
            this.f186615e.mo61490lP();
            this.f186614d.dispose();
            if (getAndIncrement() == 0) {
                this.f186613c.mo61475c();
            }
        }
    }
}
