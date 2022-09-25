package androidx.media3.extractor;

import androidx.media3.common.p136b.C2612ak;

/* renamed from: androidx.media3.extractor.i */
/* compiled from: PG */
public final class C3440i {

    /* renamed from: a */
    public final long f10609a;

    /* renamed from: b */
    public final long f10610b;

    /* renamed from: c */
    public long f10611c = 0;

    /* renamed from: d */
    public long f10612d;

    /* renamed from: e */
    public long f10613e;

    /* renamed from: f */
    public long f10614f;

    /* renamed from: g */
    public long f10615g;

    /* renamed from: h */
    private final long f10616h;

    protected C3440i(long j, long j2, long j3, long j4, long j5, long j6) {
        this.f10609a = j;
        long j7 = j2;
        this.f10610b = j7;
        long j8 = j3;
        this.f10612d = j8;
        long j9 = j4;
        this.f10613e = j9;
        long j10 = j5;
        this.f10614f = j10;
        long j11 = j6;
        this.f10616h = j11;
        this.f10615g = m9961a(j7, 0, j8, j9, j10, j11);
    }

    /* renamed from: a */
    protected static long m9961a(long j, long j2, long j3, long j4, long j5, long j6) {
        if (j4 + 1 >= j5 || 1 + j2 >= j3) {
            return j4;
        }
        long j7 = (long) (((float) (j - j2)) * (((float) (j5 - j4)) / ((float) (j3 - j2))));
        return C2612ak.m6994s(((j4 + j7) - j6) - (j7 / 20), j4, -1 + j5);
    }

    /* renamed from: b */
    public final void mo7399b() {
        this.f10615g = m9961a(this.f10610b, this.f10611c, this.f10612d, this.f10613e, this.f10614f, this.f10616h);
    }
}
