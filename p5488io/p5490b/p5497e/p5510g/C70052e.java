package p5488io.p5490b.p5497e.p5510g;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p5488io.p5490b.C70127s;
import p5488io.p5490b.C70128t;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5497e.p5499b.C69841j;
import p5488io.p5490b.p5497e.p5502e.p5507e.C70006j;

/* renamed from: io.b.e.g.e */
/* compiled from: PG */
public final class C70052e extends C70128t implements C70073z {

    /* renamed from: b */
    static final C70050c f186733b;

    /* renamed from: c */
    public static final C70069v f186734c;

    /* renamed from: d */
    static final int f186735d;

    /* renamed from: e */
    static final C70051d f186736e;

    /* renamed from: f */
    final ThreadFactory f186737f;

    /* renamed from: g */
    final AtomicReference f186738g;

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        int intValue = Integer.getInteger("rx2.computation-threads", 0).intValue();
        if (intValue > 0 && intValue <= availableProcessors) {
            availableProcessors = intValue;
        }
        f186735d = availableProcessors;
        C70051d dVar = new C70051d(new C70069v("RxComputationShutdown"));
        f186736e = dVar;
        dVar.dispose();
        C70069v vVar = new C70069v("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);
        f186734c = vVar;
        C70050c cVar = new C70050c(0, vVar);
        f186733b = cVar;
        cVar.mo61595b();
    }

    public C70052e() {
        throw null;
    }

    /* renamed from: a */
    public final C70127s mo61458a() {
        return new C70049b(((C70050c) this.f186738g.get()).mo61594a());
    }

    /* renamed from: c */
    public final C69803b mo61459c(Runnable runnable, long j, TimeUnit timeUnit) {
        return ((C70050c) this.f186738g.get()).mo61594a().mo61611f(runnable, j, timeUnit);
    }

    /* renamed from: d */
    public final C69803b mo61587d(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return ((C70050c) this.f186738g.get()).mo61594a().mo61612g(runnable, j, j2, timeUnit);
    }

    /* renamed from: e */
    public final void mo61596e(int i, C70006j jVar) {
        C69841j.m101338c(i, "number > 0 required");
        ((C70050c) this.f186738g.get()).mo61596e(i, jVar);
    }

    public C70052e(ThreadFactory threadFactory) {
        this.f186737f = threadFactory;
        C70050c cVar = f186733b;
        AtomicReference atomicReference = new AtomicReference(cVar);
        this.f186738g = atomicReference;
        C70050c cVar2 = new C70050c(f186735d, threadFactory);
        while (!atomicReference.compareAndSet(cVar, cVar2)) {
            if (atomicReference.get() != cVar) {
                cVar2.mo61595b();
                return;
            }
        }
    }
}
