package p5462h.p5484n;

import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5480j.C69698f;
import p5462h.p5480j.C69699g;

/* renamed from: h.n.a */
/* compiled from: PG */
public final class C69779a implements Comparable {

    /* renamed from: a */
    public static final /* synthetic */ int f186156a = 0;

    /* renamed from: b */
    private static final long f186157b = C69781c.m101246a(4611686018427387903L);

    /* renamed from: c */
    private static final long f186158c = C69781c.m101246a(-4611686018427387903L);

    static {
        int i = C69780b.f186159a;
    }

    /* renamed from: a */
    public static final long m101237a(long j) {
        return m101238b(j, C69782d.SECONDS);
    }

    /* renamed from: b */
    public static final long m101238b(long j, C69782d dVar) {
        C69664n.m101061g(dVar, "unit");
        if (j == f186157b) {
            return Long.MAX_VALUE;
        }
        if (j == f186158c) {
            return Long.MIN_VALUE;
        }
        return C69783e.m101249a(j >> 1, m101241e(j) ? C69782d.NANOSECONDS : C69782d.MILLISECONDS, dVar);
    }

    /* renamed from: c */
    public static final boolean m101239c(long j) {
        return !m101242f(j);
    }

    /* renamed from: d */
    public static final boolean m101240d(long j) {
        return (((int) j) & 1) == 1;
    }

    /* renamed from: e */
    public static final boolean m101241e(long j) {
        return (((int) j) & 1) == 0;
    }

    /* renamed from: f */
    public static final boolean m101242f(long j) {
        return j == f186157b || j == f186158c;
    }

    /* renamed from: g */
    public static final long m101243g(long j, long j2) {
        long j3 = j2 / 1000000;
        long j4 = j + j3;
        if (!new C69698f(-4611686018426L, 4611686018426L).mo61422b(j4)) {
            return C69781c.m101246a(C69699g.m101120b(j4, -4611686018427387903L, 4611686018427387903L));
        }
        long j5 = (j4 * 1000000) + (j2 - (j3 * 1000000));
        long j6 = j5 + j5;
        int i = C69780b.f186159a;
        return j6;
    }

    /* renamed from: h */
    public static int m101244h(long j) {
        if (j < 0 || (((int) j) & 1) == 0) {
            return C69664n.m101056b(j, 0);
        }
        return 1;
    }

    /* renamed from: i */
    public static void m101245i() {
        int i = C69780b.f186159a;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        throw null;
    }

    public final boolean equals(Object obj) {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        throw null;
    }
}
