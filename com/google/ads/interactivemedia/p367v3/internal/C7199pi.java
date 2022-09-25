package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.pi */
/* compiled from: PG */
final class C7199pi {

    /* renamed from: a */
    private final int f23474a = 112800;

    /* renamed from: b */
    private final aes f23475b = new aes(0);

    /* renamed from: c */
    private final aee f23476c = new aee();

    /* renamed from: d */
    private boolean f23477d;

    /* renamed from: e */
    private boolean f23478e;

    /* renamed from: f */
    private boolean f23479f;

    /* renamed from: g */
    private long f23480g = -9223372036854775807L;

    /* renamed from: h */
    private long f23481h = -9223372036854775807L;

    /* renamed from: i */
    private long f23482i = -9223372036854775807L;

    public C7199pi(int i) {
    }

    /* renamed from: e */
    private final void m21469e(C7050jv jvVar) {
        this.f23476c.mo14548b(aeu.f20471f);
        this.f23477d = true;
        jvVar.mo16097j();
    }

    /* renamed from: a */
    public final boolean mo16274a() {
        return this.f23477d;
    }

    /* renamed from: b */
    public final long mo16275b() {
        return this.f23482i;
    }

    /* renamed from: c */
    public final aes mo16276c() {
        return this.f23475b;
    }

    /* renamed from: d */
    public final int mo16277d(C7050jv jvVar, C7067kl klVar, int i) {
        if (i <= 0) {
            m21469e(jvVar);
            return 0;
        }
        long j = -9223372036854775807L;
        if (!this.f23479f) {
            long m = jvVar.mo16100m();
            int min = (int) Math.min(112800, m);
            long j2 = m - ((long) min);
            if (jvVar.mo16099l() != j2) {
                klVar.f22624a = j2;
                return 1;
            }
            this.f23476c.mo14547a(min);
            jvVar.mo16097j();
            jvVar.mo16094g(this.f23476c.mo14555i(), 0, min);
            aee aee = this.f23476c;
            int g = aee.mo14553g();
            int e = aee.mo14551e();
            while (true) {
                e--;
                if (e < g) {
                    break;
                } else if (aee.mo14555i()[e] == 71) {
                    long g2 = C7135mz.m21204g(aee, e, i);
                    if (g2 != -9223372036854775807L) {
                        j = g2;
                        break;
                    }
                }
            }
            this.f23481h = j;
            this.f23479f = true;
            return 0;
        } else if (this.f23481h == -9223372036854775807L) {
            m21469e(jvVar);
            return 0;
        } else if (!this.f23478e) {
            int min2 = (int) Math.min(112800, jvVar.mo16100m());
            if (jvVar.mo16099l() != 0) {
                klVar.f22624a = 0;
                return 1;
            }
            this.f23476c.mo14547a(min2);
            jvVar.mo16097j();
            jvVar.mo16094g(this.f23476c.mo14555i(), 0, min2);
            aee aee2 = this.f23476c;
            int g3 = aee2.mo14553g();
            int e2 = aee2.mo14551e();
            while (true) {
                if (g3 >= e2) {
                    break;
                }
                if (aee2.mo14555i()[g3] == 71) {
                    long g4 = C7135mz.m21204g(aee2, g3, i);
                    if (g4 != -9223372036854775807L) {
                        j = g4;
                        break;
                    }
                }
                g3++;
            }
            this.f23480g = j;
            this.f23478e = true;
            return 0;
        } else {
            long j3 = this.f23480g;
            if (j3 == -9223372036854775807L) {
                m21469e(jvVar);
                return 0;
            }
            this.f23482i = this.f23475b.mo14602f(this.f23481h) - this.f23475b.mo14602f(j3);
            m21469e(jvVar);
            return 0;
        }
    }
}
