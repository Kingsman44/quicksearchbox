package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ju */
/* compiled from: PG */
public class C7049ju implements C7070ko {

    /* renamed from: a */
    private final long f22572a;

    /* renamed from: b */
    private final long f22573b;

    /* renamed from: c */
    private final int f22574c;

    /* renamed from: d */
    private final long f22575d;

    /* renamed from: e */
    private final int f22576e;

    /* renamed from: f */
    private final long f22577f;

    public C7049ju(long j, long j2, int i, int i2) {
        long e;
        this.f22572a = j;
        this.f22573b = j2;
        this.f22574c = i2 == -1 ? 1 : i2;
        this.f22576e = i;
        if (j == -1) {
            this.f22575d = -1;
            e = -9223372036854775807L;
        } else {
            this.f22575d = j - j2;
            e = m20896e(j, j2, i);
        }
        this.f22577f = e;
    }

    /* renamed from: e */
    private static long m20896e(long j, long j2, int i) {
        return (Math.max(0, j - j2) * 8000000) / ((long) i);
    }

    /* renamed from: a */
    public final boolean mo16074a() {
        return this.f22575d != -1;
    }

    /* renamed from: b */
    public final C7068km mo16075b(long j) {
        long j2 = this.f22575d;
        if (j2 != -1) {
            int i = this.f22576e;
            long j3 = (long) this.f22574c;
            long I = this.f22573b + aeu.m18491I((((((long) i) * j) / 8000000) / j3) * j3, 0, j2 - j3);
            long y = mo16088y(I);
            C7071kp kpVar = new C7071kp(y, I);
            if (y < j) {
                long j4 = I + ((long) this.f22574c);
                if (j4 < this.f22572a) {
                    return new C7068km(kpVar, new C7071kp(mo16088y(j4), j4));
                }
            }
            return new C7068km(kpVar, kpVar);
        }
        C7071kp kpVar2 = new C7071kp(0, this.f22573b);
        return new C7068km(kpVar2, kpVar2);
    }

    /* renamed from: c */
    public final long mo16076c() {
        return this.f22577f;
    }

    /* renamed from: y */
    public final long mo16088y(long j) {
        return m20896e(j, this.f22573b, this.f22576e);
    }
}
