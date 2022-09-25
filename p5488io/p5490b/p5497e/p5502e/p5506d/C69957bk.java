package p5488io.p5490b.p5497e.p5502e.p5506d;

import java.util.concurrent.atomic.AtomicInteger;
import p5488io.p5490b.C70123o;
import p5488io.p5490b.p5497e.p5500c.C69843b;

/* renamed from: io.b.e.e.d.bk */
/* compiled from: PG */
public final class C69957bk extends AtomicInteger implements Runnable, C69843b {
    private static final long serialVersionUID = 3880992722410194083L;

    /* renamed from: a */
    final C70123o f186459a;

    /* renamed from: b */
    final Object f186460b;

    public C69957bk(C70123o oVar, Object obj) {
        this.f186459a = oVar;
        this.f186460b = obj;
    }

    /* renamed from: c */
    public final void mo61475c() {
        lazySet(3);
    }

    public final void dispose() {
        set(3);
    }

    /* renamed from: e */
    public final boolean mo25859e() {
        throw null;
    }

    /* renamed from: i */
    public final boolean mo61476i() {
        return get() != 1;
    }

    /* renamed from: j */
    public final boolean mo61477j(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    /* renamed from: lM */
    public final int mo61478lM(int i) {
        lazySet(1);
        return 1;
    }

    /* renamed from: lN */
    public final Object mo61479lN() {
        if (get() != 1) {
            return null;
        }
        lazySet(3);
        return this.f186460b;
    }

    public final void run() {
        if (get() == 0 && compareAndSet(0, 2)) {
            this.f186459a.mo25988lL(this.f186460b);
            if (get() == 2) {
                lazySet(3);
                this.f186459a.mo25986a();
            }
        }
    }
}
