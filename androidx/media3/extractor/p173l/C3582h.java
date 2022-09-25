package androidx.media3.extractor.p173l;

import androidx.media3.common.p136b.C2612ak;
import androidx.media3.extractor.C3351az;
import androidx.media3.extractor.C3364bb;
import androidx.media3.extractor.C3365bc;

/* renamed from: androidx.media3.extractor.l.h */
/* compiled from: PG */
final class C3582h implements C3364bb {

    /* renamed from: a */
    private final C3579e f11414a;

    /* renamed from: b */
    private final int f11415b;

    /* renamed from: c */
    private final long f11416c;

    /* renamed from: d */
    private final long f11417d;

    /* renamed from: e */
    private final long f11418e;

    public C3582h(C3579e eVar, int i, long j, long j2) {
        this.f11414a = eVar;
        this.f11415b = i;
        this.f11416c = j;
        long j3 = (j2 - j) / ((long) eVar.f11409d);
        this.f11417d = j3;
        this.f11418e = m10367d(j3);
    }

    /* renamed from: d */
    private final long m10367d(long j) {
        return C2612ak.m7000y(j * ((long) this.f11415b), 1000000, (long) this.f11414a.f11408c);
    }

    /* renamed from: b */
    public final C3351az mo7324b(long j) {
        long s = C2612ak.m6994s((((long) this.f11414a.f11408c) * j) / (((long) this.f11415b) * 1000000), 0, this.f11417d - 1);
        long j2 = this.f11416c;
        int i = this.f11414a.f11409d;
        long d = m10367d(s);
        C3365bc bcVar = new C3365bc(d, j2 + (((long) i) * s));
        if (d >= j || s == this.f11417d - 1) {
            return new C3351az(bcVar, bcVar);
        }
        long j3 = s + 1;
        return new C3351az(bcVar, new C3365bc(m10367d(j3), this.f11416c + (j3 * ((long) this.f11414a.f11409d))));
    }

    /* renamed from: r */
    public final long mo7325r() {
        return this.f11418e;
    }

    /* renamed from: t */
    public final boolean mo7326t() {
        return true;
    }
}
