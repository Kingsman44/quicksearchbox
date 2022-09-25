package p5488io.p5490b.p5497e.p5510g;

import java.util.concurrent.atomic.AtomicReference;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5497e.p5498a.C69828d;
import p5488io.p5490b.p5497e.p5498a.C69831g;

/* renamed from: io.b.e.g.h */
/* compiled from: PG */
final class C70055h extends AtomicReference implements Runnable, C69803b {
    private static final long serialVersionUID = -4101336210206799084L;

    /* renamed from: a */
    final C69831g f186742a = new C69831g();

    /* renamed from: b */
    final C69831g f186743b = new C69831g();

    public C70055h(Runnable runnable) {
        super(runnable);
    }

    public final void dispose() {
        if (getAndSet((Object) null) != null) {
            C69828d.m101309f(this.f186742a);
            C69828d.m101309f(this.f186743b);
        }
    }

    /* renamed from: e */
    public final boolean mo25859e() {
        throw null;
    }

    public final void run() {
        Runnable runnable = (Runnable) get();
        if (runnable != null) {
            try {
                runnable.run();
            } finally {
                lazySet((Object) null);
                this.f186742a.lazySet(C69828d.f186198a);
                this.f186743b.lazySet(C69828d.f186198a);
            }
        }
    }
}
