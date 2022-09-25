package p5488io.p5490b.p5497e.p5502e.p5507e;

import java.util.concurrent.atomic.AtomicLongArray;
import org.p5649d.C72640c;
import p5488io.p5490b.p5497e.p5512i.C70079c;
import p5488io.p5490b.p5497e.p5513j.C70082c;

/* renamed from: io.b.e.e.e.b */
/* compiled from: PG */
final class C69998b implements C72640c {

    /* renamed from: a */
    final int f186578a;

    /* renamed from: b */
    final int f186579b;

    /* renamed from: c */
    final /* synthetic */ C69999c f186580c;

    public C69998b(C69999c cVar, int i, int i2) {
        this.f186580c = cVar;
        this.f186578a = i;
        this.f186579b = i2;
    }

    /* renamed from: e */
    public final void mo61489e(long j) {
        long j2;
        if (C70079c.m101976g(j)) {
            AtomicLongArray atomicLongArray = this.f186580c.f186582b;
            do {
                j2 = atomicLongArray.get(this.f186578a);
                if (j2 != Long.MAX_VALUE) {
                } else {
                    return;
                }
            } while (!atomicLongArray.compareAndSet(this.f186578a, j2, C70082c.m101982b(j2, j)));
            if (this.f186580c.f186592l.get() == this.f186579b) {
                this.f186580c.mo61564b();
            }
        }
    }

    /* renamed from: lP */
    public final void mo61490lP() {
        if (this.f186580c.f186582b.compareAndSet(this.f186578a + this.f186579b, 0, 1)) {
            C69999c cVar = this.f186580c;
            int i = this.f186579b;
            if (cVar.f186582b.decrementAndGet(i + i) == 0) {
                cVar.f186591k = true;
                cVar.f186586f.mo61490lP();
                if (cVar.getAndIncrement() == 0) {
                    cVar.f186587g.mo61475c();
                }
            }
        }
    }
}
