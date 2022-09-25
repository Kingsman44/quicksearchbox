package androidx.media3.extractor.p160g;

import android.util.Pair;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.extractor.C3351az;
import androidx.media3.extractor.C3365bc;
import com.google.common.p4535g.C59203do;

/* renamed from: androidx.media3.extractor.g.c */
/* compiled from: PG */
final class C3406c implements C3409f {

    /* renamed from: a */
    private final long[] f10420a;

    /* renamed from: b */
    private final long[] f10421b;

    /* renamed from: c */
    private final long f10422c;

    public C3406c(long[] jArr, long[] jArr2, long j) {
        this.f10420a = jArr;
        this.f10421b = jArr2;
        this.f10422c = j == -9223372036854775807L ? C2612ak.m6998w(jArr2[jArr2.length - 1]) : j;
    }

    /* renamed from: d */
    private static Pair m9854d(long j, long[] jArr, long[] jArr2) {
        double d;
        int aw = C2612ak.m6973aw(jArr, j, true);
        long j2 = jArr[aw];
        long j3 = jArr2[aw];
        int i = aw + 1;
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

    /* renamed from: b */
    public final C3351az mo7324b(long j) {
        Pair d = m9854d(C2612ak.m6918A(C2612ak.m6994s(j, 0, this.f10422c)), this.f10421b, this.f10420a);
        long longValue = ((Long) d.first).longValue();
        C3365bc bcVar = new C3365bc(C2612ak.m6998w(longValue), ((Long) d.second).longValue());
        return new C3351az(bcVar, bcVar);
    }

    /* renamed from: e */
    public final long mo7377e() {
        return -1;
    }

    /* renamed from: f */
    public final long mo7378f(long j) {
        return C2612ak.m6998w(((Long) m9854d(j, this.f10420a, this.f10421b).second).longValue());
    }

    /* renamed from: r */
    public final long mo7325r() {
        return this.f10422c;
    }

    /* renamed from: t */
    public final boolean mo7326t() {
        return true;
    }
}
