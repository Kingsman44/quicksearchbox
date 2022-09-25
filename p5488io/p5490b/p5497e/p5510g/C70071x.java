package p5488io.p5490b.p5497e.p5510g;

import java.util.concurrent.Callable;

/* renamed from: io.b.e.g.x */
/* compiled from: PG */
public final class C70071x extends C70039a implements Callable {
    private static final long serialVersionUID = 1811839108042568751L;

    public C70071x(Runnable runnable) {
        super(runnable);
    }

    public final /* bridge */ /* synthetic */ Object call() {
        this.f186701d = Thread.currentThread();
        try {
            this.f186700c.run();
            return null;
        } finally {
            lazySet(f186698a);
            this.f186701d = null;
        }
    }
}
