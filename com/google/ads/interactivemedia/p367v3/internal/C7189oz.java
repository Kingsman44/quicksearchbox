package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.oz */
/* compiled from: PG */
final class C7189oz {

    /* renamed from: a */
    private final aes f23429a = new aes(0);

    /* renamed from: b */
    private final aee f23430b = new aee();

    /* renamed from: c */
    private boolean f23431c;

    /* renamed from: d */
    private boolean f23432d;

    /* renamed from: e */
    private boolean f23433e;

    /* renamed from: f */
    private long f23434f = -9223372036854775807L;

    /* renamed from: g */
    private long f23435g = -9223372036854775807L;

    /* renamed from: h */
    private long f23436h = -9223372036854775807L;

    /* renamed from: d */
    public static long m21436d(aee aee) {
        aee aee2 = aee;
        int g = aee.mo14553g();
        if (aee.mo14550d() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        aee2.mo14559m(bArr, 0, 9);
        aee2.mo14554h(g);
        byte b = bArr[0];
        if ((b & 196) == 68) {
            byte b2 = bArr[2];
            if ((b2 & 4) == 4) {
                byte b3 = bArr[4];
                if ((b3 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j = (long) b;
                    long j2 = (long) b2;
                    return ((j2 & 3) << 13) | ((j & 3) << 28) | (((56 & j) >> 3) << 30) | ((((long) bArr[1]) & 255) << 20) | (((j2 & 248) >> 3) << 15) | ((((long) bArr[3]) & 255) << 5) | ((((long) b3) & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: f */
    private final void m21437f(C7050jv jvVar) {
        this.f23430b.mo14548b(aeu.f20471f);
        this.f23431c = true;
        jvVar.mo16097j();
    }

    /* renamed from: g */
    private static final int m21438g(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    /* renamed from: a */
    public final boolean mo16260a() {
        return this.f23431c;
    }

    /* renamed from: b */
    public final aes mo16261b() {
        return this.f23429a;
    }

    /* renamed from: c */
    public final long mo16262c() {
        return this.f23436h;
    }

    /* renamed from: e */
    public final int mo16263e(C7050jv jvVar, C7067kl klVar) {
        long j = -9223372036854775807L;
        if (!this.f23433e) {
            long m = jvVar.mo16100m();
            int min = (int) Math.min(20000, m);
            long j2 = m - ((long) min);
            if (jvVar.mo16099l() != j2) {
                klVar.f22624a = j2;
                return 1;
            }
            this.f23430b.mo14547a(min);
            jvVar.mo16097j();
            jvVar.mo16094g(this.f23430b.mo14555i(), 0, min);
            aee aee = this.f23430b;
            int g = aee.mo14553g();
            int e = aee.mo14551e() - 4;
            while (true) {
                if (e < g) {
                    break;
                }
                if (m21438g(aee.mo14555i(), e) == 442) {
                    aee.mo14554h(e + 4);
                    long d = m21436d(aee);
                    if (d != -9223372036854775807L) {
                        j = d;
                        break;
                    }
                }
                e--;
            }
            this.f23435g = j;
            this.f23433e = true;
            return 0;
        } else if (this.f23435g == -9223372036854775807L) {
            m21437f(jvVar);
            return 0;
        } else if (!this.f23432d) {
            int min2 = (int) Math.min(20000, jvVar.mo16100m());
            if (jvVar.mo16099l() != 0) {
                klVar.f22624a = 0;
                return 1;
            }
            this.f23430b.mo14547a(min2);
            jvVar.mo16097j();
            jvVar.mo16094g(this.f23430b.mo14555i(), 0, min2);
            aee aee2 = this.f23430b;
            int g2 = aee2.mo14553g();
            int e2 = aee2.mo14551e();
            while (true) {
                if (g2 >= e2 - 3) {
                    break;
                }
                if (m21438g(aee2.mo14555i(), g2) == 442) {
                    aee2.mo14554h(g2 + 4);
                    long d2 = m21436d(aee2);
                    if (d2 != -9223372036854775807L) {
                        j = d2;
                        break;
                    }
                }
                g2++;
            }
            this.f23434f = j;
            this.f23432d = true;
            return 0;
        } else {
            long j3 = this.f23434f;
            if (j3 == -9223372036854775807L) {
                m21437f(jvVar);
                return 0;
            }
            this.f23436h = this.f23429a.mo14602f(this.f23435g) - this.f23429a.mo14602f(j3);
            m21437f(jvVar);
            return 0;
        }
    }
}
