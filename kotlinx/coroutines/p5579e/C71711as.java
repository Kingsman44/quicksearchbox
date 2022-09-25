package kotlinx.coroutines.p5579e;

import p5462h.p5483m.C69764m;

/* renamed from: kotlinx.coroutines.e.as */
/* compiled from: PG */
public final /* synthetic */ class C71711as {
    /* renamed from: a */
    public static final long m104849a(String str, long j, long j2, long j3) {
        String a = C71710ar.m104848a(str);
        if (a == null) {
            return j;
        }
        Long e = C69764m.m101226e(a);
        if (e != null) {
            long longValue = e.longValue();
            if (j2 <= longValue && longValue <= j3) {
                return longValue;
            }
            throw new IllegalStateException("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + longValue + "'");
        }
        throw new IllegalStateException("System property '" + str + "' has unrecognized value '" + a + "'");
    }

    /* renamed from: b */
    public static final boolean m104850b(String str, boolean z) {
        String a = C71710ar.m104848a(str);
        return a != null ? Boolean.parseBoolean(a) : z;
    }

    /* renamed from: c */
    public static /* synthetic */ int m104851c(String str, int i, int i2, int i3, int i4) {
        int i5 = i2 | (((i4 & 4) != 0 ? 0 : 1) ^ 1);
        if ((i4 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return (int) m104849a(str, (long) i, (long) i5, (long) i3);
    }
}
