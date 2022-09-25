package p5488io.p5490b.p5497e.p5510g;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p5488io.p5490b.C70127s;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5494b.C69804c;
import p5488io.p5490b.p5497e.p5498a.C69829e;

/* renamed from: io.b.e.g.ah */
/* compiled from: PG */
final class C70047ah extends C70127s implements C69803b {

    /* renamed from: a */
    final PriorityBlockingQueue f186721a = new PriorityBlockingQueue();

    /* renamed from: b */
    final AtomicInteger f186722b = new AtomicInteger();

    /* renamed from: c */
    volatile boolean f186723c;

    /* renamed from: d */
    private final AtomicInteger f186724d = new AtomicInteger();

    /* renamed from: a */
    public final C69803b mo61591a(Runnable runnable) {
        return mo61592f(runnable, m102070d(TimeUnit.MILLISECONDS));
    }

    /* renamed from: b */
    public final C69803b mo61456b(Runnable runnable, long j, TimeUnit timeUnit) {
        long d = m102070d(TimeUnit.MILLISECONDS) + timeUnit.toMillis(j);
        return mo61592f(new C70044ae(runnable, this, d), d);
    }

    public final void dispose() {
        this.f186723c = true;
    }

    /* renamed from: e */
    public final boolean mo25859e() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final C69803b mo61592f(Runnable runnable, long j) {
        if (this.f186723c) {
            return C69829e.INSTANCE;
        }
        C70045af afVar = new C70045af(runnable, Long.valueOf(j), this.f186722b.incrementAndGet());
        this.f186721a.add(afVar);
        if (this.f186724d.getAndIncrement() != 0) {
            return C69804c.m101282a(new C70046ag(this, afVar));
        }
        int i = 1;
        while (!this.f186723c) {
            C70045af afVar2 = (C70045af) this.f186721a.poll();
            if (afVar2 == null) {
                i = this.f186724d.addAndGet(-i);
                if (i == 0) {
                    return C69829e.INSTANCE;
                }
            } else if (!afVar2.f186718d) {
                afVar2.f186715a.run();
            }
        }
        this.f186721a.clear();
        return C69829e.INSTANCE;
    }
}
