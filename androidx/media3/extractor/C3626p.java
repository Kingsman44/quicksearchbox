package androidx.media3.extractor;

/* renamed from: androidx.media3.extractor.p */
/* compiled from: PG */
public class C3626p implements C3364bb {

    /* renamed from: a */
    private final long f11557a;

    /* renamed from: b */
    private final long f11558b;

    /* renamed from: c */
    private final int f11559c;

    /* renamed from: d */
    private final long f11560d;

    /* renamed from: e */
    private final int f11561e;

    /* renamed from: f */
    private final long f11562f;

    /* renamed from: g */
    private final boolean f11563g;

    public C3626p(long j, long j2, int i, int i2, boolean z) {
        long e;
        this.f11557a = j;
        this.f11558b = j2;
        this.f11559c = i2 == -1 ? 1 : i2;
        this.f11561e = i;
        this.f11563g = z;
        if (j == -1) {
            this.f11560d = -1;
            e = -9223372036854775807L;
        } else {
            this.f11560d = j - j2;
            e = m10445e(j, j2, i);
        }
        this.f11562f = e;
    }

    /* renamed from: e */
    private static long m10445e(long j, long j2, int i) {
        return (Math.max(0, j - j2) * 8000000) / ((long) i);
    }

    /* renamed from: b */
    public final C3351az mo7324b(long j) {
        long j2 = this.f11560d;
        if (j2 == -1) {
            if (this.f11563g) {
                j2 = -1;
            } else {
                C3365bc bcVar = new C3365bc(0, this.f11558b);
                return new C3351az(bcVar, bcVar);
            }
        }
        int i = this.f11561e;
        long j3 = (long) this.f11559c;
        long j4 = (((((long) i) * j) / 8000000) / j3) * j3;
        if (j2 != -1) {
            j4 = Math.min(j4, j2 - j3);
        }
        long max = this.f11558b + Math.max(j4, 0);
        long d = mo7634d(max);
        C3365bc bcVar2 = new C3365bc(d, max);
        if (this.f11560d != -1 && d < j) {
            long j5 = max + ((long) this.f11559c);
            if (j5 < this.f11557a) {
                return new C3351az(bcVar2, new C3365bc(mo7634d(j5), j5));
            }
        }
        return new C3351az(bcVar2, bcVar2);
    }

    /* renamed from: d */
    public final long mo7634d(long j) {
        return m10445e(j, this.f11558b, this.f11561e);
    }

    /* renamed from: r */
    public final long mo7325r() {
        return this.f11562f;
    }

    /* renamed from: t */
    public final boolean mo7326t() {
        return this.f11560d != -1 || this.f11563g;
    }
}
