package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.qb */
/* compiled from: PG */
final class C7219qb implements C7070ko {

    /* renamed from: a */
    private final C7215py f23564a;

    /* renamed from: b */
    private final int f23565b;

    /* renamed from: c */
    private final long f23566c;

    /* renamed from: d */
    private final long f23567d;

    /* renamed from: e */
    private final long f23568e;

    public C7219qb(C7215py pyVar, int i, long j, long j2) {
        this.f23564a = pyVar;
        this.f23565b = i;
        this.f23566c = j;
        long j3 = (j2 - j) / ((long) pyVar.f23558d);
        this.f23567d = j3;
        this.f23568e = m21533d(j3);
    }

    /* renamed from: d */
    private final long m21533d(long j) {
        return aeu.m18496N(j * ((long) this.f23565b), 1000000, (long) this.f23564a.f23557c);
    }

    /* renamed from: a */
    public final boolean mo16074a() {
        return true;
    }

    /* renamed from: b */
    public final C7068km mo16075b(long j) {
        long I = aeu.m18491I((((long) this.f23564a.f23557c) * j) / (((long) this.f23565b) * 1000000), 0, this.f23567d - 1);
        long j2 = this.f23566c;
        int i = this.f23564a.f23558d;
        long d = m21533d(I);
        C7071kp kpVar = new C7071kp(d, j2 + (((long) i) * I));
        if (d >= j || I == this.f23567d - 1) {
            return new C7068km(kpVar, kpVar);
        }
        long j3 = I + 1;
        return new C7068km(kpVar, new C7071kp(m21533d(j3), this.f23566c + (j3 * ((long) this.f23564a.f23558d))));
    }

    /* renamed from: c */
    public final long mo16076c() {
        return this.f23568e;
    }
}
