package p5488io.p5490b.p5497e.p5510g;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p5488io.p5490b.C70127s;
import p5488io.p5490b.C70128t;

/* renamed from: io.b.e.g.r */
/* compiled from: PG */
public final class C70065r extends C70128t {

    /* renamed from: b */
    public static final C70069v f186772b;

    /* renamed from: c */
    static final C70069v f186773c;

    /* renamed from: d */
    static final C70064q f186774d;

    /* renamed from: e */
    static final C70062o f186775e;

    /* renamed from: h */
    private static final long f186776h = Long.getLong("rx2.io-keep-alive-time", 60).longValue();

    /* renamed from: i */
    private static final TimeUnit f186777i = TimeUnit.SECONDS;

    /* renamed from: f */
    final ThreadFactory f186778f;

    /* renamed from: g */
    final AtomicReference f186779g;

    static {
        C70064q qVar = new C70064q(new C70069v("RxCachedThreadSchedulerShutdown"));
        f186774d = qVar;
        qVar.dispose();
        int max = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        C70069v vVar = new C70069v("RxCachedThreadScheduler", max, false);
        f186772b = vVar;
        f186773c = new C70069v("RxCachedWorkerPoolEvictor", max, false);
        C70062o oVar = new C70062o(0, (TimeUnit) null, vVar);
        f186775e = oVar;
        oVar.mo61609a();
    }

    public C70065r() {
        throw null;
    }

    /* renamed from: a */
    public final C70127s mo61458a() {
        return new C70063p((C70062o) this.f186779g.get());
    }

    public C70065r(ThreadFactory threadFactory) {
        this.f186778f = threadFactory;
        C70062o oVar = f186775e;
        AtomicReference atomicReference = new AtomicReference(oVar);
        this.f186779g = atomicReference;
        C70062o oVar2 = new C70062o(f186776h, f186777i, threadFactory);
        while (!atomicReference.compareAndSet(oVar, oVar2)) {
            if (atomicReference.get() != oVar) {
                oVar2.mo61609a();
                return;
            }
        }
    }
}
