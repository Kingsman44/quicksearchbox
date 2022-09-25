package p5462h.p5484n;

import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5480j.C69698f;
import p5462h.p5480j.C69699g;

/* renamed from: h.n.c */
/* compiled from: PG */
public final class C69781c {
    /* renamed from: a */
    public static final long m101246a(long j) {
        C69779a.m101245i();
        return j + j + 1;
    }

    /* renamed from: b */
    public static final long m101247b(int i, C69782d dVar) {
        C69664n.m101061g(dVar, "unit");
        if (dVar.compareTo(C69782d.SECONDS) > 0) {
            return m101248c((long) i, dVar);
        }
        long b = C69783e.m101250b((long) i, dVar, C69782d.NANOSECONDS);
        long j = b + b;
        C69779a.m101245i();
        return j;
    }

    /* renamed from: c */
    public static final long m101248c(long j, C69782d dVar) {
        C69664n.m101061g(dVar, "unit");
        long b = C69783e.m101250b(4611686018426999999L, C69782d.NANOSECONDS, dVar);
        if (!new C69698f(-b, b).mo61422b(j)) {
            return m101246a(C69699g.m101120b(C69783e.m101249a(j, dVar, C69782d.MILLISECONDS), -4611686018427387903L, 4611686018427387903L));
        }
        long b2 = C69783e.m101250b(j, dVar, C69782d.NANOSECONDS);
        C69779a.m101245i();
        return b2 + b2;
    }
}
