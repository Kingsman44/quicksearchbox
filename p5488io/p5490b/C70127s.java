package p5488io.p5490b;

import java.util.concurrent.TimeUnit;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5497e.p5498a.C69828d;
import p5488io.p5490b.p5497e.p5498a.C69829e;
import p5488io.p5490b.p5497e.p5498a.C69831g;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: io.b.s */
/* compiled from: PG */
public abstract class C70127s implements C69803b {
    /* renamed from: d */
    public static final long m102070d(TimeUnit timeUnit) {
        return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    /* renamed from: a */
    public C69803b mo61591a(Runnable runnable) {
        return mo61456b(runnable, 0, TimeUnit.NANOSECONDS);
    }

    /* renamed from: b */
    public abstract C69803b mo61456b(Runnable runnable, long j, TimeUnit timeUnit);

    /* renamed from: c */
    public final C69803b mo61662c(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        long j3 = j;
        TimeUnit timeUnit2 = timeUnit;
        C69831g gVar = new C69831g();
        C69831g gVar2 = new C69831g(gVar);
        Runnable d = C70101a.m102022d(runnable);
        long nanos = timeUnit2.toNanos(j2);
        long d2 = m102070d(TimeUnit.NANOSECONDS);
        C69803b b = mo61456b(new C70126r(this, d2 + timeUnit2.toNanos(j3), d, d2, gVar2, nanos), j3, timeUnit2);
        if (b == C69829e.INSTANCE) {
            return b;
        }
        C69828d.m101310g(gVar, b);
        return gVar2;
    }
}
