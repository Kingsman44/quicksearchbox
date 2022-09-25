package com.google.ads.interactivemedia.p367v3.internal;

import android.util.Log;
import com.google.common.p4535g.C59203do;

/* renamed from: com.google.ads.interactivemedia.v3.internal.mb */
/* compiled from: PG */
final class C7111mb implements C7108lz {

    /* renamed from: a */
    private final long f22901a;

    /* renamed from: b */
    private final int f22902b;

    /* renamed from: c */
    private final long f22903c;

    /* renamed from: d */
    private final long f22904d;

    /* renamed from: e */
    private final long f22905e;

    /* renamed from: f */
    private final long[] f22906f;

    private C7111mb(long j, int i, long j2, long j3, long[] jArr) {
        this.f22901a = j;
        this.f22902b = i;
        this.f22903c = j2;
        this.f22906f = jArr;
        this.f22904d = j3;
        this.f22905e = j3 != -1 ? j + j3 : -1;
    }

    /* renamed from: f */
    public static C7111mb m21119f(long j, long j2, C7012ik ikVar, aee aee) {
        int B;
        long j3 = j;
        C7012ik ikVar2 = ikVar;
        int i = ikVar2.f22431g;
        int i2 = ikVar2.f22428d;
        int v = aee.mo14568v();
        if ((v & 1) != 1 || (B = aee.mo14538B()) == 0) {
            return null;
        }
        long N = aeu.m18496N((long) B, ((long) i) * 1000000, (long) i2);
        if ((v & 6) != 6) {
            return new C7111mb(j2, ikVar2.f22427c, N, -1, (long[]) null);
        }
        long t = aee.mo14566t();
        long[] jArr = new long[100];
        for (int i3 = 0; i3 < 100; i3++) {
            jArr[i3] = (long) aee.mo14560n();
        }
        if (j3 != -1) {
            long j4 = j2 + t;
            if (j3 != j4) {
                StringBuilder sb = new StringBuilder(67);
                sb.append("XING data size mismatch: ");
                sb.append(j3);
                sb.append(", ");
                sb.append(j4);
                Log.w("XingSeeker", sb.toString());
            }
        }
        return new C7111mb(j2, ikVar2.f22427c, N, t, jArr);
    }

    /* renamed from: g */
    private final long m21120g(int i) {
        return (this.f22903c * ((long) i)) / 100;
    }

    /* renamed from: a */
    public final boolean mo16074a() {
        return this.f22906f != null;
    }

    /* renamed from: b */
    public final C7068km mo16075b(long j) {
        double d;
        if (!mo16074a()) {
            C7071kp kpVar = new C7071kp(0, this.f22901a + ((long) this.f22902b));
            return new C7068km(kpVar, kpVar);
        }
        long I = aeu.m18491I(j, 0, this.f22903c);
        double d2 = (double) I;
        Double.isNaN(d2);
        double d3 = (double) this.f22903c;
        Double.isNaN(d3);
        double d4 = (d2 * 100.0d) / d3;
        double d5 = C59203do.f157270a;
        if (d4 > C59203do.f157270a) {
            if (d4 >= 100.0d) {
                d5 = 256.0d;
            } else {
                int i = (int) d4;
                long[] jArr = (long[]) ary.m19466s(this.f22906f);
                double d6 = (double) jArr[i];
                if (i == 99) {
                    d = 256.0d;
                } else {
                    d = (double) jArr[i + 1];
                }
                double d7 = (double) i;
                Double.isNaN(d7);
                Double.isNaN(d6);
                Double.isNaN(d6);
                d5 = d6 + ((d4 - d7) * (d - d6));
            }
        }
        double d8 = (double) this.f22904d;
        Double.isNaN(d8);
        C7071kp kpVar2 = new C7071kp(I, this.f22901a + aeu.m18491I(Math.round((d5 / 256.0d) * d8), (long) this.f22902b, this.f22904d - 1));
        return new C7068km(kpVar2, kpVar2);
    }

    /* renamed from: c */
    public final long mo16076c() {
        return this.f22903c;
    }

    /* renamed from: d */
    public final long mo16129d(long j) {
        long j2;
        double d;
        long j3 = j - this.f22901a;
        if (!mo16074a() || j3 <= ((long) this.f22902b)) {
            return 0;
        }
        long[] jArr = (long[]) ary.m19466s(this.f22906f);
        double d2 = (double) j3;
        Double.isNaN(d2);
        double d3 = (double) this.f22904d;
        Double.isNaN(d3);
        double d4 = (d2 * 256.0d) / d3;
        int an = aeu.m18523an(jArr, (long) d4, true);
        long g = m21120g(an);
        long j4 = jArr[an];
        int i = an + 1;
        long g2 = m21120g(i);
        if (an == 99) {
            j2 = 256;
        } else {
            j2 = jArr[i];
        }
        if (j4 == j2) {
            d = C59203do.f157270a;
        } else {
            double d5 = (double) j4;
            Double.isNaN(d5);
            double d6 = (double) (j2 - j4);
            Double.isNaN(d6);
            d = (d4 - d5) / d6;
        }
        double d7 = (double) (g2 - g);
        Double.isNaN(d7);
        return g + Math.round(d * d7);
    }

    /* renamed from: e */
    public final long mo16130e() {
        return this.f22905e;
    }
}
