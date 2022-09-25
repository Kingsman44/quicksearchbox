package com.google.ads.interactivemedia.p367v3.internal;

import android.util.Pair;
import com.google.common.p4535g.C59203do;

/* renamed from: com.google.ads.interactivemedia.v3.internal.lw */
/* compiled from: PG */
final class C7105lw implements C7108lz {

    /* renamed from: a */
    private final long[] f22868a;

    /* renamed from: b */
    private final long[] f22869b;

    /* renamed from: c */
    private final long f22870c;

    private C7105lw(long[] jArr, long[] jArr2, long j) {
        this.f22868a = jArr;
        this.f22869b = jArr2;
        this.f22870c = j == -9223372036854775807L ? C6821bi.m19755b(jArr2[jArr2.length - 1]) : j;
    }

    /* renamed from: f */
    public static C7105lw m21090f(long j, C7277sf sfVar, long j2) {
        int length = sfVar.f23746d.length;
        int i = length + 1;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        jArr[0] = j;
        long j3 = 0;
        jArr2[0] = 0;
        for (int i2 = 1; i2 <= length; i2++) {
            int i3 = i2 - 1;
            j += (long) (sfVar.f23744b + sfVar.f23746d[i3]);
            j3 += (long) (sfVar.f23745c + sfVar.f23747e[i3]);
            jArr[i2] = j;
            jArr2[i2] = j3;
        }
        return new C7105lw(jArr, jArr2, j2);
    }

    /* renamed from: g */
    private static Pair m21091g(long j, long[] jArr, long[] jArr2) {
        double d;
        int an = aeu.m18523an(jArr, j, true);
        long j2 = jArr[an];
        long j3 = jArr2[an];
        int i = an + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        long j4 = jArr[i];
        long j5 = jArr2[i];
        if (j4 == j2) {
            d = C59203do.f157270a;
        } else {
            double d2 = (double) j;
            double d3 = (double) j2;
            Double.isNaN(d2);
            Double.isNaN(d3);
            double d4 = (double) (j4 - j2);
            Double.isNaN(d4);
            d = (d2 - d3) / d4;
        }
        Long valueOf = Long.valueOf(j);
        double d5 = (double) (j5 - j3);
        Double.isNaN(d5);
        return Pair.create(valueOf, Long.valueOf(((long) (d * d5)) + j3));
    }

    /* renamed from: a */
    public final boolean mo16074a() {
        return true;
    }

    /* renamed from: b */
    public final C7068km mo16075b(long j) {
        Pair g = m21091g(C6821bi.m19754a(aeu.m18491I(j, 0, this.f22870c)), this.f22869b, this.f22868a);
        long longValue = ((Long) g.first).longValue();
        C7071kp kpVar = new C7071kp(C6821bi.m19755b(longValue), ((Long) g.second).longValue());
        return new C7068km(kpVar, kpVar);
    }

    /* renamed from: c */
    public final long mo16076c() {
        return this.f22870c;
    }

    /* renamed from: d */
    public final long mo16129d(long j) {
        return C6821bi.m19755b(((Long) m21091g(j, this.f22868a, this.f22869b).second).longValue());
    }

    /* renamed from: e */
    public final long mo16130e() {
        return -1;
    }
}
