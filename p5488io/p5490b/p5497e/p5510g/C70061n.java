package p5488io.p5490b.p5497e.p5510g;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5497e.p5499b.C69840i;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: io.b.e.g.n */
/* compiled from: PG */
final class C70061n implements Callable, C69803b {

    /* renamed from: a */
    static final FutureTask f186755a = new FutureTask(C69840i.f186209b, (Object) null);

    /* renamed from: b */
    final Runnable f186756b;

    /* renamed from: c */
    final AtomicReference f186757c = new AtomicReference();

    /* renamed from: d */
    final AtomicReference f186758d = new AtomicReference();

    /* renamed from: e */
    final ExecutorService f186759e;

    /* renamed from: f */
    Thread f186760f;

    public C70061n(Runnable runnable, ExecutorService executorService) {
        this.f186756b = runnable;
        this.f186759e = executorService;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo61607a(Future future) {
        Future future2;
        do {
            future2 = (Future) this.f186758d.get();
            if (future2 == f186755a) {
                future.cancel(this.f186760f != Thread.currentThread());
                return;
            }
        } while (!C70060m.m101923a(this.f186758d, future2, future));
    }

    public final /* bridge */ /* synthetic */ Object call() {
        this.f186760f = Thread.currentThread();
        try {
            this.f186756b.run();
            Future submit = this.f186759e.submit(this);
            while (true) {
                Future future = (Future) this.f186757c.get();
                if (future != f186755a) {
                    if (C70060m.m101923a(this.f186757c, future, submit)) {
                        break;
                    }
                } else {
                    submit.cancel(this.f186760f != Thread.currentThread());
                }
            }
            this.f186760f = null;
        } catch (Throwable th) {
            this.f186760f = null;
            C70101a.m102023e(th);
        }
        return null;
    }

    public final void dispose() {
        AtomicReference atomicReference = this.f186758d;
        FutureTask futureTask = f186755a;
        Future future = (Future) atomicReference.getAndSet(futureTask);
        boolean z = true;
        if (!(future == null || future == futureTask)) {
            future.cancel(this.f186760f != Thread.currentThread());
        }
        Future future2 = (Future) this.f186757c.getAndSet(futureTask);
        if (future2 != null && future2 != futureTask) {
            if (this.f186760f == Thread.currentThread()) {
                z = false;
            }
            future2.cancel(z);
        }
    }

    /* renamed from: e */
    public final boolean mo25859e() {
        throw null;
    }
}
