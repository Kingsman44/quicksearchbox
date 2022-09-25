package p5488io.p5490b.p5497e.p5510g;

import p5488io.p5490b.p5517i.C70101a;

/* renamed from: io.b.e.g.w */
/* compiled from: PG */
public final class C70070w extends C70039a implements Runnable {
    private static final long serialVersionUID = 1811839108042568751L;

    public C70070w(Runnable runnable) {
        super(runnable);
    }

    public final void run() {
        this.f186701d = Thread.currentThread();
        try {
            this.f186700c.run();
            this.f186701d = null;
        } catch (Throwable th) {
            this.f186701d = null;
            lazySet(f186698a);
            C70101a.m102023e(th);
        }
    }
}
