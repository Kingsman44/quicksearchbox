package androidx.media3.exoplayer;

/* renamed from: androidx.media3.exoplayer.j */
/* compiled from: PG */
public final class C3192j {

    /* renamed from: a */
    public final float f9562a = 0.97f;

    /* renamed from: b */
    public final float f9563b = 1.03f;

    /* renamed from: c */
    public final long f9564c = 1000;

    /* renamed from: d */
    public final float f9565d = 1.0E-7f;

    /* renamed from: e */
    public final long f9566e;

    /* renamed from: f */
    public final long f9567f;

    /* renamed from: g */
    public final float f9568g;

    /* renamed from: h */
    public long f9569h;

    /* renamed from: i */
    public long f9570i;

    /* renamed from: j */
    public long f9571j;

    /* renamed from: k */
    public long f9572k;

    /* renamed from: l */
    public long f9573l;

    /* renamed from: m */
    public long f9574m;

    /* renamed from: n */
    public float f9575n;

    /* renamed from: o */
    public float f9576o;

    /* renamed from: p */
    public float f9577p;

    /* renamed from: q */
    public long f9578q;

    /* renamed from: r */
    public long f9579r;

    /* renamed from: s */
    public long f9580s;

    public C3192j(long j, long j2) {
        this.f9566e = j;
        this.f9567f = j2;
        this.f9568g = 0.999f;
        this.f9569h = -9223372036854775807L;
        this.f9570i = -9223372036854775807L;
        this.f9572k = -9223372036854775807L;
        this.f9573l = -9223372036854775807L;
        this.f9576o = 0.97f;
        this.f9575n = 1.03f;
        this.f9577p = 1.0f;
        this.f9578q = -9223372036854775807L;
        this.f9571j = -9223372036854775807L;
        this.f9574m = -9223372036854775807L;
        this.f9579r = -9223372036854775807L;
        this.f9580s = -9223372036854775807L;
    }

    /* renamed from: b */
    public static long m9352b(long j, long j2) {
        return (long) ((((float) j) * 0.999f) + (((float) j2) * 9.999871E-4f));
    }

    /* renamed from: a */
    public final void mo7199a() {
        long j = this.f9569h;
        if (j != -9223372036854775807L) {
            long j2 = this.f9570i;
            if (j2 != -9223372036854775807L) {
                j = j2;
            }
            long j3 = this.f9572k;
            if (j3 != -9223372036854775807L && j < j3) {
                j = j3;
            }
            long j4 = this.f9573l;
            if (j4 != -9223372036854775807L && j > j4) {
                j = j4;
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.f9571j != j) {
            this.f9571j = j;
            this.f9574m = j;
            this.f9579r = -9223372036854775807L;
            this.f9580s = -9223372036854775807L;
            this.f9578q = -9223372036854775807L;
        }
    }
}
