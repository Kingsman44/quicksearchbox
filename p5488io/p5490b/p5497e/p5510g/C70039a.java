package p5488io.p5490b.p5497e.p5510g;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5497e.p5499b.C69840i;

/* renamed from: io.b.e.g.a */
/* compiled from: PG */
class C70039a extends AtomicReference implements C69803b {

    /* renamed from: a */
    protected static final FutureTask f186698a = new FutureTask(C69840i.f186209b, (Object) null);

    /* renamed from: b */
    protected static final FutureTask f186699b = new FutureTask(C69840i.f186209b, (Object) null);
    private static final long serialVersionUID = 1811839108042568751L;

    /* renamed from: c */
    protected final Runnable f186700c;

    /* renamed from: d */
    protected Thread f186701d;

    public C70039a(Runnable runnable) {
        this.f186700c = runnable;
    }

    /* renamed from: a */
    public final void mo61584a(Future future) {
        Future future2;
        do {
            future2 = (Future) get();
            if (future2 != f186698a) {
                if (future2 == f186699b) {
                    future.cancel(this.f186701d != Thread.currentThread());
                    return;
                }
            } else {
                return;
            }
        } while (!compareAndSet(future2, future));
    }

    public final void dispose() {
        FutureTask futureTask;
        Future future = (Future) get();
        if (future != f186698a && future != (futureTask = f186699b) && compareAndSet(future, futureTask) && future != null) {
            future.cancel(this.f186701d != Thread.currentThread());
        }
    }

    /* renamed from: e */
    public final boolean mo25859e() {
        throw null;
    }

    public final String toString() {
        return String.valueOf(this.f186700c);
    }
}
