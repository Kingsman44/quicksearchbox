package p5488io.p5490b;

import java.util.concurrent.TimeUnit;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5497e.p5498a.C69829e;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: io.b.t */
/* compiled from: PG */
public abstract class C70128t {

    /* renamed from: a */
    static final long f186901a = TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());

    /* renamed from: a */
    public abstract C70127s mo61458a();

    /* renamed from: b */
    public C69803b mo61593b(Runnable runnable) {
        return mo61459c(runnable, 0, TimeUnit.NANOSECONDS);
    }

    /* renamed from: c */
    public C69803b mo61459c(Runnable runnable, long j, TimeUnit timeUnit) {
        C70127s a = mo61458a();
        C70124p pVar = new C70124p(C70101a.m102022d(runnable), a);
        a.mo61456b(pVar, j, timeUnit);
        return pVar;
    }

    /* renamed from: d */
    public C69803b mo61587d(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        C70127s a = mo61458a();
        C70125q qVar = new C70125q(C70101a.m102022d(runnable), a);
        C69803b c = a.mo61662c(qVar, j, j2, timeUnit);
        return c == C69829e.INSTANCE ? c : qVar;
    }
}
