package androidx.media3.extractor.p160g;

import androidx.media3.common.p136b.C2601a;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.extractor.C3351az;
import androidx.media3.extractor.C3365bc;
import com.google.common.p4535g.C59203do;

/* renamed from: androidx.media3.extractor.g.h */
/* compiled from: PG */
final class C3411h implements C3409f {

    /* renamed from: a */
    private final long f10445a;

    /* renamed from: b */
    private final int f10446b;

    /* renamed from: c */
    private final long f10447c;

    /* renamed from: d */
    private final long f10448d;

    /* renamed from: e */
    private final long f10449e;

    /* renamed from: f */
    private final long[] f10450f;

    public C3411h(long j, int i, long j2, long j3, long[] jArr) {
        this.f10445a = j;
        this.f10446b = i;
        this.f10447c = j2;
        this.f10450f = jArr;
        this.f10448d = j3;
        this.f10449e = j3 != -1 ? j + j3 : -1;
    }

    /* renamed from: d */
    private final long m9880d(int i) {
        return (this.f10447c * ((long) i)) / 100;
    }

    /* renamed from: b */
    public final C3351az mo7324b(long j) {
        double d;
        if (!mo7326t()) {
            C3365bc bcVar = new C3365bc(0, this.f10445a + ((long) this.f10446b));
            return new C3351az(bcVar, bcVar);
        }
        long s = C2612ak.m6994s(j, 0, this.f10447c);
        double d2 = (double) s;
        Double.isNaN(d2);
        double d3 = (double) this.f10447c;
        Double.isNaN(d3);
        double d4 = (d2 * 100.0d) / d3;
        double d5 = C59203do.f157270a;
        if (d4 > C59203do.f157270a) {
            if (d4 >= 100.0d) {
                d5 = 256.0d;
            } else {
                int i = (int) d4;
                long[] jArr = (long[]) C2601a.m6829a(this.f10450f);
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
        double d8 = (double) this.f10448d;
        Double.isNaN(d8);
        C3365bc bcVar2 = new C3365bc(s, this.f10445a + C2612ak.m6994s(Math.round((d5 / 256.0d) * d8), (long) this.f10446b, this.f10448d - 1));
        return new C3351az(bcVar2, bcVar2);
    }

    /* renamed from: e */
    public final long mo7377e() {
        return this.f10449e;
    }

    /* renamed from: f */
    public final long mo7378f(long j) {
        long j2;
        double d;
        long j3 = j - this.f10445a;
        if (!mo7326t() || j3 <= ((long) this.f10446b)) {
            return 0;
        }
        long[] jArr = (long[]) C2601a.m6829a(this.f10450f);
        double d2 = (double) j3;
        Double.isNaN(d2);
        double d3 = (double) this.f10448d;
        Double.isNaN(d3);
        double d4 = (d2 * 256.0d) / d3;
        int aw = C2612ak.m6973aw(jArr, (long) d4, true);
        long d5 = m9880d(aw);
        long j4 = jArr[aw];
        int i = aw + 1;
        long d6 = m9880d(i);
        if (aw == 99) {
            j2 = 256;
        } else {
            j2 = jArr[i];
        }
        if (j4 == j2) {
            d = C59203do.f157270a;
        } else {
            double d7 = (double) j4;
            Double.isNaN(d7);
            double d8 = (double) (j2 - j4);
            Double.isNaN(d8);
            d = (d4 - d7) / d8;
        }
        double d9 = (double) (d6 - d5);
        Double.isNaN(d9);
        return d5 + Math.round(d * d9);
    }

    /* renamed from: r */
    public final long mo7325r() {
        return this.f10447c;
    }

    /* renamed from: t */
    public final boolean mo7326t() {
        return this.f10450f != null;
    }
}
