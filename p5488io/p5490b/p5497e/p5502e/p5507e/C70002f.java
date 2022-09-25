package p5488io.p5490b.p5497e.p5502e.p5507e;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.p5649d.C72639b;
import org.p5649d.C72640c;
import p5488io.p5490b.p5497e.p5512i.C70079c;
import p5488io.p5490b.p5497e.p5513j.C70081b;
import p5488io.p5490b.p5497e.p5513j.C70082c;

/* renamed from: io.b.e.e.e.f */
/* compiled from: PG */
abstract class C70002f extends AtomicInteger implements C72640c {
    private static final long serialVersionUID = 3100232009247827843L;

    /* renamed from: a */
    final C72639b f186603a;

    /* renamed from: b */
    final C70001e[] f186604b;

    /* renamed from: c */
    final C70081b f186605c = new C70081b();

    /* renamed from: d */
    final AtomicLong f186606d = new AtomicLong();

    /* renamed from: e */
    volatile boolean f186607e;

    /* renamed from: f */
    final AtomicInteger f186608f = new AtomicInteger();

    public C70002f(C72639b bVar, int i, int i2) {
        this.f186603a = bVar;
        C70001e[] eVarArr = new C70001e[i];
        for (int i3 = 0; i3 < i; i3++) {
            eVarArr[i3] = new C70001e(this, i2);
        }
        this.f186604b = eVarArr;
        this.f186608f.lazySet(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo61567a() {
        for (C70001e eVar : this.f186604b) {
            eVar.f186602e = null;
        }
    }

    /* renamed from: b */
    public abstract void mo61568b();

    /* renamed from: c */
    public abstract void mo61569c();

    /* renamed from: e */
    public final void mo61489e(long j) {
        if (C70079c.m101976g(j)) {
            C70082c.m101981a(this.f186606d, j);
            mo61568b();
        }
    }

    /* renamed from: f */
    public abstract void mo61570f(Throwable th);

    /* renamed from: g */
    public abstract void mo61571g(C70001e eVar, Object obj);

    /* renamed from: lP */
    public final void mo61490lP() {
        if (!this.f186607e) {
            this.f186607e = true;
            for (C70001e c : this.f186604b) {
                C70079c.m101974c(c);
            }
            if (getAndIncrement() == 0) {
                mo61567a();
            }
        }
    }
}
